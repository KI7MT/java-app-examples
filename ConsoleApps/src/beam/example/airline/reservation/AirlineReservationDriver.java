/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Airline Reservation Driver
 *  
 */
package beam.example.airline.reservation;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class AirlineReservationDriver
{
	public static void main(String[] args)
	{
		// initialize process variables 
		int economySeats = 0;
		int firstSeats = 0;
		int userSelect;

		// initialize 10 seat primitive boolean single-dimension array
		boolean[] flight = new boolean[10];

		// set all values to "false", indicating an empty seat
		Arrays.fill(flight, false);
		
		// initialize input scanner
		Scanner input = new Scanner(System.in);
		
		// generate a flight number
		Random rand = new Random();
		int low = 100;
		int high = 1000;
		int flightNumber = rand.nextInt(high-low) + low;
		
		// print the header
		AirlineReservationDriver.airlineHeader(flightNumber);

		// start seat selection: 1 for First Class, 2 for Economy Class
		// the if statements are a bit of a sledge-hammer, but it works
		while (economySeats + firstSeats < 10)
		{
			// print the select message based on filled seats, then prompts user for input
			AirlineReservationDriver.selectMessage(economySeats, firstSeats);
			System.out.print("- Enter Selection: ");
			userSelect = input.nextInt();
			input.nextLine();
			
			// user selected first class and it's not full
			if ((userSelect == 1) & (firstSeats < 5))
			{
				flight[firstSeats] = true;
				firstSeats++;
				System.out.println("- Bording Pass: seat [" + firstSeats + "]");
				System.out.println("");
				userSelect = 0;
			}

			// user selected first class, and it was full
			if (userSelect == 1 & firstSeats == 5)
			{
				System.out.println("\n* First Class if Full. Would you like Economy Seating?");
				System.out.println("- Use 2 For Economy, 3 for Next Fight");
				System.out.print("- Enter Selection: ");
				userSelect = input.nextInt();
				input.nextLine();

			}
			
			// user selected economy and it is not full
			if ((userSelect == 2) & (economySeats < 5))
			{
				flight[economySeats + 5] = true;
				economySeats++;
				System.out.println("- Boarding Pass: seat [" + (economySeats + 5) + "]");
				System.out.println("");
				userSelect = 0;
			}

			// user selected economy and it is full			
			if ((userSelect == 2) & (economySeats == 5))
			{
				System.out.println("\n* Economy if Full. Would you like First Class Seating?");
				System.out.println("- Use 1 for First Class, 3 for Next Fight");
				System.out.print("- Enter Selection: ");
				userSelect = input.nextInt();
				input.nextLine();
			}

			if (userSelect == 3)
			{
				System.out.println("\n* Next flight leaves in 3 hours.\n");
			}

			// reset userSelect variable
			// userSelect = 0;

		} // END - reservation entry while loop

		// close scanner to prevent resource leaks
		input.close();

		// print airline header and flight is full message
		AirlineReservationDriver.airlineHeader(flightNumber);
		AirlineReservationDriver.fullFlight();

	} // END - Main Method
	

	// Method: Full Flight
	private static void fullFlight()
	{
		System.out.println("* Flight is now full.");
		System.out.println("* Next flight leaves in 3 hours. ");
	} // END - Full Flight Method


	// Method: Selection message
	private static void selectMessage(int economySeats, int firstSeats)
	{
		String fSeating = ("- Use 1 for First Class Seating");
		String eSeating = ("- Use 2 for Economy Seating");
		String efSeating = ("- Use 1 First Class, 2 for Economy");
		
		// if both first and economy are open
		if (firstSeats < 5 &economySeats < 5)
		{
			System.out.println(efSeating);
		}
		
		// if first is full and economy is open
		if (firstSeats == 5 & economySeats < 5)
		{
			System.out.println(eSeating);
		}
		
		// if first is open and economy is full
		if (firstSeats < 5 & economySeats == 5)
		{
			System.out.println(fSeating);
		}
	} // END - Select Message


	// Method: Print Header
	static void airlineHeader(int flightNumber)
	{
		System.out.println("Puddle Jumper Airline Reservation System");
		System.out.println("Flight : PJ" + flightNumber + " HLN to SLC");
		System.out.println("----------------------------------------");
		
	} // END - Airline Header
	
} // END - Airline Reservation System