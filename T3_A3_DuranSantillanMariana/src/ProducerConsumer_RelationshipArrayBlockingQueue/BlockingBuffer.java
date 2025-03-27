package ProducerConsumer_RelationshipArrayBlockingQueue;

//creating a synchronized buffer using an ArrayBlockingQueue
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer{

	private final ArrayBlockingQueue<Integer> buffer; //shared buffer
	
	public BlockingBuffer() {buffer = new ArrayBlockingQueue<Integer>(1);}

	//place value into buffer
	@Override
	public void set(int value) throws InterruptedException {
		buffer.put(value); //place value in buffer
		System.out.printf("%s%2d\t%s%d\n", "Producer writes ", value, "Buffer cells occupied: ", buffer.size());
	}//Set

	//return value from buffer
	@Override
	public int get() throws InterruptedException {
		int readValue = buffer.take(); //remove value from buffer
		System.out.printf("%s %2d\t%s%d\n", "Consumer reads ",readValue, "Buffer cells occupied: ", buffer.size());
		
		return readValue;
	}//Get
	
}//public class
