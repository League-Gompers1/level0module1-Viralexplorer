6
package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {

		Random ran= new Random();
		int number;
		number =ran.nextInt(100); 
		
		
		for (int i = 0; i < 100; i++) {
			String ans = JOptionPane.showInputDialog("Guess the number");
			int guess = Integer.parseInt(ans );
		if(guess > number){JOptionPane.showInputDialog("too high"); }
		else if(guess< number){JOptionPane.showInputDialog("Too low");}
		else{JOptionPane.showInputDialog("Yes thats correct, you win a box ");i=100;}
		}
}
	
	
	
}