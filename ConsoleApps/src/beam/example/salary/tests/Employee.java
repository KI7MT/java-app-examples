/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Class for Employee
 *  
 */
package beam.example.salary.tests;

public class Employee
{
	// Instance variables
	private String firstName;
	private String lastName;
	private double monthlySalary;
	private double raiseFactor;

	public Employee(String firstName, String lastName, double monthlySalary, double raiseFactor)
	{
		// instance variables
		this.firstName = firstName;
		this.lastName = lastName;
		this.raiseFactor = raiseFactor;
		
		// only assign monthly salary if > 0.00.
		if (monthlySalary > 0.0)
		{
			this.monthlySalary = monthlySalary;	
		}
		
	} // end constructor

	/** @param firstName sets employee first name */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/** @return firstName returns employee first name */
	public String getFirstName()
	{
		return firstName;
	}

	/** @param lastName sets employee last name */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/** @return lastName returns employee last name */
	public String getLastName()
	{
		return lastName;
	}

	/** @param monthlySalary sets monthly salary if greater than ( 0.00 ) */
	public void setMonthlySalary(double monthlySalary)
	{
		if (monthlySalary > 0.00)
		{
			this.monthlySalary = monthlySalary;
		}
	}
	
	/** @return lastName returns monthly salary */
	public double getMonthlySalary()
	{
		return monthlySalary;
	}

	/** @param raiseFactor sets raise factor */
	public void setRaiseFactor(double raiseFactor)
	{
		this.raiseFactor = raiseFactor;
	}
	
	/** @return raiseFactor returns raise factor */
	public double getRaiseFactor()
	{
		return raiseFactor;
	}
	
	/** @return yearSalary returns ( monthlySalary * 12 ) */
	public double yearlySalary()
	{
		double yearSalary;
		yearSalary = (monthlySalary * 12);
		return yearSalary;
	}
	
	/** @return salaryAfterRaise returns yearly salary after raise */
	public double salaryAfterRaise()
	{
		double salaryAfterRaise;
		salaryAfterRaise = ((yearlySalary() * (raiseFactor) + yearlySalary()));
		return salaryAfterRaise;
	}
	
	/** Print summary for positive and negative salaries */
	public void printSalary()	
	{
		if (getMonthlySalary() > 0.00)
		{
			// For positive monthly salaries.
			System.out.printf(" * %s %s yearly salary is $%.2f. "
					+ "After raise is $%.2f", 
					getFirstName(),
					getLastName(),
					yearlySalary(),
					salaryAfterRaise());
			System.out.println();
		}
		else		
		{
			// For negative monthly salaries.
			System.out.printf(" * %s %s monthly salary is =< 0.00, cannot continue.",
					getFirstName(),
					getLastName());
			System.out.println();
		}
		
	} // END - Print Salary

} /* END - Employee class */