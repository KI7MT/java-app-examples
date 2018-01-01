/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Class for Animal Sighting
 *  
 */
package beam.example.animal.sighting;

public class Animal
{
	private String animalName;
	private int animalCount;

	// constructor: super, all fields
	public Animal(String animalName, int animalCount) {
		super();
		this.animalName = animalName;
		this.animalCount = animalCount;
	}

	// constructor: name only
	public String getAnimalName()
	{
		return animalName;
	}

	/* GETTERS and SETTERS */
	public Animal(String animalName) {
		super();
		this.animalName = animalName;
	}

	public void setAnimalName(String animalName)
	{
		this.animalName = animalName;
	}

	public int getAnimalCount()
	{
		return animalCount;
	}

	public void setAnimalCount(int animalCount)
	{
		this.animalCount = animalCount;
	}
	
	// override for hashCode method
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((animalName == null) ? 0 : animalName.hashCode());
		return result;
	}
	
	// override for equals method
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (animalName == null)
		{
			if (other.animalName != null)
				return false;
		} else if (!animalName.equals(other.animalName))
			return false;
		return true;
	}
	
	// object toString method
	@Override
	public String toString()
	{
		return "Animal Type: " + animalName + " Count: " + animalCount;
	}

} /* END - Animal Class */