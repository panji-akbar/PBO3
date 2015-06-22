package praktikum_9;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CobaFlowLayout extends JFrame{
	
JButton button;
	
	public CobaFlowLayout() {
		//JFrame a=new JFrame("COYY");
		super("COY");
	button=new JButton("TOMBOL");
		add(button);
		setLayout(new FlowLayout());
		setSize(490,350);
		createLoyuot();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	
	public void  createLoyuot() {
		for (int i=0;i<10;i++)
			add (new JButton("toml " +i));
		
	}

	public static void main(String[] args) {
		new CobaFlowLayout();

	}

}
