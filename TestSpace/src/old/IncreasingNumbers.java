package old;

import javax.swing.JOptionPane;
import javax.swing.*;

public class IncreasingNumbers {
	
	public static void main(String[] args) {
		
		int num1=0, num2=0, num3=0;
		String input, results="";
		boolean entering = true;
		
		JTextField int1Field = new JTextField(5);
		JTextField int2Field = new JTextField(5);
		JTextField int3Field = new JTextField(5);
		

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("int1:"));
		myPanel.add(int1Field);
		myPanel.add(new JLabel("int2:"));
		myPanel.add(int2Field);
		myPanel.add(new JLabel("int3:"));
		myPanel.add(int3Field);
		
		while (entering) {
			int result = JOptionPane.showConfirmDialog(null, myPanel, "Enter 3 integers", JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION) {
			
				num1 = Integer.parseInt(int1Field.getText());
				num2 = Integer.parseInt(int2Field.getText());
				num3 = Integer.parseInt(int3Field.getText());
				entering = false;
			}else {
				JOptionPane.showMessageDialog(null, "You must enter integers in all three");
			}//else
		}//while
//JOptionPane.showMessageDialog(null, "Transaction Completed Successfully"+num1+num2+num3);//uncomment to test this line
		String type = JOptionPane.showInputDialog("Would you like to strictly or leniently evaluate?");
		char typeC = type.toLowerCase().charAt(0);		
		
		if (num1==num2&&num2==num3) {
			results = "These numbers are all the same";
		}else {
			if (num3>num2&&num2>num1) {
				results = "The numbers are increasing steadily.";
			}else if (typeC=='l'&&num3>=num2&&num2>=num1) {
				results = "The numbers are increasing marginally.";
			}else if (num1>num2&&num2>num3) {
				results = "The numbers are decreasing steadily.";
			}else if (typeC=='l'&&num1>=num2&&num2>=num3) {
				results = "The numbers are decreasing marginally.";
			}else {
				results = "The numbers are neither increasing nor decreasing";
			}
		}//if/else
		JOptionPane.showMessageDialog(null, results);
		
	}//main
}//class
