package praktikum_9;





import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;



public class cobaBorderLayout extends JFrame{
	
	JButton button;
	
	public cobaBorderLayout() {
		//JFrame a=new JFrame("COYY");
		super("COY");
	button=new JButton("TOMBOL");
		add(button);
		setSize(490,350);
		createLoyuot();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}
	
	public void createLoyuot() {
		//add(BorderLayout.n)
		add(BorderLayout.NORTH, new JButton("utara"));
		add(BorderLayout.CENTER, new JButton("tengah"));
		add(BorderLayout.SOUTH, new JButton("seltran"));
		add(BorderLayout.EAST, new JButton("timur"));
	
	}
	
	
	public static void main(String[] args) {
	  new cobaBorderLayout();

	}

}
