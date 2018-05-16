package helloWorld;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class View {

	public View() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(200,200));
		
		Border blackLine = BorderFactory.createLineBorder(Color.black);
		
		
		frame.setLayout(new GridLayout(2,2));
		
		JLabel labelA = new JLabel("A", SwingConstants.CENTER);
		labelA.setBorder(blackLine);
		JLabel labelB = new JLabel("B", SwingConstants.CENTER);
		labelB.setBorder(blackLine);
		JLabel labelC = new JLabel("C", SwingConstants.CENTER);
		labelC.setBorder(blackLine);
		JLabel labelD = new JLabel("D", SwingConstants.CENTER);
		labelD.setBorder(blackLine);
		
		frame.add(labelA);
		frame.add(labelB);
		frame.add(labelC);
		frame.add(labelD);
		
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		
	}
	
}
