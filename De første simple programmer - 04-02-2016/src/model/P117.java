package model;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class P117 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		URL imageLocation = new URL("http://vignette2.wikia.nocookie.net/swfanon/images/a/aa/Hand.gif");
		JOptionPane.showMessageDialog(null, "Greetings", "Hand", JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(imageLocation));
	}

}
