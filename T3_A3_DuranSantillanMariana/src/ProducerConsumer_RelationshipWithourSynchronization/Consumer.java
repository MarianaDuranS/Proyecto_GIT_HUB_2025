package ProducerConsumer_RelationshipWithourSynchronization;

//Consumer with a run method thats loops, reading 10 values from buffer
import java.util.Random;

public class Consumer implements Runnable{

	private final static Random generator = new Random();
	private final Buffer sharedLocation; //Reference to shared object
	
	public Consumer (Buffer shared) { sharedLocation = shared; }
	
	//read sharedLocation´s value 10 times and sum the values
	@Override
	public void run() {
		
		int sum = 0;
		
		for( int count = 1; count <= 10; count ++) {
			//sleep 0 to 3 seconds, read value from buffer and add to sum
			try {
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocation.get();
				System.out.printf("\t\t\t%2d\n", sum );
			}
			catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}//for
		
		System.out.printf("\n%s %d\n%s\n", "Consumer read values totaling", sum, "Terminating Consumer");
		
	}//run

}//public class
