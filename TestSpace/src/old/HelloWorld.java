package old;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {
	
	public static void main(String[] args) throws Exception {
		
		String name="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		name = sc.nextLine();
		
		System.out.println("Hello "+name);
		JOptionPane.showMessageDialog(null, "Hello, "+name, "Testing 1.2.3.", JOptionPane.PLAIN_MESSAGE);//dialog box pops behind editor
	}
	
	
	

}
