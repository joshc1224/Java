package old;

import java.util.Scanner;

public class Floor13 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int floor, actualFloor;
		
		System.out.print("enter the floor: ");
		floor = sc.nextInt();
		
		if (floor>13) {
			
			actualFloor=floor-1;
			
		}else {
			
			actualFloor=floor;
		}
		System.out.println(actualFloor);
	}
	
	
	

}
