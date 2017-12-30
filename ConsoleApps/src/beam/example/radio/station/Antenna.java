/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Antenna Class
 *  
 */
package beam.example.radio.station;

public class Antenna
{
	private String manufacturer;
	private String model;
	private String type;

	// constructor
	public Antenna(String manufacturer, String model, String type)
	{
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.type = type;
	}

	/** @param manufacturer of antenna */
	public String getManufacturer()
	{
		return manufacturer;
	}

	/** @param manufacturer of antenna */
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	/** @param model of antenna */
	public String getModel()
	{
		return model;
	}

	/** @param model of antenna */
	public void setModel(String model)
	{
		this.model = model;
	}

	/** @param type of antenna */
	public String getType()
	{
		return type;
	}

	/** @param type of antenna */
	public void setType(String type)
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return String.format("%s %s %s", manufacturer, model, type);
	}

} /* END - Antenna Class */