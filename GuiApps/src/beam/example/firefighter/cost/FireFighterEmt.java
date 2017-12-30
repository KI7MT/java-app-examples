package beam.example.firefighter.cost;

/**
 * FireFighterEmt.java<br>
 * EMT Fire Fighter Class, extends FirstResponder<br>
 * Repository git@github.com:KI7MT/java-app-examples.git
 *
 * @author	Greg Beam
 * @version	1.2
 * @since	30-DEC-2017
 *
 */

public class FireFighterEmt extends FirstResponder
{
	private double emtKitCost;
	
	/**
	 *  Constructor for FireFighterEmt
	 *  
	 * @param firstName first name of fire fighter
	 * @param lastName last name of fire fighter
	 * @param ppeCost personal protect cost
	 * @param radioCost cost of radio
	 * @param pagerCost cost of pager
	 * @param emtKitCost cost of EMT kit
	 */
	public FireFighterEmt(
			String firstName,
			String lastName,
			double ppeCost,
			double radioCost,
			double pagerCost,
			double emtKitCost
			)
	{
		super(firstName, lastName, ppeCost, radioCost, pagerCost);
		this.emtKitCost = emtKitCost;
	}

	/**
	 * Method: implements Interface Expense calculateExpense()
	 */
	@Override
	public double calculateExpense()
	{
		double total = 0;

		total += getPpeCost();
		total += getRadioCost();
		total += getPagerCost();
		total += emtKitCost;
		
		return total;
	}

	/**
	 * 
	 * @return EMT Kit Cost
	 */
	public double getEmtKitCost()
	{
		return emtKitCost;
	}

	public void setEmtKitCost(double emtKitCost)
	{
		this.emtKitCost = emtKitCost;
	}

	/**
	 * ToString method to print class data
	 */
	@Override
	public String toString()
	{
		String s = String.format("%-13s $%-20.2f", "EMT Kit :", getEmtKitCost());
		String e = String.format("%-12s $%-20.2f", "SubTotal :", calculateExpense());
		return (super.toString() + "\n" + s +  "\n" + e);		
	}
	
} /* END - Fire Fighter EMT Class */
