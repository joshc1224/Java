package old;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three strings:");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		
		//compare the first two strings and swap them
		//System.out.println("Adam".compareTo("David"));
		String temp;
		if(s1.compareTo(s2)>0) {
			temp=s1;
			s1=s2;
			s2=temp;
		}
		if (s1.compareTo(s3)>0) {
			temp=s1;
			s1=s3;
			s3=temp;
		}
		if (s2.compareTo(s3)>0) {
			temp=s2;
			s2=s3;
			s3=temp;
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
	
}
