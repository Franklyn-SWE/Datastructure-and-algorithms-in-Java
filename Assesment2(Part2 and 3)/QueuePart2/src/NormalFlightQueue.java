/**
 * Normal Flight queue class with all the flight queue fields and methods
 *
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/11/21
 */
import java.util.LinkedList;
import java.util.ListIterator;


public class NormalFlightQueue extends AbstractFlightQueue {
	
	
	private LinkedList<Object> queue = new LinkedList<Object>();
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public void add(Object obj){
		queue.add(obj);
	}
	
	public Object remove(){
		if(queue.isEmpty())
			return null;
		else
			return queue.removeFirst();
	}
	

	public int size(){
		return queue.size();
	}
	
	// Display list of flights in queue
		 public void display () {
			 for (int i = 0; i < flights.size(); i++) {
				 System.out.println(flights.get(i));
			 }
		 }
			 
}

	
