package ProducerConsumer_RelationshipWithourSynchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest {

	public static void main (String [] args) {
		
		//create new thread pool with two threads
		ExecutorService application = Executors.newCachedThreadPool();
		
		//create unsynchronizedBuffer to store ints
		Buffer sharedLocation = new UnsynchronizedBuffer();
		
		System.out.println("Action\t\tValue\tSum of Produced\tSum of Consumed");
		
		System.out.println("------\t\t-----\t---------------\t---------------\n");
		
		//execute the Producer and Consumer, giving each of them acess to sharedLocation
		
		application.execute(new Producer (sharedLocation));
		application.execute(new Consumer (sharedLocation));
		
		application.shutdown();
		
	}//void main
	
}//public class
