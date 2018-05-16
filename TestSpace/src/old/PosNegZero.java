package old;

import javax.swing.JOptionPane;

public class PosNegZero {
	
	public static void main(String[] args) {
		
		int inputNum;
		String input, result;
		
		input = JOptionPane.showInputDialog("Enter an integer to find out negative, positive, or zero.");
		inputNum = Integer.parseInt(input);
		
		if (inputNum==0) {
			result = "The number you entered is zero.";
		}else if (inputNum>0) {
			result = "The input number you entered is positive.";
		}else {
			result = "The input number is negative.";
		}//else
		
		JOptionPane.showMessageDialog(null, result);
		
	}//end main
}//end class
