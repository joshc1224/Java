package TestingGround;

import java.util.*;
import javax.swing.*;

public class Day26 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name1 , name2;

		// read in both strings using nextLine b/c they COULD contain spaces

		System.out.print("First string example: ");
		name1 = in.next(); // does not accept spaces from the user

		System.out.print("Second string example: ");
		in.nextLine();
		name2 = in.nextLine(); // accepts spaces from the user

		System.out.println("\nname1 = " + name1);
		System.out.println("\nname2 = " + name2);
		}
		
	}


