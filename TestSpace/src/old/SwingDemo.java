package old;

import java.awt.FlowLayout;
import javax.swing.*;

public class SwingDemo {
	
	public static void main(String[] args) {
		
		Abc obj = new Abc();
		
	}

}
class Abc extends JFrame{
	
	public Abc() {
				
		JLabel l = new JLabel("Hello World");
		JLabel l1 = new JLabel("Welcome Josh");
				
		add(l);
		add(l1);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
