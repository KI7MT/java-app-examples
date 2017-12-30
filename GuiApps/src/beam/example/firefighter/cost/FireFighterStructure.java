package beam.example.firefighter.cost;

/**
 * FireFighterStructure.java<br>
 * Structure Fire Fighter Class, extends FirstResponder<br>
 * Repository git@github.com:KI7MT/java-app-examples.git
 *
 * @author	Greg Beam
 * @version	1.2
 * @since	30-DEC-2017
 *
 */

public class FireFighterStructure extends FirstResponder
{
	private double toolKitCost;

	/**
	 * Constructor for Structure Fire Fighter
	 * 
	 * @param firstName first name of fire fighter
	 * @param lastName last name of fire fighter
	 * @param ppeCost personal protect cost
	 * @param radioCost cost of radio
	 * @param pagerCost cost of pager
	 * @param toolKitCost cost of tool kit
	 */
	public FireFighterStructure(
			String firstName,
			String lastName,
			double ppeCost,
			double radioCost,
			double pagerCost,
			double toolKitCost
			)
	{
		super(
				firstName,
				lastName,
				ppeCost,
				radioCost,
				pagerCost
				);
		this.toolKitCost = toolKitCost;
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
		total += toolKitCost;
		
		return total;
	}
	
	/**
	 * 
	 * @return Tool Kit Cost
	 */
	public double getToolKitCost()
	{
		return toolKitCost;
	}

	/**
	 * 
	 * @param toolKitCost tool kit cost
	 */
	public void setToolKitCost(double toolKitCost)
	{
		this.toolKitCost = toolKitCost;
	}

	/**
	 * ToString method to print class data
	 */
	@Override
	public String toString()
	{
		String s = String.format("%-15s $%-20.2f", "Tools :", getToolKitCost());
		String e = String.format("%-12s $%-20.2f", "SubTotal :", calculateExpense());
		return (super.toString() + "\n" + s +  "\n" + e);
		
	}
	
} /* END - Fire Fighter EMT Class */
