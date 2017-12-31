/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Class for Animal Sighting Driver
 *  
 */
package beam.example.animal.sighting;

import java.util.Scanner;
import java.util.ArrayList;

public class AnimalDriver
{
	public static void main(String[] args)
	{
		// setup the array list
		ArrayList<Animal> sighted = new ArrayList<Animal>();

		// start the scanner
		Scanner input = new Scanner(System.in);
		
		// set process variables
		String inputAnimal;
		boolean doneSightSeeing = false;

		System.out.println("** Prickly Pear Creek Safari Sight Seeing **");
		System.out.println("--------------------------------------------");
		System.out.println("Enter the animal you see, or quit to exit.");
		System.out.println("");
		
		// start sight seeing loop :-)
		while (!doneSightSeeing)
		{
			System.out.print("Enter Animal : ");
			inputAnimal = input.next().toLowerCase();
			doneSightSeeing = tooManyLions(inputAnimal);
			
			// if we're not scared of the Lions, or tired, keep going
			if (!doneSightSeeing)
			{
				Animal animal = new Animal(inputAnimal);

				if (!sighted.contains(animal))
				{
					sighted.add(animal);
					animal.setAnimalCount(+ 1);
				}
				else
				{
					Animal dupeSighting = sighted.get(sighted.indexOf(animal));
					dupeSighting.setAnimalCount(dupeSighting.getAnimalCount() + 1);
				}
			}
		} // end while loop
		
		
		// loop through the arrayList and print what was observed
		System.out.println("");
		System.out.println("Summary of Animals Identified");
		System.out.println("------------------------------------------");

		for (Animal animals : sighted)
		{
			System.out.println(animals);
		}
			
		// close the scanner
		input.close();
		
		// just more screen candy
		System.out.println("");
		System.out.println("Thank you for using Prickly Pear Creek Safari");
	}

	// get me out of here method
	static boolean tooManyLions(String input)
	{
		String check;
		check = input.toUpperCase();

		return check.equals("QUIT");
	}
	
} /* END - Animal Driver */