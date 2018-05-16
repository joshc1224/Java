package old;

import java.util.Scanner;

public class NameGiver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fname, lname, fullName;
		
		System.out.print("Enter your first and last names: ");
		fname = sc.next();
		lname = sc.next();
		fullName = (lname+", "+fname);
		
		System.out.print(fullName);
		
	}

}
