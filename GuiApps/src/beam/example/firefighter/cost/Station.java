/**
 * Station.jaca<br>
 * Class provides for a Station name, ArrayList, add and loop methods for responders<br>
 * Repository git@github.com:KI7MT/java-app-examples.git
 *
 * @author	Greg Beam
 * @version	1.2
 * @since	30-DEC-2017
 *
 */
package beam.example.firefighter.cost;

import java.util.ArrayList;

public class Station
{
	// class variables, responders is the array name, stationName is for the station
	private String stationName;
	private ArrayList<FirstResponder> responders = new ArrayList<>();

	/**
	 * Constructor: sets the station name 
	 *
	 * @param stationName name of the fire station
	 */
	Station(String stationName)
	{
		this.stationName = stationName;
	}

	/**
	 * Method: Add a FirstResponder to the responders array list
	 *
	 * @param responder name of the array list
	 */
	void addResponder(FirstResponder responder)
	{
		responders.add(responder);
	}

	/**
	 * 
	 * @return the responders ArrayList
	 */
	ArrayList<FirstResponder> getResponders()
	{
		return responders;
	}

	/**
	 * 
	 * @return Station Name
	 */
	String getStationName()
	{
		return stationName;
	}

	/**
	 * Method: Loop through the responders array list and print Objects ToStrings
	 * for each FirstResponder 
	 */
	void loopResponder()
	{
		double grandTotal = 0;
		
		// loop through array list of responders
		for (FirstResponder responder : responders)
		{
			System.out.println("Station Name..: " + stationName);
			System.out.println(responder.toString());
			grandTotal += responder.calculateExpense();
			System.out.println();
		}
	
		// print the summary for all added Fire Fighters
		System.out.printf("Grand Total....: %.2f", grandTotal);
		
	} /* END - Loop for Responders Array */

	@Override
	public String toString()
	{
		String s = String.format("%-14s %-20s", "Station :", stationName);
		return (s);
	}
	
} /* END - Station Class */
