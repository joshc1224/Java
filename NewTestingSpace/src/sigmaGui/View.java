package sigmaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View implements ActionListener{

	private JTextField nums;
	private JButton getSigma;
	private JButton getFactorial;
	private JLabel numDisplay;
	private JLabel numLabel;
	public View() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		
		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));
		
		//String sigma = "\U03A3";
		
		nums = new JTextField(5);
		getSigma = new JButton("Sigma");
		getSigma.addActionListener(this);
		getFactorial = new JButton("!");
		getFactorial.addActionListener(this);
		numDisplay = new JLabel("Out");
		numLabel = new JLabel("NumLabel");
		
		JPanel text = new JPanel();
		text.setLayout(new GridLayout(3,1));
		
		text.add(nums);
		
		text.add(numDisplay);
		
		text.add(numLabel);
		
		main.add(text);
		main.add(getSigma);
		main.add(getFactorial);
		frame.add(main);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent pEvent) {
		if(pEvent.getActionCommand().equals("Sigma")) {
			
			int arg0=Integer.parseInt(nums.getText());
			numDisplay.setText(Integer.toString(Maths.sigma(arg0)));
			numLabel.setText(arg0+" Sigma");
		}
		if(pEvent.getActionCommand().equals("!")) {
			int arg0=Integer.parseInt(nums.getText());
			numDisplay.setText(Integer.toString(Maths.factorial(arg0)));
			numLabel.setText(arg0+"!");
		}
	}
	
	
	
}
