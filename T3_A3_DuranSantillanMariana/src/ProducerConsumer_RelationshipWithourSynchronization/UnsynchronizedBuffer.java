package ProducerConsumer_RelationshipWithourSynchronization;

//UnsynchronizedBuffer maintains the shared interger that is accessed by a producer thread and a condumer thread via methods set and get
public class UnsynchronizedBuffer implements Buffer{

	private int buffer = -1; //shared by producer and consumer threads
	
	//place value into buffer
	@Override
	public void set(int value) throws InterruptedException {
		System.out.printf("Producer writes\t%2d", value);
		buffer = value;
	}//set

	//return value from buffer
	@Override
	public int get() throws InterruptedException {
		System.out.printf( "Consumer reads\t%2d", buffer );
		return buffer;
	}//get

}//public class
