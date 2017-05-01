package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
	String danielPower = "hacking";
	String ebukaPower = "endurance";
	String christopherPower = "reading";
	String jesusPower = "speed";
	String jasonPower = "smarts";
	String alfredoPower = "gamimg";
	String chrisPower = "math";
	String joshuaPower = "inspiration";

        // 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("enter a name");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals("daniel")){
	JOptionPane.showMessageDialog(null,"Daniel's superpower is "+danielPower);
} else if(name.equals("ebuka")){
	JOptionPane.showMessageDialog(null,"ebuka's superpower is "+ebukaPower);
} else if(name.equals("christopher")){
	JOptionPane.showMessageDialog(null,"christopher's superpower is "+christopherPower);
}else if(name.equals("jesus")){
	JOptionPane.showMessageDialog(null,"jesus's superpower i s"+jesusPower);
}else if(name.equals("jason")){
	JOptionPane.showMessageDialog(null,"jason's superpower is "+jasonPower);
}else if(name.equals("alfredo")){
	JOptionPane.showMessageDialog(null,"alfredo's superpower is "+alfredoPower);
}else if(name.equals("chris")){
	JOptionPane.showMessageDialog(null,"chris's superpower is "+chrisPower);
}else if(name.equals("joshua")){
	JOptionPane.showMessageDialog(null,"joshua's superpower is "+joshuaPower);
}
if (name.equals("ebuka"));
if (name.equals("christopher"));
if (name.equals("jesus"));
if (name.equals("jason"));
if (name.equals("alfredo"));
if (name.equals("chris"));
if (name.equals("joshua"));
    
}
}