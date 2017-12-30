/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Class for Parking Charges
 *  
 */
package beam.example.parking.garage;

public class ParkingCharge
{

    // set final variables
	private static final double MINCHAEGE = 2.0;
    private static final double MAXCHARGE = 10.0;
    private static final double INCCHARGE = 0.50;

    // Set min and max hours
    private static final double MINHOURS = 3.0;
    private static final double MAXHOURS = 24;

    // Set variable to keeping track of daily charges
    private double runTotal;

    // constructor
    public ParkingCharge(double runTotal)
    {
        // Assign instance variables.
        this.runTotal = runTotal;

    }

    /** @return runTotal returns running total of charges */
    public double getRunTotal()
    {
    	return runTotal;
    }

    /** @param runTotal sets running total of charges */
    public void setRunTotal(double runTotal)
    {
        this.runTotal = getRunTotal() + runTotal;
    }

    /** Calculate Charges - calculate customer and total running charges */
    public static double calculateCharges(double customerHours)
    {
        // Set variable for customer hours
        double customerCharge = 0.0;

       // If customerHours are < 3 first, set MINCHAEGE
        if (customerHours <= MINHOURS)
        {
            customerCharge = MINCHAEGE;
        }

        // If customerHours greater than MINHOURS and less than MAXHOURS
        // calculate the charge
        if((customerHours > MINHOURS) && (customerHours < MAXHOURS))
        {
            customerCharge = INCCHARGE * (Math.ceil(customerHours) - MINHOURS)
                    + MINCHAEGE;

            if (customerCharge > MAXCHARGE)
            {
                customerCharge = MAXCHARGE;
            }
        }

        // If customerHours are greater than MAXHOURS, set MAXCHARGE
        if(customerHours > MAXHOURS)
        {
            customerCharge = MAXCHARGE;
        }

        // Return customer parking charge
        return customerCharge;

    } // END - Calculate Charges method.

} /* END - ParkingCharge class */
