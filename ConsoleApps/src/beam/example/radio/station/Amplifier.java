/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Amplifier Class
 *  
 */
package beam.example.radio.station;

public class Amplifier
{
	private String manufacturer;
	private String model;

	// constructor-1
	public Amplifier(String manufacturer, String model)
	{
		super();
		this.manufacturer = manufacturer;
		this.model = model;
	}

	// constructor-2
	public Amplifier(String model)
	{
		super();
		this.model = model;
	}
	
	/** @param value @return power level */
	public String checkPower(String value)
	{
		String maxPower = value;
		
		if (value == "AL-1500")
		{
			maxPower = "2500";
		}
		else
		{
			maxPower = "1000";
		}

		return String.format("%sW",maxPower);
	}
	
	/** @return manufacturer of amplifier */
	public String getManufacturer()
	{
		return manufacturer;
	}

	/** @param manufacturer of amplifier */
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	/** @return model of amplifier */
	public String getModel()
	{
		return model;
	}

	/** @param model of amplifier */
	public void setCost(String model)
	{
		this.model = model;
	}

	@Override
	public String toString()
	{
		return String.format("%s %s", manufacturer, model);
	}
	
} /* END - Amplifier Class */