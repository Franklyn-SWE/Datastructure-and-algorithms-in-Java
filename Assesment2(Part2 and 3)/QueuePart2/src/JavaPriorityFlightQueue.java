import java.util.PriorityQueue;

/**
* Priority Flight Queue2 
*
* @author Franklyn Oliha
* Student Number: 1611857
* Date: 20/11/21
*/

public class JavaPriorityFlightQueue extends AbstractFlightQueue{
	
	private PriorityQueue <Object>flights = new PriorityQueue<Object>();
	
	
	public void display() {
		for (Object  a : flights ) {
			System.out.println(a);
		}
	}

}
