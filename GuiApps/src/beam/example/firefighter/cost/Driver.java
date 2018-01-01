package beam.example.firefighter.cost;

/**
 * <h1>Fire Fighter Cost Calculator</h1>
 * 
 * Driver for Calculating / Estimating Fire Fighter Costs<br>
 * Repository git@github.com:KI7MT/java-app-examples.git
 * 
 * <ul>
 * 	<li>Driver has user inputs, a loop, switch, and random number generator
 *  <li>Station generates an ArrayList by stationName, addResponder and loopReponders methods
 *  <li>Expense Interface adds calculateExpense() method
 *  <li>FirstResponder Implements Expense (has-a) Expense
 *  <li>FireFighter adds 3 different Fire Fighter types (is-a) FirstResponder
 *  <li>Data validation with pop-up message for all fields
 * </ul>
 * 
 * <h2>Build Details</h2>
 * <ol>
 *  <li>Uses (<strong>7</strong>) classes, only (<strong>4</strong>) required
 *  <li>Calls all methods in extended classes
 *  <li>FireFighter* extends FirstResponder class
 *  <li>FireFighter* overrides FirstResponder calculateCost() method
 *  <li>Station (has-a) expense through FireFighter* and FirstResponder classes
 *  <li>Expense is the Interface, implemented through FirstResponder class
 *  <li>Station ArrayList (responders) holds the FireFighter* objects
 *  <li>User interaction requires multiple input items
 *  <li>Cost calculation, SubTotal and Grand Total are performed by the Station Class
 *  <li>All ToString use String.format("") type
 * </ol>
 * 
 * @author	Greg Beam
 * @version	1.2
 * @since	30-DEC-2017
 *
 */
import java.util.Scanner;
import java.util.Random;

public class Driver
{
	/**
	 * Method: Main, set Station Name, number of Responders, first and last names
	 * of each responder, then call Station.loopResponders() to print the total costs.
	 * 
	 * @param args none
	 */
	public static void main(String[] args)
	{
		// station variables
		String stationName;

		// fire fighter variables
		String fName;
		String lName;
		String ffType;
		double ppeEmt = 350.00;
		double ppeStructure = 2200.00;
		double ppeWildland = 650.00;
		double chainSaw = 450.00;
		double emtKit = 1200.00;
		double toolKit = 175.00 ;
		double radio = 1200.00;
		double pager = 125.00;

		// loop counter
		int ffCount;
		
		// start the scanner
		Scanner input = new Scanner(System.in);

		// start user input
		System.out.println("Fire Fighter Cost Estimator\n");
		
		// enter the name of the station to add fire fighters too
		System.out.print("Fire Station Name........: ");
		stationName = input.nextLine();
		
		// instantiate Station class, creates ArrayList responders, enables
		// add and loop methods and sets the station name of the Object
		// to: stationName
		Station station = new Station(stationName);
		
		// how many fire fighters to add to ArrayList<Station> stationName 
		System.out.print("Number of Fire Fighters..: ");
		ffCount = input.nextInt();
		input.nextLine();
		System.out.print("USE 1 = EMT, 2 = Structure, 3 = Wildland\n");
		System.out.println();
		
		// start fire fighter entry loop
		for (int counter = 0; counter < ffCount; counter++) 
		{
			// eye-candy: random number generator for FF number
			System.out.printf("Fire Fighter Number..: %s%n", ranInt(1000,50000));
			
			// fire fighter first name
			System.out.print("First Name ..........: ");
			fName = input.next();
			input.nextLine();

			// fire fighter last name
			System.out.print("Last Name ...........: ");
			lName= input.next();
			input.nextLine();
			
			// type of fire fighter
			System.out.print("FF-Type (1, 2, or 3) : ");
			ffType = input.next();
			input.nextLine();
			
			// switch for Hourly, Salary, and Commission based on empType
			switch (ffType)
			{
				case "1": // Fire Fighter EMT
					FireFighterEmt emt = new FireFighterEmt(
							fName,
							lName,
							ppeEmt,
							radio,
							pager,
							emtKit);

					// add object to responders array list
					station.addResponder(emt);
					
					break;
			
				case "2": // Fire Fighter Structure
					FireFighterStructure structure = new FireFighterStructure(
							fName,
							lName,
							ppeStructure,
							radio,
							pager,
							toolKit);

					// add object to responders array list
					station.addResponder(structure);
				
					break;

				case "3": // Fire Fighter Wildland
					FireFighterWildland wildland = new FireFighterWildland(
							fName,
							lName,
							ppeWildland,
							radio,
							pager,
							chainSaw);

					// add object to responders array list
					station.addResponder(wildland);
					
					break;
				
			} // END - Case switch
			System.out.println(""); // separates entries
			
		} // END - Entry Loop

		// close the scanner to prevent resource leaks
		input.close();
		
		// call Station.loopResponders() to print the data
		station.loopResponder();
		
	} /* END - Main Method */

	//--------------------------------------------------------------------------------------//
	// General Purpose Methods
	//--------------------------------------------------------------------------------------//

	/**
	 * Method: generates a random number. Used for fire fighter badge number (eye-candy).
	 * 
	 * @param min number
	 * @param max number
	 * @return random number for fire fighter number
	 */
	private static int ranInt(int min, int max)
	{
		Random rand = new Random();
		return rand.nextInt((max - min) + 1);

	} /* END - Random number generator method */

} /* END - Driver Class */