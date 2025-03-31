class NewState implements Runnable {
    @Override
    public void run() {
    }
}

class DemoBlockedRunnable implements Runnable {
    @Override
    public void run() {
        commonResource();
    }
    
    public static synchronized void commonResource() {
        while (true) {
        }
    }
}

class WaitingState implements Runnable {
    public static Thread t1;

    @Override
    public void run() {
        t1 = new Thread(new DemoWaitingStateRunnable());
        t1.start();
    }
}

class DemoWaitingStateRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        
        System.out.println("Estado de t1 (WAITING): " + WaitingState.t1.getState());
    }
}

class DemoTimeWaitingRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

class TerminatedState implements Runnable {
    @Override
    public void run() {
    }
}
public class CicloDeVidaHilos {
    public static void main(String[] args) throws InterruptedException {
        //NEW
        Runnable runnable1 = new NewState();
        Thread t1 = new Thread(runnable1);
        System.out.println("Estado de t1 (NEW): " + t1.getState());

        //RUNNABLE
        t1.start();
        System.out.println("Estado de t1 (despues de start): " + t1.getState());

        //BLOCKED
        Thread t2 = new Thread(new DemoBlockedRunnable());
        Thread t3 = new Thread(new DemoBlockedRunnable());
        
        t2.start();
        t3.start();
        
        Thread.sleep(1000);
        System.out.println("Estado de t3 (BLOCKED): " + t3.getState());

        //WAITING
        Thread t4 = new Thread(new WaitingState());
        t4.start();
        
      
        t4.join();

        //TIMED_WAITING
        DemoTimeWaitingRunnable runnable2 = new DemoTimeWaitingRunnable();
        Thread t5 = new Thread(runnable2);
        t5.start();
        
        Thread.sleep(1000);
        System.out.println("Estado de t5 (TIMED_WAITING): " + t5.getState());

        //TERMINATED
        Thread t6 = new Thread(new TerminatedState());
        t6.start();
        Thread.sleep(1000);
        System.out.println("Estado de t6 (TERMINATED): " + t6.getState());
    }
}

