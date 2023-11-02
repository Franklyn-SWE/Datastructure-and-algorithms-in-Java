import java.util.LinkedList;
import java.util.Collections;	
/**
 * Priority Flight Queue 1. This class add flights to the back of the queue and sort whole 
 * queue using sort method.
 * 
 * @author Franklyn Oliha
 * Student Number: 1611857
 */	
	public class PriorityFlightQueue1 extends AbstractFlightQueue{

		public void add(Flight f) {
		flights.addLast(f);



		//Print the details before sorting using iteration 
		
		System.out.println("Before Sorting: " );
		System.out.println();
		
		for (int i = 0; i<flights.size();i++) {
			System.out.println(flights.get(i));
		}


		//sort the Linkedlist
		
		flights.sort(null);
	
	

		//print the details after sorting
		System.out.println("Priority queue 1");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("After Sorting: ");
		System.out.println();
		
		for (int i = 0; i< flights.size(); i++ ) {
			
			System.out.println(flights.get(i));
		}

	
		
		}

	
	
	}
	
	

	
	
	

	


	
	













		
	
	
	
	
	
	

	
	
	

	

