/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Domain Purchase Driver
 *                 
 *  Note-1: This example demonstrates a basic interface. An
 *          interface is like a contract, it stipulates that
 *          any class which implements it must provide methods
 *          for all item listed within it.
 *          
 *  Note-2: Most of the pricing is generated with Random
 *          number generation as are several other fields.
 *          Each time the script is run, you should get different
 *          values for each invoice item.
 *        
 */
package beam.example.domain.purchase;

import java.util.ArrayList;
import java.util.Random;

public class DomainPurchaseDriver
{

	// Method: main
	public static void main(String[] args)
	{
		// NOTE: Random numbers are generated for int and doubles
		//       within a reasonable range. Each time the script
		//		 is run, all the values should change.
		
		// Invoice1 is set to boolean true and "should not"
		// create an Amount Due figure
		LegalServiceBill invoice1 = new LegalServiceBill(
				"Client-1",
				String.valueOf(ranInt(1000,100000)),  // Invoice Number
				ranInt(0,50),                         // Hours
				ranDouble(15,50),                     // Rate per Hour
				ranDouble(500,900),                   // Expenses
				true
				);

		// Invoice2 is set to boolean false and "should"
		// create an Amount Due figure
		LegalServiceBill invoice2 = new LegalServiceBill(
				"Client-2",
				String.valueOf(ranInt(1000,100000) + ranInt(1000,100000)),  // Invoice Number
				ranInt(0,50),                         // Hours
				ranDouble(15,50),                     // Rate per Hour
				ranDouble(100,500),                   // Expenses 
				false
				);

		// Invoice object for DomainNameRegistration
		DomainNameRegistration invoice3 = new DomainNameRegistration(
				"Client-3",
				"java8_151.com",
				"iPost",
				ranDouble(9.50,15), // yearly cost
				ranInt(1,5) // number of years
				);
		
		// Invoice objects for SoftwareLicense
		SoftwareLicense invoice4 = new SoftwareLicense(
				"Client-4",
				1,
				"MS Office 365 for Employees",
				ranDouble(129,250),                   // per seat cost
				ranInt(1,10)                          // quantity
				);

		// just another software license purchase
		SoftwareLicense invoice5 = new SoftwareLicense(
				"Client-5",
				2,
				"MS Visual Studio 2017",
				ranDouble(399,1500),                  // per seat cost
				ranInt(1,10)                          // quantity
				);
		
		// create ArrayList invoiceList
		ArrayList<IPayable> invoiceList = new ArrayList<>();
		
		// add objects to invoiceList
		invoiceList.add(invoice1);                    // Legal Service-1
		invoiceList.add(invoice2);                    // Legal Service-2
		invoiceList.add(invoice3);                    // Domain Registration
		invoiceList.add(invoice4);                    // Software License-1
		invoiceList.add(invoice5);                    // Software License-2
		
		// print the display header
		System.out.println("Invoice System Using an Interface\n");
		
		// loop through the ArrayList and print values, then calculate getTotalDue
        for (IPayable anInvoiceList : invoiceList) {
            System.out.println(anInvoiceList);
            System.out.printf("Amount Due..: $%.2f", anInvoiceList.getTotalDue());
            System.out.println("\n");
        }

	} /* END - Main Method */

	//--------------------------------------------------------------------------------------//
	// General Purpose Methods
	//--------------------------------------------------------------------------------------//
	
	// random number generator for integers
	private static int ranInt(int min, int max)
	{
		Random rand = new Random();
		return rand.nextInt((max - min) + 1);
	}
	
	// random number generator for doubles
	private static double ranDouble(double min, double max)
	{
		Random rand = new Random();
		return rand.nextDouble() + (max - min);
	}

} /* END - Driver for invoice using an interface */