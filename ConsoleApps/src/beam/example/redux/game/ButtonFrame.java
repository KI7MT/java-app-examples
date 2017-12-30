/* 
 *  Author ......: Greg, Beam, KI7MT, <ki7mt@yahoo.com>
 *  Copyright ...: Copyright (C) 2017 GPLv3
 *  Level .......: Intermediate
 *  Target ......: Java GUI Application
 *  Description..: JFrame for Hi-Low Redux Game GUI
 *                 
 */
package beam.example.redux.game;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	private final JButton plainJButton;
	private final JTextField textBox;
	HighLowGame game = new HighLowGame(10);
	
	// button frame adds JButtons to JFrame
	public ButtonFrame()
	{
		// set the layout
		super("High Low Game ( 0 to 10 )");
		setLayout(new FlowLayout());
		
		// text box entry field
		textBox = new JTextField("", 4);
		textBox.setHorizontalAlignment(JTextField.CENTER);
		add(textBox);
		
		// just plain old button
		plainJButton = new JButton("Enter");
		add(plainJButton);
		
		// create new button handler for button events
		ButtonHandler handler = new ButtonHandler();
		plainJButton.addActionListener(handler);
	}
	
	// inner class for button event handling
	private class ButtonHandler implements ActionListener
	{
		// handle button event
		@Override
		public void actionPerformed(ActionEvent event)
		{
			// send dialog message
			String message = String.format("%s", game.guess(Integer.parseInt(textBox.getText())));
			JOptionPane.showMessageDialog (null, message, "Guess Status", JOptionPane.INFORMATION_MESSAGE);
		}
	}

} /* END - Button Frame Class */