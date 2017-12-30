/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Sets up the station operator, station data, adds
 *                 equipment to (3) arrays, uses (2) methods to check
 *                 equipment power and association fees, then prints
 *                 the station equipment list.
 *                 
 *  Note: This example demonstrates a basic (has-a) relationship.
 *        In OOP terms, it inherits objects from other classes. In
 *        this case, a RadioStation (has-a) Operator, Transceiver,
 *        Antenna and so on.
 *  
 */
package beam.example.radio.station;

public class RadioStationDriver
{
	public static void main(String[] args)
	{
		// Create an operator for later addition to station
		Operator operator1 = new Operator("Greg","Beam","KI7MT","ARRL");

		// Create a new station
		RadioStation station = new RadioStation("KI7MT", operator1);

		// Add Transceivers to station
		station.getTrancievers().add(new Transceiver("Yaesu","FT-2000D"));
		station.getTrancievers().add(new Transceiver("Icom","IC-7800"));
		
		// Add Amplifiers to station
		station.getAmplifiers().add(new Amplifier("Ameritron","AL-1500"));
		station.getAmplifiers().add(new Amplifier("Collins","30L-1"));
				
		// Add Antennas to station
		station.getAntennas().add(new Antenna("Force-12","MX-5-20","Yagi"));
		station.getAntennas().add(new Antenna("VorTex","5BTV","Vertical"));
		
		// get the stations power based on Amplifier Model
		String modelCheck = station.getAmplifiers().get(0).getModel();
		Amplifier pwrcheck = new Amplifier(modelCheck);
		
		// Print out station configuration and fees
		System.out.println(station);
		System.out.println(operator1);
		System.out.println("Association Fees : " + station.getOperator().calculateAssociationFee());
		System.out.println("");

		// print out station equipment list
		System.out.println("Equipment List");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Transceivers ....: " + station.getTrancievers());
		System.out.println("Amplifiers ......: " + station.getAmplifiers());
		System.out.println("Antennas ........: " + station.getAntennas());
		System.out.println("Max Power .......: "+ pwrcheck.checkPower(modelCheck));
		
	} // END - Main Method

} /* END - Class Driver */