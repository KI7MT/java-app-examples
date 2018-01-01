/*
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Hourly Employee extends (is-a) Employee Class
 *  
 */
package beam.example.gross.pay;

public class HourlyEmployee extends Employee
{

	// subclass variables
	private double wage;
	private double hours;
	
	// Constructor, super must be the first line
	HourlyEmployee(
			String firstName,
			String lastName,
			String employeeId,
			double wage,
			double hours
	)
	{
		super(firstName, lastName, employeeId);
		this.wage = wage;
		this.hours = hours;
	}

	// Method: calculatePayment
	// overrides abstract method earnings in Employee abstract class
	@Override
	public double calculatePayment()
	{
		if (getHours() <= 40)
		{
			return getWage() * getHours();

		}
		else
		{
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	
	// return wage
	double getWage()
	{
		return wage;
	}

	// set wage
	public void setWage(double wage)
	{
		this.wage = wage;
	}

	// return hours;
	double getHours()
	{
		return hours;
	}

	// set hours
	void setHours(double hours)
	{
		this.hours = hours;
	}

	// return String for HourlyEmployee
	@Override
	public String toString()
	{
		return String.format("Hourly Employee -> %s%n%s....: $%,.2f%n%s...: %,.2f",
				super.toString(),
				"Hourly Wage", getWage(),
				"Hours Worked", getHours());
	}
	
} /* END - SalariedEmployee Subclass */