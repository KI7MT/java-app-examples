/*
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Salary Employee extends (is-a) Employee Class
 *  
 */
package beam.example.gross.pay;

public class SalariedEmployee extends Employee
{
	// subclass variables
	private double weeklySalary;

	// Constructor, super must be the first line
	SalariedEmployee(
			String firstName,
			String lastName,
			String employeeId,
			double weeklySalary
	)
	{
		super(firstName, lastName, employeeId);
		this.weeklySalary = weeklySalary;
	}

	// Method: calculatePayment
	// overrides abstract method calculatePayment in Employee abstract class
	@Override
	public double calculatePayment()
	{
		return getWeeklySalary();
	}
	
	// return weeklySalary
	double getWeeklySalary()
	{
		return weeklySalary;
	}

	// set weeklySalary
	public void setWeeklySalary(double weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}
	
	// return String for SalariedEmployee
	@Override
	public String toString()
	{
		return String.format("Salaried Employee -> %s%n%s..: $%.2f",
				super.toString(),
				"Weekly Salary", getWeeklySalary());
	}
	
} /* END - Salaried Employee subclass */