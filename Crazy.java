

import java.net.URI;

import javax.swing.JOptionPane;
	
public class Crazy {
	

		public static void main(String[] args) {
			// 1. Ask the user how many cats they have
String crazycat=JOptionPane.showInputDialog("how many cats do you have");
			// 2. Convert their answer into an int

int cat=Integer.parseInt(crazycat);

// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(cat>3){
JOptionPane.showMessageDialog(null, "Your a crazy cat lady");
}
			// 4. If they have 3 or less, call the method below to show them a cat video
else if(cat<3){
	playVideo("https://www.youtube.com/watch?v=i1H0leZhXcY");}
	

			// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
			if(cat==0){
				playVideo("https://www.youtube.com/watch?v=o5oCLKFbPwA");
			}
		}

		static void playVideo(String videoURL) {
			try {
				URI uri = new URI(videoURL);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}



