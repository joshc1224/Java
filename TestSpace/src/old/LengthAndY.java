package old;

import javax.swing.JOptionPane;

public class LengthAndY {
	
	public static void main(String[] args) {
		
		
		String word = JOptionPane.showInputDialog("enter a word\nand I'll tell you some stuff:");
		String word1 = word.toLowerCase();
		String output = word;
		
		if (word1.length()<5) {

			output = output + "\nThis word is short";
			
		}else {
			
			output = output + "\nThis word is not short";
			
		}//if/else
		
		if (word1.length()>=10) {
			
			output = output + "\nThis word is long";
			
		}else {
			
			output = output + "\nThis word is not long";
			
		}//if/else
		
		if (word1.charAt(word1.length()-1)=='y') {
			
			output = output + "\nThis word ends with a y";
			
		}else {
			
			output = output +"\nThis word does not end with a y";
			
		}//if/else
		
		if (word1.charAt(word1.length()-1)==word1.charAt(0)) {
			
			output = output + "\nThis word starts and ends with "+word1.charAt(0);
			
		}else {
			
			output = output + "\nThis word has different first and last letters";
			
		}//if/else
		
		JOptionPane.showMessageDialog(null, output);
	}//main

}//class
