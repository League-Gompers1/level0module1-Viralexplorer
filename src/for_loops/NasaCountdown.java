package for_loops;

import java.io.StringWriter;

import javax.swing.JOptionPane;

public class NasaCountdown {
public static void main(String[] args) {
	//>T^T<        <
	
	
	String S=JOptionPane.showInputDialog("prepare for lift off");
	int how=(Integer.parseInt(S));
for(int i=how;i>=0;i--){
	System.out.println(i);
}
JOptionPane.showMessageDialog(null,"blastoff");
}
}
