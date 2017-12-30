package beam.example.firefighter.cost;

/**
 * FireFighterWildland.java<br>
 * Wildland Fire Fighter Class, extends FirstResponder<br>
 * Repository git@github.com:KI7MT/java-app-examples.git
 *
 * @author	Greg Beam
 * @version	1.2
 * @since	30-DEC-2017
 *
 */
public class FireFighterWildland extends FirstResponder
{
	private double chainSawCost;

	/**
	 * Constructor for FireFighterWildland
	 * 
	 * @param firstName first name of fire fighter
	 * @param lastName last name of fire fighter
	 * @param ppeCost personal protect cost
	 * @param radioCost cost of radio
	 * @param pagerCost cost of pager
	 * @param chainSawCost cost of chain saw
	 */
	public FireFighterWildland(
			String firstName,
			String lastName,
			double ppeCost,
			double radioCost,
			double pagerCost,
			double chainSawCost
			)
	{
		super(
				firstName,
				lastName,
				ppeCost,
				radioCost,
				pagerCost
				);
		this.chainSawCost = chainSawCost;
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
		total += chainSawCost;
		
		return total;
	}
	
	/**
	 * 
	 * @return Chain Saw COst
	 */
	public double getChainSawCost()
	{
		return chainSawCost;
	}

	/**
	 * 
	 * @param chainSawCost cost of chain saw
	 */
	public void setChainSawCost(double chainSawCost)
	{
		this.chainSawCost = chainSawCost;
	}

	/**
	 * ToString method to print class data
	 */
	@Override
	public String toString()
	{
		String s = String.format("%-15s $%-20.2f", "Saw :", getChainSawCost());
		String e = String.format("%-12s $%-20.2f", "SubTotal :", calculateExpense());
		return (super.toString() + "\n" + s +  "\n" + e);
	}
	
} /* END - Fire Fighter EMT Class */
