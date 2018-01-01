/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Domain Registration Class implements IPayable
 *                 
 *        
 */
package beam.example.domain.purchase;


public class DomainNameRegistration implements IPayable
{
	// class variables
	private String ownerName;
	private String domainName;
	private String registrar;
	private double costPerYear;
	private int quantity;

	// Constructor	
	DomainNameRegistration(
			String ownerName,
			String domainName,
			String registrar,
			double costPerYear,
			int quantity
	)
	{
		this.ownerName = ownerName;
		this.domainName = domainName;
		this.registrar = registrar;
		this.costPerYear = costPerYear;
		this.quantity = quantity;
	}

	// Method: Payable, totalDue. implements Payable
	@Override
	public double getTotalDue()
	{
		return getCostPerYear() * quantity;
	}

	// return ownerName
	private String getOwnerName()
	{
		return ownerName;
	}

	// set ownerName
	private void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}

	// return domainName
	private String getDomainName()
	{
		return domainName;
	}

	// set domainName
	private void setDomainName(String domainName)
	{
		this.domainName = domainName;
	}

	// return registrar
	private String getRegistrar()
	{
		return registrar;
	}

	// set registrar
	private void setRegistrar(String registrar)
	{
		this.registrar = registrar;
	}

	// return costPerYear
	private double getCostPerYear()
	{
		return costPerYear;
	}

	// set costPerYear
	public void setCostPerYear(double costPerYear)
	{
		this.costPerYear = costPerYear;
	}

	// return quantity
	private int getQuantity()
	{
		return quantity;
	}

	// set quantity
	private void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	// print toString
	@Override
	public String toString() {
		return String.format("Type........: Domain Name Registration%n"
				+ "Owner.......: %s%n"
				+ "Domain......: %s%n"
				+ "Registrar...: %s%n"
				+ "Yearly Cost.: %.2f%n"
				+ "Years.......: %s",
				getOwnerName(),
				getDomainName(),
				getRegistrar(),
				getCostPerYear(),
				getQuantity()
				);
	}

} /* END - Domain Name Registration Class */