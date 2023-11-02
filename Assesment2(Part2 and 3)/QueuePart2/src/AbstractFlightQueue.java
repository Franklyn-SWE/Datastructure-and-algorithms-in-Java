/**
 * Flight queue abstract class 
 *
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/11/21
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class AbstractFlightQueue {
	
	// attribute 
	protected  LinkedList <Object>flights = new LinkedList <Object>();
	
	// ABSTRACT METHODS:
	
	

	// Add flights 
	public void joinQueue(Flight f ){
		flights.add(f);
	}
	
	// Land flights 
	public void landFlight(){
		flights.removeFirst();
	}
	

	
}
