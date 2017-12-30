/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java GUI Application
 *  Description..: JFrame for Hi-Low Redux Game GUI
 *  
 */
package beam.example.redux.game;

import javax.swing.JFrame;

public class ApplicationGUI
{
	// Method: Main
	public static void main(String[] args)
	{
		// call the button frame class
		ButtonFrame buttonFrame = new ButtonFrame();
		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonFrame.setSize(375, 80);
		buttonFrame.setVisible(true);
	}
	
} /* END Application GUI Class */
