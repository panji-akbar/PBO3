package praktikum_9;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaExtendGUI extends JFrame{
	JButton button;
	
	public CobaExtendGUI() {
		//JFrame a=new JFrame("COYY");
		super("COY");
		button=new JButton("TOMBOL");
		add(button);
		setSize(150,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	static CobaExtendGUI gui;
	public static void main(String[] args) {
	  gui=new CobaExtendGUI();

	}

}
