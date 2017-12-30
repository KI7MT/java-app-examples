/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Operator Class
 *  
 */
package beam.example.radio.station;

public class Operator
{
	private String firstName;
	private String lastName;
	private String callsign;
	private String association;
	
	// constructor-1
	public Operator(String firstName, String lastName, String callsign, String association)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.callsign = callsign;
		this.association = association;
	}

	// constructor-2
	public Operator(String association)
	{
		super();
		this.association = association;
	}
	
	/** @return association fee */
	public String calculateAssociationFee()
	{
		double fee = 0;
		
		if (association != null)
		{
			switch (association)
			{
				case "ARRL":
					fee = 120.00;
				break;

				case "CWOPS":
					fee = 25.00;
				break;
			}
		}
		return String.format("$%.2f", fee);
	}
	
	/** @return first name of operator */
	public String getFirstName()
	{
		return firstName;
	}

	/** @param firstName of operator */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/** @return lastName of operator */
	public String getLastName()
	{
		return lastName;
	}

	/** @param lastName of operator */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/** @return callsign of operator */
	public String getCallsign()
	{
		return callsign;
	}

	/** @param callsign of operator */
	public void setCallsign(String callsign)
	{
		this.callsign = callsign;
	}
	
	/** @return association of operator */
	public String getAssociation()
	{
		return association;
	}

	/** @param association of operator */
	public void setAssociation(String association)
	{
		this.callsign = association;
	}
	
	@Override
	public String toString()
	{
		return String.format("Operator ........: %s %s, %s", firstName, lastName, callsign);
	}
	
} /* END - Operator class */