import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class Cuenta {
    private BigDecimal balance;
    public final Lock lock = new ReentrantLock();

    public Cuenta(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }
}

public class BloqueosJava {
    private static final Object sameHashCodeLock = new Object();

    public static void transferFunds(Cuenta fromAccount, Cuenta toAccount, BigDecimal amount) {
        int fromHash = System.identityHashCode(fromAccount);
        int toHash = System.identityHashCode(toAccount);

        if (fromHash < toHash) {
            synchronized (fromAccount) {
                System.out.println(Thread.currentThread().getName() + " adquirio bloqueo en " + fromAccount);
                synchronized (toAccount) {
                    transfer(fromAccount, toAccount, amount);
                }
            }
        } else if (fromHash > toHash) {
            synchronized (toAccount) {
                System.out.println(Thread.currentThread().getName() + " adquirio bloqueo en " + toAccount);
                synchronized (fromAccount) {
                    transfer(fromAccount, toAccount, amount);
                }
            }
        } else {
            synchronized (sameHashCodeLock) {
                synchronized (fromAccount) {
                    System.out.println(Thread.currentThread().getName() + " adquirio bloqueo en " + fromAccount);
                    synchronized (toAccount) {
                        transfer(fromAccount, toAccount, amount);
                    }
                }
            }
        }
    }

    public static void transfer(Cuenta fromAccount, Cuenta toAccount, BigDecimal amount) {
        if (fromAccount.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Fondos insuficientes.");
        } else {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println(Thread.currentThread().getName() + " transferido $" + amount + " de " + fromAccount + " a " + toAccount);
        }
    }

    public static void transferFundsWithTimeout(Cuenta fromAccount, Cuenta toAccount, BigDecimal amount) {
        while (true) {
            try {
                if (fromAccount.lock.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        if (toAccount.lock.tryLock(1, TimeUnit.SECONDS)) {
                            try {
                                transfer(fromAccount, toAccount, amount);
                                return; 
                            } finally {
                                toAccount.lock.unlock();
                            }
                        }
                    } finally {
                        fromAccount.lock.unlock();
                    }
                }
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Transferencia interrumpida", e);
            }
        }
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(BigDecimal.valueOf(1000));
        Cuenta cuenta2 = new Cuenta(BigDecimal.valueOf(500));

        Thread hilo1 = new Thread(() -> transferFunds(cuenta1, cuenta2, BigDecimal.valueOf(500)));
        Thread hilo2 = new Thread(() -> transferFunds(cuenta2, cuenta1, BigDecimal.valueOf(300)));

        hilo1.start();
        hilo2.start();

        Thread hilo3 = new Thread(() -> transferFundsWithTimeout(cuenta1, cuenta2, BigDecimal.valueOf(200)));
        Thread hilo4 = new Thread(() -> transferFundsWithTimeout(cuenta2, cuenta1, BigDecimal.valueOf(100)));

        hilo3.start();
        hilo4.start();
    }
}
