/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Class for Radio properties
 *  
 */
package Radio.Value;

public class Radio
{
	// Instance variables
	private String radioBrand;
	private String radioModel;
	private boolean radioDsp;
	private int radioPower;
	private double radioPrice;

	public Radio(String radioBrand, String radioModel, boolean radioDsp, int radioPower, double radioPrice)
	{
		// Assign instance variables
		this.radioBrand = radioBrand;
		this.radioModel = radioModel;
		this.radioDsp = radioDsp;
		this.radioPower = radioPower;
		this.radioPrice = radioPrice;
	}

	/** @param radioBrand sets the radio brand */
	public void setRadioBrand(String radioBrand)
	{
		this.radioBrand = radioBrand;
	}

	/** @return radioBrand returns the radio Brand */
	public String getRadioBrand()
	{ 
		return radioBrand;
	}
	
	/** @param radioModel sets the radio model */
	public void setRadioModel(String radioModel)
	{
		this.radioModel = radioModel;
	}
	
	/** @return returns the radio model */
	public String getRadioModel()
	{
		return radioModel;
	}
	
	/** @param radioDsp sets if the radio has DSP */
	public void setRadioDsp(boolean radioDsp)
	{
		this.radioDsp = radioDsp;
	}
	
	/** @return radioDsp returns if the radio has DSP */
	public boolean getRadioDsp()
	{
		return radioDsp;
	}

	/** @param radioPower sets the max power of the radio */
	public void setRadioPower(int radioPower)
	{
		this.radioPower = radioPower;
	}
	
	/** @return radioPower returns the max power of the radio */
	public int getRadioPower()
	{
		return radioPower;
	}
	
	/** @param radioPrice sets the retail cost of the radio */
	public void setRadioPrice(double radioPrice)
	{
		this.radioPrice = radioPrice;
	}
	
	/** @return radioPrice returns the retail cost of the radio */
	public double getRadioPrice()
	{
		return radioPrice;
	}

    /** Prints the radio summary */
	public void printSummary()
	{
		System.out.println("Make.......: " + getRadioBrand());
		System.out.println("Model......: " + getRadioModel());
		System.out.println("Has DSP....: " + getRadioDsp());
		System.out.println("Max Power..: " + getRadioPower());
		System.out.println("Price......: $" + getRadioPrice());

	} // END - Print Summary Method
	
} // END - class Radio 
