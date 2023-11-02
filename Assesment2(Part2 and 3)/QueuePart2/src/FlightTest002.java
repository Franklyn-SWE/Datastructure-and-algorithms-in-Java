/**
 * Flight Test 002:  A class to test priority flights based on priority 
 * from highest to lowest. Also  to insert a flight to the queue using iteration.
 * 
 * @author Franklyn Oliha
 * Student Number: 1611857
 *
 */
public class FlightTest002 {
			
	
	public static void main(String[] args) {
			
        NormalFlightQueue nq = new NormalFlightQueue();
		
		PriorityFlightQueue1 pfq1 = new PriorityFlightQueue1();
		
		PriorityFlightQueue2 pfq2 = new PriorityFlightQueue2();
		
		
		// Creating flights
		Flight f1 = new Flight ("BA 082", 1);
		Flight f2 = new Flight ("BA 081", 2);
		Flight f3 = new Flight ("BA 083", 3);
		Flight f4 = new Flight ("BA 0573", 4);
		Flight f5 = new Flight ("BA 0903", 5);
		
		System.out.println("Flights added in normal queue");
		System.out.println("------------------------------");
		
		// adding flights to the queue normally 
		nq.joinQueue(f1);
		nq.joinQueue(f2);
		nq.joinQueue(f3);
		nq.joinQueue(f4);
		nq.joinQueue(f5);
		
		// Display flight in normal queue
		nq.display();
		
		
	System.out.println();
	System.out.println();
		

		// adding flights  to priority queue
		pfq2.joinQueue(f5);
		pfq2.joinQueue(f1);
		pfq2.joinQueue(f4);
		pfq2.joinQueue(f2);
		pfq2.joinQueue(f3);
		
		// printing flights based on priority ( 5 - 1)
		pfq2.sort();
		System.out.println();
		
		// Adding a flight to the back of the queue
	    pfq2.addByIterating(f5);
		
		

		}

	}



