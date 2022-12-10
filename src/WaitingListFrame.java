/**
 * WaitingListFrame GUI Class
 * @author Alexis Meis
 * @version 1.0
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IllegalFormatException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.Caret;

public class WaitingListFrame  extends JFrame {

	// Create labels and text fields
	private JLabel firstName = new JLabel("Enter first name");
	private JTextField firstNameInput = new JTextField(10);
	private JLabel lastName = new JLabel("Enter last name");
	private JTextField lastNameInput = new JTextField(10);
	private JLabel numPets = new JLabel("Enter number of pets");
	private JTextField numPetsInput = new JTextField(5);
	private JLabel clientStatus = new JLabel("Existing Client? (True/False)");
	private JTextField clientStatusInput = new JTextField(5);
	private JLabel startDate = new JLabel("Enter start date (mm/dd/yyyy)");
	private JTextField startDateInput = new JTextField(10);
	private JLabel endDate = new JLabel("Enter end date (mm/dd/yyyy)");
	private JTextField endDateInput = new JTextField(10);
	private JButton submit = new JButton("Submit");
	private JButton clear = new JButton("Clear");
	
	public WaitingListFrame() {
		// create new JPanel
		JPanel panel = new JPanel();
		
		// add labels and text fields to panel
		panel.add(firstName);
		panel.add(firstNameInput);
		panel.add(lastName);
		panel.add(lastNameInput);
		panel.add(numPets);
		panel.add(numPetsInput);
		panel.add(clientStatus);
		panel.add(clientStatusInput);
		panel.add(startDate);
		panel.add(startDateInput);
		panel.add(endDate);
		panel.add(endDateInput);
		panel.add(submit);
		panel.add(clear);
		
		// create a clear button listener 
		ClearButtonListener cbl = new ClearButtonListener();
		clear.addActionListener(cbl);
		
		// create a submit button listener
		SubmitButtonListener sbl = new SubmitButtonListener();
		submit.addActionListener(sbl);
		
		add(panel);
	}
	
	// Verify user input
	public class MyInputVerifier extends InputVerifier {

		@Override
		public boolean verify(JComponent input) {
			String status = ((JTextField) clientStatusInput).getText();
			try {
				boolean value = Boolean.parseBoolean(clientStatusInput.getText());
			} catch(IllegalFormatException e) {
			}
			return false;
		}
		
	}
	
	class ClearButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// set text fields to nothing when clear button is pressed
			firstNameInput.setText("");
			lastNameInput.setText("");
			numPetsInput.setText("");
			clientStatusInput.setText("");
			startDateInput.setText("");
			endDateInput.setText("");
		}
	}
	
	class SubmitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			// Get user input
			String firstName = firstNameInput.getText();
			String lastName = lastNameInput.getText();
			// parse int for string input
			int numPets = Integer.parseInt(numPetsInput.getText());
			// parse boolean for string input
			boolean clientStatus = Boolean.parseBoolean(clientStatusInput.getText());
			// create DateTimeFormatters and parse LocalDate for string input
			DateTimeFormatter startdateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate startDate = LocalDate.parse(startDateInput.getText(), startdateFormat);
			DateTimeFormatter enddateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate endDate = LocalDate.parse(endDateInput.getText(), enddateFormat);
			
			// Create new Client object using user iniput
			Client user = new Client(firstName, lastName, numPets, clientStatus, startDate, endDate);
			
			// store new Client object in queue data structure
			Queue<Object> clientList = new LinkedList<Object>();
			clientList.add(user);
			
			// transfer queue data structure into an ArrayList
			ArrayList<Object> newClientList = new ArrayList<Object>(clientList);
			
			// Output user info to the console
			System.out.println(newClientList.toString());
			
		}
		
	}
}
