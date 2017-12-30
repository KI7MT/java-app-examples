/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Driver for Hourly Salary
 *  
 */
package beam.example.hourly.salary;

import java.util.Scanner;

public class HourlyEmployeeDriver {

    public static void main(String[] args)
    {
        // Initialize the Scanner
        Scanner input = new Scanner(System.in);

        // Initialize loop counter
        int counter = 1;

		// Print the header
		System.out.println("\nSalary Calculator for (3) Employee's");
		System.out.println("--------------------------------------\n");
        
        // Create / reset object to hold console I/O input
        HourlyEmployee record = new HourlyEmployee("","","",0.00,0.00);
		
		// As per instruction, loop through (3) employees and compute grossPay.
        while (counter <= 3)
        {
            // Start entering employee data.
            System.out.printf("Enter Employee-%s Data\n", counter);

            System.out.print("First Name....: ");
            String fname = input.next();
            record.setFirstName(fname);

            System.out.print("Last Name.....: ");
            String lname = input.next();
            record.setLastName(lname);

            System.out.print("Employee ID...: ");
            String empid = input.next();
            record.setEmpNumber(empid);

            System.out.print("Hours Worked..: ");
            double hrs = input.nextDouble();
            record.setHours(hrs);

            System.out.print("Pay rate......: ");
            double prate = input.nextDouble();
            record.setPayRate(prate);

            // Print gross pay for record.
            double gross = record.calculatePay();
            System.out.printf("Gross Pay.....: $%.2f%n\n", gross);

            // Increment the loop counter.
            counter++;

        } // END - While Loop employee data entry.

        // Print end of routine
        System.out.print("*--End Salary Calculator--*\n");

        // Close the input scanner ( prevent resource leaks ).
        input.close();

    } // END - Main method

} // END - HourlyEmployee class