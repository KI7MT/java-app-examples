/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Class for Products
 *  
 */
package beam.example.calculate.sales;

class Product {

	// initialize variables
	private int productID;
	private double productCost;

	// constructor
	Product(int productID, double productCost)
	{
		super();
		this.productID = productID;
		this.productCost = productCost;
		setProductID(0);
	}

	/** @return the product ID */
	public int getProductID()
	{
		return productID;
	}
	
	/** @param productID sets the product number */
	public void setProductID(int productID)
	{
		switch (productID)
		{
			case 1:
				setProductCost(2.98);
				break;
		
			case 2:
				setProductCost(4.50);
				break;

			case 3:
				setProductCost(9.98);
				break;				

			case 4:
				setProductCost(4.49);
				break;

			case 5:
				setProductCost(6.87);
				break;	

			default:
				setProductCost(0.00);
				break;
		} // END - Case switch
		
		this.productID = productID;
	}
	
	/** @return returns the product cost based on ID */
	double getProductCost()
	{
		return productCost;
	}

	/**
	 * @param productCost sets the product cost  */
	private void setProductCost(double productCost)
	{
		this.productCost = productCost;
	}

} /* END - Product class */