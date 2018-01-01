/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Commission Employee Class extends (is-a) Employee Class
 *  
 */
package beam.example.gross.pay;

public class CommissionEmployee extends Employee
{
	// subclass variables
	private double grossSales;
	private double commissionRate;
	
	// Constructor, super must be the first line
	CommissionEmployee(
			String firstName,
			String lastName,
			String employeeId,
			double grossSales,
			double commissionRate
	)
	{
		super(firstName, lastName, employeeId);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	// Method: calculatePayment
	// overrides abstract method calculatePayment in Employee abstract class
	@Override
	public double calculatePayment()
	{
		return getCommissionRate() * getGrossSales();
	}

	// return grossSales
	double getGrossSales()
	{
		return grossSales;
	}

	// set grossSales
	public void setGrossSales(double grossSales)
	{
		this.grossSales = grossSales;
	}

	// return commissionRate
	double getCommissionRate()
	{
		return commissionRate;
	}

	// set commissionRate
	public void setCommissionRate(double commissionRate)
	{
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString()
	{
		return String.format("Commission Employee -> %s%n%s....: $%.2f",
				super.toString(),
				"Gross Sales", getGrossSales(),
				"Commision Rate", getCommissionRate());
	}
	
} /* END - Commission Employee Subclass */