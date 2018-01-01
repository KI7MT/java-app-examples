/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Gross Pay calculator based on pay type
 *                 H = Hourly
 *                 S = Salary
 *                 C = Commission
 *                 
 *  Note: This example demonstrates a basic (is-a) relationship.
 *        In OOP terms, object classes can extend other object classes.
 *        In this case, Hourly, Salary, and Commission (is-a) Employee.
 *        By extending the Employee class, each extended class must also
 *        implement any abstract methods the partent class describes.
 *        Employee requires each class implement the calculatePayment()
 *        method.
 *        
 */
package beam.example.gross.pay;

import java.util.Scanner;

public class GrossPayDriver
{

	// Method: Main
	public static void main(String[] args)
	{
		// main method variables
		int empCount;
		String empType;
		String empFirst;
		String empLast;
		String empId;
		double empWage;
		double empHours;
		double empSalary;
		double empSales;
		double empRate;
		double totalPay = 0;
	
		// start the scanner
		Scanner input = new Scanner(System.in);
		
		// start user input
		System.out.println("Employee Pay Calculator");
		System.out.println("H = Hourly, S = Salary, C = Commission\n");
		
		// how many employee's to process
		System.out.print("Number of Employee's.......: ");
		empCount = input.nextInt();
		System.out.println("");

		// create object array based on empCount
		Employee[] employees = new Employee[empCount];
		
		// start employee entry loop
		for (int counter = 0; counter < empCount; counter++) 
		{
			// type of employee
			System.out.printf("Employee-%s Type (H, S, C)..: ", (counter + 1));
			empType = input.next().toUpperCase();
			input.nextLine();
			
			// employee's first name
			System.out.print("First Name ................: ");
			empFirst = input.next();
			input.nextLine();

			// employee's last name
			System.out.print("Last Name .................: ");
			empLast = input.next();
			input.nextLine();
			
			// employee's ID
			System.out.print("Employee ID ...............: ");
			empId = input.next();
			input.nextLine();
			
			// switch for Hourly, Salary, and Commission based on empType
			switch (empType)
			{
				case "H": // hourly employee
					System.out.print("Hourly Rate ...............: ");
					empWage = input.nextDouble();
					
					System.out.print("Hours Worked ..............: ");
					empHours = input.nextDouble();
					
					// create the HourlyEmployee Object
					HourlyEmployee hourly = new HourlyEmployee(
							empFirst,
							empLast,
							empId,
							empWage,
							empHours);
					
					// add hourly object to employees array
					employees[counter] = hourly;
					
					break;
			
				case "S": // salary employee
					System.out.print("Weekly Salary .............: ");
					empSalary = input.nextDouble();
					
					// create the SalariedEmployee Object
					SalariedEmployee salary = new SalariedEmployee(
							empFirst,
							empLast,
							empId,
							empSalary);

					// add salaried object to employees array
					employees[counter] = salary;
				
					break;

				case "C": // commission employee 
					System.out.print("Employee Sales ............: ");
					empSales = input.nextDouble();
					
					System.out.print("Commision Rate   ..........: ");
					empRate = input.nextDouble();
					
					// create the CommissionEmployee Object
					CommissionEmployee commission = new CommissionEmployee(
							empFirst,
							empLast,
							empId,
							empSales,
							empRate);

					// add commission object to employees array
					employees[counter] = commission;
					
					break;
				
			} // END - Case switch
			System.out.println(""); // separates entries
			
		} // END - Entry For Loop

		// close the scanner to prevent resource leaks
		input.close();
		
		// for loop to print individual employee summaries
		for (Employee employee : employees) {

			System.out.print(employee); // calls the Employee class toString()
			System.out.printf("\nEmployee Pay...: $%.2f", employee.calculatePayment());
			System.out.println("\n");

			// add employee's pay to totalPay
			totalPay += employee.calculatePayment();

		} // END - Employee Summary For Loop
		
		// print total pay for all employee's
		System.out.printf("\nTotal Pay......: $%.2f", totalPay);
		
	} /* END - Main Method */

} /* END - Gross Pay Driver Class */