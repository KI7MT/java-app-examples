/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Driver for Product Sales
 *  
 */
package beam.example.calculate.sales;

import java.util.Scanner;


class ProductDriver
{
	public static void main(String[] args) {
		
		// initialize loop control and quantity variables.
		int pCount;
		int number = 0;
		int p1Count = 0;
		int p2Count = 0;
		int p3Count = 0;
		int p4Count = 0;
		int p5Count = 0;
		int quantity;
		double itemTotal;
				
		// initialize the Scanner.
		Scanner input = new Scanner(System.in);
		
		// start while loop for product and quantity entry.
		while (number != -1)
		{
			// user entry, product ID.
			System.out.print("Enter Product ID (1-5) or (-1) to quit : ");
			number = input.nextInt();

			if (number != -1)
			{
				// user entry, product quantity.
				System.out.print("Enter Quantity : ");
				quantity = input.nextInt();
							
				if (number == 1)
				{
					p1Count += quantity;
				}	
				if (number == 2)
				{
					p2Count += quantity;
				}
				if (number == 3)
				{
					p3Count += quantity;
				}
				if (number == 4)
				{
					p4Count += quantity;
				}
				if (number == 5)
				{
					p5Count += quantity;
				}
			}
			System.out.print("\n");
		} // END - Entry loop.
		
		// close input scanner to prevent resource leaks
		input.close();
		System.out.println("** End of Product Entry **");
				
		// print summary header
		System.out.print("\nItem       Qty\tCosts");
		System.out.print("\n-------------------------");
		
		// create a Product Class instance
		Product value = new Product(0,0.00);
		
		// loop through product number (1-5) and calculate the summaries
		for (int count = 1; count <= 5; count++)
		{
			// set product ID which sets the ProductCost
			value.setProductID(count);

			switch (count)
			{
				case 1:
					itemTotal = p1Count * value.getProductCost();
					pCount = p1Count; 
					break;
			
				case 2:
					itemTotal = p2Count * value.getProductCost();
					pCount = p2Count;
					break;

				case 3:
					itemTotal = p3Count * value.getProductCost();
					pCount = p3Count;
					break;				

				case 4:
					itemTotal = p4Count * value.getProductCost();
					pCount = p4Count;
					break;

				case 5:
					itemTotal = p5Count * value.getProductCost();
					pCount = p5Count;
					break;	

				default:
					itemTotal = 0.00;
					pCount = 0;
					break;
			} // END - Case switch
			
			// print the product line totals
			System.out.printf("\nProduct-%s   %s   $%.2f", count, pCount, itemTotal);

		} // END - for loop
		System.out.print("\n");

	} // END - Main Method

} /* END - ProductDriver class */