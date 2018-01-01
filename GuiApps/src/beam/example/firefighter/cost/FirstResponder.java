package beam.example.firefighter.cost;

/**
 * FirstResponderse.java<br>
 * Abstract class for First Responders, implements Expense Interface<br>
 * Repository git@github.com:KI7MT/java-app-examples.git
 *
 * @author	Greg Beam
 * @version	1.2
 * @since	30-DEC-2017
 *
 */

public abstract class FirstResponder implements Expense
{
	private String firstName;
	private String lastName;
	private double ppeCost;
	private double radioCost;
	private double pagerCost;

	/**
	 * Constructor for First Responder
	 * 
	 * @param firstName first name of responder
	 * @param lastName last name of responder
	 * @param ppeCost personal protect cost
	 * @param radioCost cost of radio
	 * @param pagerCost cost of pager
	 */
	public FirstResponder(
			String firstName,
			String lastName,
			double ppeCost,
			double radioCost,
			double pagerCost
			)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ppeCost = ppeCost;
		this.radioCost = radioCost;
		this.pagerCost = pagerCost;
	}

	/**
	 * 
	 * @return first name
	 */
	String getFirstName()
	{
		return firstName;
	}

	/**
	 * 
	 * @param firstName first name of responder
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return last name last name of responder
	 */
	String getLastName()
	{
		return lastName;
	}

	/**
	 * 
	 * @param lastName last name of responder
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return PPE cost
	 */
	double getPpeCost()
	{
		return ppeCost;
	}

	/**
	 * 
	 * @param ppeCost personal protection gear costs
	 */
	public void setPpeCost(double ppeCost)
	{
		this.ppeCost = ppeCost;
	}

	/**
	 * 
	 * @return Radio cost
	 */
	double getRadioCost()
	{
		return radioCost;
	}

	/**
	 * 
	 * @param radioCost cost of radio
	 */
	public void setRadioCost(double radioCost)
	{
		this.radioCost = radioCost;
	}

	/**
	 * 
	 * @return Pager Cost
	 */
	double getPagerCost()
	{
		return pagerCost;
	}

	/**
	 * 
	 * @param pagerCost cost of pager
	 */
	public void setPagerCost(double pagerCost)
	{
		this.pagerCost = pagerCost;
	}

	/**
	 * ToString override, format output
	 * 
	 */
	@Override
	public String toString()
	{
		String t = String.format("%-15s %-20s", "Type :", getClass().getSimpleName());
		String n = String.format("%-12s %-20s", "Name :", getFirstName() + " " + getLastName());
		String p = String.format("%-15s $%-20.2f", "PPE :", getPpeCost());
		String r = String.format("%-14s $%-20.2f", "Radio :", getPpeCost());
		String g = String.format("%-14s $%-20.2f", "Pager :", getPagerCost());
		
		return String.format(t + "\n" + n + "\n" + p + "\n" + r + "\n" + g);
	}

} /* END - First Responder Class */