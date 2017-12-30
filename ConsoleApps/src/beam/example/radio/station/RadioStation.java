/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java Console Application
 *  Description..: Radio Station Class
 *  
 */
package beam.example.radio.station;

import java.util.ArrayList;

public class RadioStation
{
	private String stationCall;
	private Operator operator;
	private ArrayList<Amplifier> amplifiers = new ArrayList<Amplifier>();
	private ArrayList<Antenna> antennas = new ArrayList<Antenna>();
	private ArrayList<Transceiver> transceivers = new ArrayList<Transceiver>();
	
	// constructor-1
	public RadioStation(String stationCall)
	{
		super();
		this.stationCall = stationCall; 
	}

	// constructor-2
	public RadioStation(String stationCall, Operator operator)
	{
		super();
		this.stationCall = stationCall;
		this.operator = operator;
	}

	/** @return stationCall of station */
	public String getstationCall()
	{
		return stationCall;
	}

	/** @param stationCall of station */
	public void setstationCall(String stationCall)
	{
		this.stationCall = stationCall;
	}

	/** @return operator callsign */
	public Operator getOperator()
	{
		return operator;
	}

	/** @param operator callsign */
	public void setOperator(Operator operator)
	{
		this.operator = operator;
	}

	/** @return amplifiers ArrayList */
	public ArrayList<Amplifier> getAmplifiers()
	{
		return amplifiers;
	}

	/** @param amplifiers ArrayList */
	public void setAmplifiers(ArrayList<Amplifier> amplifiers)
	{
		this.amplifiers = amplifiers;
	}

	/** @return antennas ArrayList */
	public ArrayList<Antenna> getAntennas()
	{
		return antennas;
	}

	/** @param antennas ArrayList */
	public void setAntennas(ArrayList<Antenna> antennas)
	{
		this.antennas = antennas;
	}

	/** @return transceiver ArrayList */
	public ArrayList<Transceiver> getTrancievers()
	{
		return transceivers;
	}

	/** @param transceiver ArrayList */
	public void setTrancievers(ArrayList<Transceiver> trancievers)
	{
		this.transceivers = trancievers;
	}

	@Override
	public String toString()
	{
		return "Station Call ....: " + stationCall;
	}

} /* END - RadioStation Class */