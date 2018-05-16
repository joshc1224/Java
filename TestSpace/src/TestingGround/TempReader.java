package TestingGround;

import java.util.Scanner;

public class TempReader {
	
	public static void main(String[] args) {
		
		String scaleTemp="", result="";
		char scaleFinal='a';
		int temperature=0;
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		
		while (running) {
			System.out.print("Enter the temperature along with F or C for the state of water: ");
			if (sc.hasNextInt()){
			
				temperature = sc.nextInt();
				scaleTemp = sc.next();
				scaleFinal = scaleTemp.toLowerCase().charAt(0);
			
				if (scaleFinal == 'c') {
				
					if (temperature>=100) {
						result = "gaseous";
						running = false;
					}else if (temperature<=0) {
						result = "solid";
						running = false;
					}else {
						result = "liquid";
						running = false;
					}
				
				}else if (scaleFinal == 'f') {
				
					if (temperature<=32) {
						result = "freezing";
						running = false;
					}else if (temperature>=212) {
						result = "gaseous";
						running = false;
					}else {
						result = "liquid";
						running = false;
					}
				
				}else {
					System.out.println("You must enter Celsius or Fahrenheit");
				}//else
			
			}else {
				System.out.println("Enter the Number followed by a space, then the letter of the scale F or C.");
				sc.next();
			}//else
		}//while
		sc.close();
		System.out.println("Water is "+result+" at that temperature.");
	}//main
}//class
