/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Legal Service Bill Class implements IPayable
 *                 
 *        
 */
package beam.example.domain.purchase;

public class LegalServiceBill implements IPayable
{
	// Class variables
	private String caseName;
	private String caseNumber;
	private double hours;
	private double rate;
	private double expenses;
	private boolean status;

	// Constructor
    LegalServiceBill(
            String caseName,
            String caseNumber,
            double hours,
            double rate,
            double expenses,
            boolean status
    )
	{
		this.caseName = caseName;
		this.caseNumber = caseNumber;
		this.hours = hours;
		this.rate = rate;
		this.expenses = expenses;
		this.status = status;
	}

	// Method: Payable, totalDue. implements Payable
	@Override
	public double getTotalDue()
	{
		double amount;
		
		if (!isStatus())
		{
			amount = (getHours() * getRate()) + getExpenses();
		}
		else
		{
			amount = 0.0; // return 0.00 if paid (isStatus) is true
		}
	
		return amount;
	}

	// return caseName
	private String getCaseName()
	{
		return caseName;
	}

	// set caseName
	public void setCaseName(String caseName)
	{
		this.caseName = caseName;
	}

	// return caseNumber
	private String getCaseNumber()
	{
		return caseNumber;
	}

	// set caseNumber 
	public void setCaseNumber(String caseNumber)
	{
		this.caseNumber = caseNumber;
	}

	// return hours
	private double getHours()
	{
		return hours;
	}

	// set hours
	public void setHours(double hours)
	{
		this.hours = hours;
	}

	// return rate
	private double getRate()
	{
		return rate;
	}

	// set rate
	public void setRate(double rate)
	{
		this.rate = rate;
	}

	// return expenses
	private double getExpenses()
	{
		return expenses;
	}

	// set expenses
	public void setExpenses(double expenses)
	{
		this.expenses = expenses;
	}

	// return status
	private boolean isStatus()
	{
		return status;
	}

	// set status
	public void setStatus(boolean status)
	{
		this.status = status;
	}

	// print toString
	@Override
	public String toString()
	{
		return String.format("Type........: Legal Service%n"
				+ "Name........: %s%n"
				+ "Number......: %s%n"
				+ "Hours.......: %s%n"
				+ "Rate........: $%.2f%n"
				+ "Expenses....: $%.2f%n"
				+ "Paid........: %s",
				getCaseName(), 
				getCaseNumber(),
				getHours(),
				getRate(),
				getExpenses(),
				isStatus());
	}

} /* END - Legal Service Bill Class */
