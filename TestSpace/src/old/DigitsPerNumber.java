package old;

import javax.swing.JOptionPane;
import java.math.*;

public class DigitsPerNumber {
	
	public static void main(String[] args) {
		
		int digits=0;
		String input;
		long number;
		
		input = JOptionPane.showInputDialog("Enter an integer and receive its digit count.");
		number = new BigInteger(input, 16).longValue();
		
		while (number>0) {
			digits ++;
			number = number/10;
		}
		JOptionPane.showMessageDialog(null, "The number you entered is "+digits+" digits long.");
	}

}
