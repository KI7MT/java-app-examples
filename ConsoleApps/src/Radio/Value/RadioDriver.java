/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Class Instance of Radio
 *                 RadioDriver to display some data
 *  
 */
package Radio.Value;

public class RadioDriver
{
	public static void main(String[] args)
	{
		// create a couple Radio instances
		Radio radio1 = new Radio ("Yaesu", "FT-2000D", true, 200, 1500.25);
		Radio radio2 = new Radio ("Icom", "IC-7600", false, 200, 2950.43);
		
		// method variables
		String bestBrand;
		String bestModel;
		double cashSavings;

		// print summary
		System.out.println("Radio List Summary");
		System.out.println("---------------------");
		radio1.printSummary();
        System.out.print("\n");
		radio2.printSummary();

		// price comparison
		if (radio1.getRadioPrice() > radio2.getRadioPrice())
		{
			bestBrand = (radio2.getRadioBrand());
			bestModel = (radio2.getRadioModel());
			cashSavings = (radio1.getRadioPrice() - radio2.getRadioPrice());
		}
		else
		{
			bestBrand = (radio1.getRadioBrand());
			bestModel = (radio1.getRadioModel());
			cashSavings =  (radio2.getRadioPrice() - radio1.getRadioPrice());
		}

		// print best value
		System.out.printf("%nBest value is %s %s, saving $%.2f dollars", bestBrand, bestModel, cashSavings);
        System.out.print("\n");

	} // END - Main method

} // END - RadioDriver class