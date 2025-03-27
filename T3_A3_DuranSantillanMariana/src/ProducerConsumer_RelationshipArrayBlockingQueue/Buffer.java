package ProducerConsumer_RelationshipArrayBlockingQueue;

//Buffer interface specifies methods called by Producer and Consumer
public interface Buffer {

	//place int value into Buffer
	public void set (int value) throws InterruptedException;
	
	//returnint value from Buffer
	public int get () throws InterruptedException;
	
}//public class
