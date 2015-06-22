package praktikum_9;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CobaGUI {

	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("halo coy");
		JLabel label= new JLabel("label coy");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		frame.setSize(500, 400);
		frame.setVisible(true);
	}
}

