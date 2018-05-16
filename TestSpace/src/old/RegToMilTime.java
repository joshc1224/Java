package old;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegToMilTime {
	
	public static void main(String[] args) {
		
		int originalTime, milTime=0;
		String suffix="";
		Scanner sc = new Scanner(System.in);
		Logger.getGlobal().setLevel(Level.OFF);//change to info to see logger statements
		
		System.out.print("Enter a time in American notation(9 AM): ");
		if (sc.hasNextInt() && sc.hasNext()) {
			
			originalTime = sc.nextInt();
			suffix = sc.next();
			suffix = suffix.toLowerCase();
			Logger.getLogger("global").info(originalTime+" "+suffix);
			
			if (originalTime==12&&suffix.equals("pm")){
		
				milTime = originalTime*100;
				
			}else if (originalTime==12&&suffix.equals("am")) {
				
				milTime= (originalTime+12)*100;
			
			}else {
				
				if (suffix.equals("am")) {
				
					Logger.getLogger("global").info("correct input");
					milTime = originalTime * 100;
					
				}else if (suffix.equals("pm")) {
				
					milTime= (originalTime + 12)*100;
			
				}//if2
			
				else {
					System.out.println("incorrect suffix input");
				}
		
				}//if1
				
		
		
		}//ifmain
		
		else {
			System.out.println("totally incorrect input");
		}
		if (milTime<1000) {
			String newTime = Integer.toString(milTime);
			String finalTime = "0"+newTime;
			System.out.println("The time in Military Time is: "+finalTime);
		}else {
		System.out.println("The time in Military Time is: "+milTime);
		}
	}//main
}//class