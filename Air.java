import javax.swing.JOptionPane;
public class Air {
	// Copyright Wintriss Technical Schools 2013
	

	/**
	 * Airline registration 
	 * 
	 * You are writing a program for a new airline to take their registration information at the check-in counter
	 * and print their boarding pass. You need to collect the following information: 
	 * 		First name 
	 * 		Last name
	 * 		Destination airport 
	 * 		Birthday (for security purposes) 
	 * 		Male/female (for security purposes) 
	 * 
	 * Print the boarding pass in this format:
	 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
	 * Traveling to: DESTINATION
	 * 
	 * Toolbox: main() method, JOptionPane.showInputDialog, variables
	 * 
	 **/
	public static void main(String[] args) {
		
	
	String air=JOptionPane.showInputDialog("what is your first name");
	String plane=JOptionPane.showInputDialog("what is your last name");
	String docks=JOptionPane.showInputDialog("what airport are you going to");
	String hello=JOptionPane.showInputDialog("When is your birthday(for security purposes");
	String port=JOptionPane.showInputDialog("Are you a Male or Female(for security purposes");
	JOptionPane.showMessageDialog(null,plane+"/"+air+(hello+port)+"\n"+"Traveling to" +docks );
	
	
	
	
	
}
}


	/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
	*/

