/**
 * Flight class representing flight details and priorities .
 *
 * @author Franklyn Oliha Student Number: 1611857 Date: 20/11/21
 */
public class Flight implements Comparable<Flight> {

	// Attributes
	private String flightID;
	private Integer priority;

	// Default constructor
	public Flight() {
		flightID = "";
		priority = 0;
	}

	// Parameter Constructor
	public Flight(String flightID, Integer priority) {
		this.flightID = flightID;
		this.priority = priority;
	}
	// Getters and setters

	public String getFlightID() {
		return flightID;
	}

	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	// Convert all to String
	public String toString() {
		return ("[Flight ID: " + flightID + " Priority: " + priority + " ] ");
	}

	// Invoking comparable to compare priority
	public int compareTo(Flight f) {

		if (f == null)
			return 1;
		else

		if (this.priority.compareTo(f.priority) == 1) {
			return -1;
		} else if (this.priority.compareTo(f.priority) == -1) {
			return 1;
		} else {
			return 0;
		}
	}

}
