/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Employee Abstract Class
 *  
 */
package beam.example.gross.pay;

public abstract class Employee
{
	private final String firstName;
	private final String lastName;
	private final String employeeId;

	// Constructor
	Employee(
			String firstName,
			String lastName,
			String employeeId
	)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
	}

	// Method: calculatePayment
	// Abstract method, must be overridden by concrete subclasses
	public abstract double calculatePayment();
	
	// return firstName
	String getFirstName()
	{
		return firstName;
	}

	// return lastName
	String getLastName()
	{
		return lastName;
	}

	// return employeeID
	String getEmployeeId()
	{
		return employeeId;
	}

	// return String for Employee Object
	@Override
	public String toString()
	{
		return String.format("%s %s%nEmployee ID....: %s ", getFirstName(), getLastName(), getEmployeeId());
	}
	
} /* END - Employee Abstract Super Class */