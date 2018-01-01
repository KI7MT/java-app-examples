package beam.example.firefighter.cost;

/**
 * FireFighterCostGUI.java
 * UI Driver for calculating Fire Fighter costs
 * Repository git@github.com:KI7MT/java-app-examples.git
 *
 * @author	Greg Beam
 * @version	1.2
 * @since	30-DEC-2017
 *
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FireFighterCostGUI extends JFrame
{
	/**
	 * Class Variables
	 * <ul>
	 *  <li>Serial Version UID
	 *  <li>Initializes JTextFields, JComboBox, BoxOptions, JTextArea
	 *  <li>Creates Station Array
	 *  <li>Initializes Wildland, Structure, and EMT variable names
	 *  <li>Sets default values for chainSaw, emtKit, and toolKit
	 * </ul>
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPpeCost;
	private JTextField txtRadioCost;
	private JTextField txtPagerCost;
	private DefaultComboBoxModel<String> comboModel;
	private JComboBox<String> comboBox;
	private static JTextArea textArea;
	private String[] boxOptions = {"Select..", "EMT", "Wildland", "Structure"};

	// variables used in processing fire fighters
	Station station = new Station("York Fire Rescue");
	FireFighterWildland wildland;
	FireFighterEmt emt;
	FireFighterStructure structure;
	private double chainSaw = 450.00;
	private double emtKit = 1200.00;
	private double toolKit = 175.00 ; 
	
	/**
	 * Method: Main UI Frame
	 * 
	 * Provides the Main UI Frame, entry fields, and associated controls.
	 */
	public FireFighterCostGUI()
	{
		setResizable(false);
		setTitle("Fire Fighter Cost Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		getContentPane().setLayout(null);

		// First Name and Label
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setBounds(10, 11, 63, 14);
		getContentPane().add(lblFirstName);
		txtFirstName = new JTextField();
		txtFirstName.setBounds(10, 26, 86, 20);
		txtFirstName.setColumns(10);
		getContentPane().add(txtFirstName);
		
		// Last Name and Label
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(101, 12, 63, 14);
		getContentPane().add(lblLastName);
		txtLastName = new JTextField();
		txtLastName.setBounds(101, 26, 86, 20);
		txtLastName.setColumns(10);
		getContentPane().add(txtLastName);
		
		// PPE Cost and Label
		JLabel lblPpeCost = new JLabel("PPE Cost");
		lblPpeCost.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPpeCost.setBounds(10, 57, 86, 14);
		getContentPane().add(lblPpeCost);
		txtPpeCost = new JTextField();
		txtPpeCost.setBounds(10, 71, 86, 20);
		getContentPane().add(txtPpeCost);
		txtPpeCost.setColumns(10);
		
		// Radio Cost and Label
		JLabel lblRadioCost = new JLabel("Radio Cost");
		lblRadioCost.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRadioCost.setBounds(10, 102, 86, 14);
		getContentPane().add(lblRadioCost);
		txtRadioCost = new JTextField();
		txtRadioCost.setColumns(10);
		txtRadioCost.setBounds(10, 118, 86, 20);
		getContentPane().add(txtRadioCost);
		
		// Pager Cost and Label
		JLabel lblPagerCost = new JLabel("Pager Cost");
		lblPagerCost.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPagerCost.setBounds(10, 149, 86, 14);
		getContentPane().add(lblPagerCost);
		txtPagerCost = new JTextField();
		txtPagerCost.setColumns(10);
		txtPagerCost.setBounds(10, 167, 86, 20);
		getContentPane().add(txtPagerCost);
		
		// JComboBox and Text Label
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblType.setBounds(10, 198, 86, 14);
		getContentPane().add(lblType);
		comboModel = new DefaultComboBoxModel<String>(boxOptions);
		comboBox = new JComboBox<String>(comboModel);
		comboBox.setBounds(9, 217, 87, 20);
		getContentPane().add(comboBox);
		
		// JTextArea - Main Text box for UI
		textArea = new JTextArea();
		textArea.setFocusable(false);
		textArea.setEditable(false);
		textArea.setBounds(204, 26, 198, 211);
		textArea.setText("Ready for entries ...");	
		
		/**
		 * ActionListener: ADD BUTTON
		 * <ul>
		 *  <li>LAdds fire fighter data to Station.ArrayList<FirstResponder> responders</li>
		 *  <li>Clears the input boxes and the JTextArea</li>
		 *  <li>Displays calculations for the fire fighter being entered</li>
		 * </ul>
		 * 
		 * @throws IllegalArgumentException for empty names
		 * @throws NumberFormatException for invalid cost entries
		 * @throws NumberFormatException for invalid index on combobox ~ 0
		 * 
		 */
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String fname = "";
				String lname = "";
				double ppeCost = 0;
				double radioCost = 0;
				double pagerCost = 0;
				String fftype = "EMT";
				boolean datavalid = false;
			
				// first name cannot be blank
				try
				{
					fname = txtFirstName.getText();
					// check if empty
					if(fname.trim().isEmpty())
					{
						throw new IllegalArgumentException();
					}
					datavalid = true;
				} catch (IllegalArgumentException e1)
				{
					JOptionPane.showMessageDialog(null, "Please Enter A First Name", "Entry Error", JOptionPane.ERROR_MESSAGE);
					txtFirstName.requestFocus();
					datavalid = false;
				}

				// last name cannot be blank
				if (datavalid)
				{
					try
					{
						lname = txtLastName.getText();
						if(lname.trim().isEmpty())
						{
							throw new IllegalArgumentException();
						}
						datavalid = true;
					} catch (Exception e2)
					{
						JOptionPane.showMessageDialog(null, "Please Enter A Last Name", "Entry Error", JOptionPane.ERROR_MESSAGE);
						txtLastName.requestFocus();
						datavalid = false;
					}
				}

				// catch integer or double error
				if (datavalid)
				{
					try
					{
						ppeCost = Double.parseDouble(txtPpeCost.getText());
					} catch (NumberFormatException e3)
					{
						JOptionPane.showMessageDialog(null, "PPE Cost Error, Check Entry", "Entry Status Error", JOptionPane.ERROR_MESSAGE);
						txtPpeCost.requestFocus();
						datavalid = false;
					}
				}

				// catch integer or double error
				if (datavalid)
				{
					try
					{
						radioCost = Double.parseDouble(txtRadioCost.getText());
						datavalid = true;
					} catch (NumberFormatException e4)
					{
						JOptionPane.showMessageDialog(null, "Radio Cost Error, Check Entry", "Entry Status Error", JOptionPane.ERROR_MESSAGE);
						txtRadioCost.requestFocus();
						datavalid = false;
					}
				}

				// catch integer or double error
				if (datavalid)
				{
					try
					{
						pagerCost = Double.parseDouble(txtPagerCost.getText());
						datavalid = true;
					} catch (NumberFormatException e5)
					{
						JOptionPane.showMessageDialog(null, "Pager Cost Error, Check Entry", "Entry Status Error", JOptionPane.ERROR_MESSAGE);
						txtPagerCost.requestFocus();
						datavalid = false;
					}
				}

				// check for combobox errors
				if (datavalid)
				{
					try
					{
						fftype = comboBox.getSelectedItem().toString();
	
						// check is the user 
						if (comboBox.getSelectedItem() == "Select..")
						{
							throw new NumberFormatException();
						}
						datavalid = true;
					}
					catch (NumberFormatException e6)
					{
						JOptionPane.showMessageDialog(null, "Please Select A Fire Fighter Type", "Type Selection Error", JOptionPane.ERROR_MESSAGE);
						comboBox.requestFocus();
						datavalid = false;
					}
				}

				// only use the switch if datavalid
				if (datavalid)
				{
					// clear the main text area first
					clearUI();
					
					// switch for EMT, Wildland, or Structure Fire Fighter
					switch (fftype)
					{
						case "EMT": // Fire Fighter EMT
									emt = new FireFighterEmt(
									fname,
									lname,
									ppeCost,
									radioCost,
									pagerCost,
									emtKit);
	
							// add object to responders array list
							station.addResponder(emt);
							textArea.setText(station.toString() + "\n" + emt.toString());
							break;
					
						case "Structure": // Fire Fighter Structure
									structure = new FireFighterStructure(
									fname,
									lname,
									ppeCost,
									radioCost,
									pagerCost,
									toolKit);
	
							// add object to responders array list
							station.addResponder(structure);
							textArea.setText(station.toString() + "\n" + structure.toString());
							break;
	
						case "Wildland": // Fire Fighter Wildland
									wildland = new FireFighterWildland(
									fname,
									lname,
									ppeCost,
									radioCost,
									pagerCost,
									chainSaw);
	
							// add object to responders array list
							station.addResponder(wildland);
							textArea.setText(station.toString() + "\n" + wildland.toString());
							break;
					} // END - Case switch
				}
			}
		});
		btnAdd.setBounds(7, 259, 89, 23);
		getContentPane().add(btnAdd);
		
		/**
		 * ActionListener: Clear
		 * <ul>
		 *  <li>Clears the input boxes and the JTextArea</li>
		 * </ul>
		 * 
		 */
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				clearUI();
			}
			
		});
		btnClear.setBounds(106, 259, 89, 23);
		getContentPane().add(btnClear);
		
		/**
		 * Action Event Handler: Station Cost
		 * <ul>
		 *  <li>Loops through Station.ArrayList<FirstResponder> responders</li>
		 *  <li>Display data for each object (FirsrstResponders) in the array</li>
		 *  <li>Calculates cost for each Fire Fighters plus a summary cost</li>
		 * </ul>
		 */
		JButton btnStationCost = new JButton("Station Cost");
		btnStationCost.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// clear the screen first
				clearUI();
				
				// format and append Station Cost to the JTextArea
				String s = String.format("%-14s %-20s", "Station :", station.getStationName());
				textArea.append(s + "\n\n");
				
				// local variable for total cost calculation
				double grandTotal = 0;
				
				// loop through the array to print responder data
				for (FirstResponder respond : station.getResponders())
				{
					textArea.append(respond.toString());
					textArea.append("\n\n");
					grandTotal += respond.calculateExpense();
				}
				
				// format and append Station Cost to the JTextArea
				String g = String.format("%-14s $%-20.2f", "Station Cost :", grandTotal);
				textArea.append(g);
			}
		});
		btnStationCost.setBounds(205, 259, 118, 23);
		getContentPane().add(btnStationCost);

		// ScrollPane with auto-vertical scroll bar
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setFocusable(false);
		scrollPane.setBounds(205, 26, 216, 211);
		getContentPane().add(scrollPane);
		
		JLabel lblCostSummary = new JLabel("Cost Summary");
		lblCostSummary.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCostSummary.setBounds(267, 11, 103, 14);
		getContentPane().add(lblCostSummary);
	}

	/**
	 * Method: clearUI
	 * <ul>
	 *	<li>Clears the contents of all UI files including the JTextArea</li>
	 * 	<li>Does NOT reset or delete data in the Station.ArrayList<FirstResponders></li>
	 * </ul>
	 */
	private void clearUI()
	{
		txtFirstName.setText("");
		txtLastName.setText("");
		txtPpeCost.setText("");
		txtRadioCost.setText("");
		txtPagerCost.setText("");
		comboBox.setSelectedItem("Select..");
		textArea.setText("");
		txtFirstName.requestFocus();
	} // - END Clear UI
	
	/**	
	 * Method: Main
	 * Launch the application.
	 * 
	 * @param args no arguments for main method
	 * 
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					FireFighterCostGUI frame = new FireFighterCostGUI();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
} /* END - Fire Fighter Cost Calculator */
