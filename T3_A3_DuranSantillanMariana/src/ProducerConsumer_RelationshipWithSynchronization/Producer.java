package ProducerConsumer_RelationshipWithSynchronization;

import java.util.Random;

//Producer with a run method that insterts the values 1 to 10 in buffer
public class Producer implements Runnable{

	private final static Random generator = new Random();
	private final Buffer sharedLocation; //reference to shared object
	
	//constructor
	public Producer (Buffer shared) {sharedLocation = shared;}
	
	@Override
	public void run() {
		int sum = 0;
		
		for (int count = 1; count <= 10; count ++) {
			try { //sleep 0 to 3 seconds, then place value in Buffer
				Thread.sleep(generator.nextInt (3000)); //Random sleep
				sharedLocation.set(count); //set value in buffer
				sum += count; //increment sum of values
				System.out.printf("\t%2d\n", sum);
			}
			catch(InterruptedException exception){
				exception.printStackTrace();
			}//try catch
		}//For
		
		System.out.println("Producer done producing\nTerminating Producer");
		
	}//run

}//public class


