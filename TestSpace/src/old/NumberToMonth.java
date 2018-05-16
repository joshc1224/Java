package old;

import javax.swing.JOptionPane;

public class NumberToMonth {
	
	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Enter a number and get the corresponding month:");
		int num1 = Integer.parseInt(num);
		
		switch (num1) {
		
		case 1:
			JOptionPane.showMessageDialog(null, "January\nHappy New Year!");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "February");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "March");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "April");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "May");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "June");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "July");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "August");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Septempber");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "October");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "November");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "December");
			break;
		default:
			JOptionPane.showMessageDialog(null, "There are only 12 months, and none of them are negative");
			break;
		
		}//switch
		
	}//main
}//class


