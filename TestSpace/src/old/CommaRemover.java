package old;

import javax.swing.JOptionPane;

public class CommaRemover {
	
	public static void main(String[] args) throws NumberFormatException{
		
		String input = JOptionPane.showInputDialog("enter the number:");
		String newInput = "   "+input;
		System.out.println(newInput.length());
		String output = newInput.substring(newInput.length()-7,  6)+newInput.substring(newInput.length()-3);
		JOptionPane.showMessageDialog(null, output);
		
	}

}
