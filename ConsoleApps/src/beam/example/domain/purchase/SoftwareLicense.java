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

public class SoftwareLicense implements IPayable
{

	// class variables
	private String ownerName;
	private int productId;
	private String description;
	private double costPerSeat;
	private int quantity;

	// Constructor
	SoftwareLicense(
			String ownerName,
			int productId,
			String description,
			double costPerSeat,
			int quantity
	)
	{
		this.ownerName = ownerName;
		this.productId = productId;
		this.description = description;
		this.costPerSeat = costPerSeat;
		this.quantity = quantity;
	}

	// Method: Payable, totalDue. implements Payable	
	@Override
	public double getTotalDue()
	{
		return getCostPerSeat() * quantity;
	}

	// return ownerName
	private String getOwnerName()
	{
		return ownerName;
	}

	// set ownerName
	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}

	// return productId
	private int getProductId()
	{
		return productId;
	}

	// set productId
	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	// return description
	public String getDescription()
	{
		return description;
	}

	// set description
	public void setDescription(String description)
	{
		this.description = description;
	}

	// return costPerSeat
	private double getCostPerSeat()
	{
		return costPerSeat;
	}

	// set costPerSeat
	public void setCostPerSeat(double costPerSeat)
	{
		this.costPerSeat = costPerSeat;
	}

	// return quantity
	private int getQuantity()
	{
		return quantity;
	}

	// set quantity
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	// print toString
	@Override
	public String toString()
	{
		return String.format("Type........: Software License%n"
				+ "Owner.......: %s%n"
				+ "Product ID..: %s%n"
				+ "Description : %s%n"
				+ "Seat Cost...: %.2f%n"
				+ "Quantity....: %s",
				getOwnerName(),
				getProductId(),
				getDescription(),
				getCostPerSeat(),
				getQuantity()
				);
	}

} /* END - Software License */