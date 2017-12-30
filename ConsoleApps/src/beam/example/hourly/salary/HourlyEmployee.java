/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Class for Hourly Salary
 *  
 */
package beam.example.hourly.salary;

public class HourlyEmployee {

    // Instance variables
    private String firstName;
    private String lastName;
    private String empNumber;
    private double hours;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName, String empNumber,
            double hours, double payRate)
    {
        // Assign instance variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.empNumber = empNumber;
        this.hours = hours;
        this.payRate = payRate;

    } // END - Constructor

    /** @param firstName sets employee first name */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /** @return firstName returns employee first name */
    public String getFirstName() { return firstName; }

    /** @param lastName sets employee last name */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /** @return lastName returns employee last name */
    public String getLastName() { return lastName; }

    /** @param empNumber sets employee ID number */
    public void setEmpNumber(String empNumber) { this.empNumber = empNumber; }

    /** @return empNumber returns employee ID number */
    public String getEmpNumber() { return empNumber; }

    /** @param hours sets hours worked */
    public void setHours(double hours) { this.hours = hours; }

    /** @return hours returns hours worked */
    public double getHours() { return hours; }

    /** @param payRate sets hourly pay rate */
    public void setPayRate(double payRate) { this.payRate = payRate; }

    /** @return hours returns hourly pay rate */
    public double getPayRate() { return payRate; }

    /** @return calculatePay returns gross pay */
    public double calculatePay()
    {
        double grossPay;

        // If hours is > 40, add overtime to base pay.
        if (getHours() > 40)
        {
            grossPay = ((1.5 * getPayRate()) * (getHours() - 40.0)) + (40.0 * getPayRate());
        }
        else
        {
            grossPay = (getHours() * getPayRate());
        }
        return grossPay;
    } // END - Calculate Pay Method

} // END - Hourly Employee class