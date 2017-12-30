/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Driver for Employee Salary
 *  
 */
package beam.example.salary.tests;

public class EmployeeDriver
{
	
	public static void main(String[] args)
	{

		// print header
		System.out.println("\n Positive and Negative Salary Tests");
		System.out.println("------------------------------------\n");
		
	    // test methods
		positiveSalary();
		negativeSalary();
		bothSalary();
		
		// Print end of routine message
		System.out.print("\n End Yearly Salary Calculator Tests.\n");
	
	} // END - Main Method

	// Method: Positive Salary
	private static void positiveSalary()
	{
		System.out.println("Test Method - positive monthly salaries");

		// Set default record values for testing */
		Employee record1 = new Employee("Jane", "Programmer", 0.00, 0.10);
		Employee record2 = new Employee("Joe", "Programmer", 0.00, 0.10);
		
		// Assert positive values for both records
		record1.setMonthlySalary(3600.00);
		record2.setMonthlySalary(3200.00);
		
		// Prints records.
		record1.printSalary();
		record2.printSalary();
		
	} // END - positiveSalary

	// Method: Negative Salary
	private static void negativeSalary()
	{
		System.out.println("\nTest Method - negative monthly salaries");
		
		// Set default values for testing.
		Employee record1 = new Employee("Jane", "Programmer", 0.00, 0.10);
		Employee record2 = new Employee("Joe", "Programmer", 0.00, 0.10);
		
		// Assert negative monthly salaries
		record1.setMonthlySalary(-0.01);
		record2.setMonthlySalary(-0.01);

		// Prints salary records.
		record1.printSalary();
		record2.printSalary();
		
	} // END - negativeSalary

	// Method: Both Salary
	private static void bothSalary()
	{
		System.out.println("\nTest Method - positive and negative monthly " +
				"salaries");
		
		// Set default record values for testing.
		Employee record1 = new Employee("Jane", "Programmer", 0.00, 0.10);
		Employee record2 = new Employee("Joe", "Programmer", 0.00, 0.10);
		
		// Assert positive and negative monthly salaries */
		record1.setMonthlySalary(3200.00);
		record2.setMonthlySalary(-0.01);
		
		// Print salary records
		record1.printSalary();
		record2.printSalary();

	} // END - bothSalary

} /* END - EmployeeDriver class */