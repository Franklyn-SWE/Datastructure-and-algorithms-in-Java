import java.util.ListIterator;

/** Priority Flight Queue 2: Adding flight  by iterating through the sorted loop
 * to find the correct point at which to insert the flight into the linked list of flight.
 * 
 * @author Franklyn Oliha
 * Student Number: 1611857
 */

public class PriorityFlightQueue2  extends AbstractFlightQueue {
	
	
	public void sort() {
		//Print the details before sorting
		System.out.println();
		System.out.println("The PriorityFlightQueue");
		System.out.println("__________________________________________");
		System.out.println();
		System.out.println("Before Sorting: " );
		System.out.println();
		for (int i = 0; i< flights.size(); i++) {
		System.out.println(flights.get(i));
		}
		//sort the Linkedlist
		flights.sort(null);
		//print the details after sorting
		System.out.println("__________________________________________");
		System.out.println();
		System.out.println("After Sorting: ");
		System.out.println();
		for (int i = 0; i< flights.size(); i++) {
		System.out.println(flights.get(i));
		}
		System.out.println("__________________________________________");
		}
	
	/**
	* Add by iterating through the sorted loop to find the correct
	* point at which to insert the flight into the linked list.
	* 
	*/
	public void addByIterating(Flight f) {
	//ListIterator<Flight> iterator = flights.listIterator();
	ListIterator iterator = flights.listIterator();
	
	System.out.println("After adding a new Flight: ");
	System.out.println();
	while(iterator.hasNext() == true)//loops through the iterator if the condition is true
	{
	Flight fl = (Flight) iterator.next();
	if (fl.compareTo(f) > 0)  //checks the compareTo if the condition is true
	{
	iterator.previous();
	iterator.add(f);
	printList();
	break;//jumps out of the loop if its finished iterating
	}
	if (iterator.hasNext() == false)//checks iterator if the condition is true
	{
	iterator.add(f);
	printList();
	break;//jumps out of the loop if its finished iterating
	}
	}
	}
	
	// print LinkedList
	

	private void printList() {
		for (int x = 0; x < flights.size(); x++) {
			System.out.println(flights.get(x));
		}
		
		
	}
	public void add(Flight f) {
		flights.addLast(f);
	}

}
