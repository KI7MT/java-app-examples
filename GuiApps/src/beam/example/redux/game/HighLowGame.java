/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java GUI Application
 *  Description..: JFrame for Hi-Low Redux Game GUI
 *  
 *                 
 */
package beam.example.redux.game;

import java.util.Random;

public class HighLowGame
{
	// class variables
	private int secretNumber;
	private int counter;
	
	// Constructor
	public HighLowGame(int numberOfNumbers)
	{
		super();
		this.secretNumber = ranInt(0, numberOfNumbers);
	}

	// return results based on GUI Guess
	public String guess(int numberGuess)
	
	{
		counter++;
		String message = "";
		
		if (numberGuess < getSecretNumber())
		{
			
			message = "   Wrong, Guess Higher"; 

		}
		
		if (numberGuess > getSecretNumber())
		{
			
			message = "    Wrong, Guess Lower";
		}

		if (numberGuess == getSecretNumber())
		{
			
			message = String.format("Correct after ( %s ) guesses", getCounter());
		}
		
		return message;
		
	}

	// generate a secret number ( integer )
	private static int ranInt(int min, int max)
	{
		Random rand = new Random();
		
		int number = rand.nextInt((max - min) +1);
		
		return number;
	}
	
	//  get counter value
	private int getCounter()
	{
		return counter;
	}

	// get secret number
	private int getSecretNumber()
	{
		return secretNumber;
	}

	// set secret number
	public void setSecretNumber(int secretNumber)
	{
		this.secretNumber = secretNumber;
	}
	
} /* END High Low Game Class */