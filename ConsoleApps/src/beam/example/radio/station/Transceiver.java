/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Radio Station Class
 *  
 */
package beam.example.radio.station;

public class Transceiver
{
	private String manufacturer;
	private String model;

	// constructor-1
	public Transceiver(String manufacturer, String model)
	{
		super();
		this.manufacturer = manufacturer;
		this.model = model;
	}

	/** @return manufacturer of transceiver */
	public String getManufacturer()
	{
		return manufacturer;
	}

	/** @param manufacturer of transceiver */
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	/** @return model of transceiver */
	public String getModel()
	{
		return model;
	}

	/** @param model of transceiver */
	public void setModel(String model)
	{
		this.model = model;
	}

	@Override
	public String toString()
	{
		return String.format("%s %s", manufacturer, model);
	}

} /* END - Transceiver Class */