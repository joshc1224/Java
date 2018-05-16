import java.util.Scanner;

public class NumberAccumulator {
	
	public static void main(String[] args) {
		
		int count=0;
		double totalSalary=0.0, average=0.0;
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		
		while (!done) {
			
			System.out.print("Enter the next salary, or -1 to receive the average: ");
			if (sc.hasNextDouble()) {
				totalSalary = totalSalary + sc.nextDouble();
				count ++;
			}else if (sc.nextInt()==-1) {
				done = true;
			}else {
				System.out.println("Invalid Input");
				sc.next();
			}
		}
		average = totalSalary/count;
		System.out.println("The average of the "+count+" salaries is "+average+".");

		
	}
	
	
}
