package old;

import java.util.Scanner;
import java.text.NumberFormat;

public class DoubleBankCalculator {
	
	public static void main(String[] args) {
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		double amountPerYr, balance, initialDeposit;
		int year=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your initial deposit? ");
		initialDeposit = sc.nextInt();
		
		System.out.print("What is your interest rate? ");
		int rate = sc.nextInt();
		sc.close();
		
		balance = initialDeposit;
		while (balance<initialDeposit*2&&year<20) {
			
			double interest = balance * ((double)rate/100);
			balance = balance + interest;
			year++;
			
		}
		
		if (balance>initialDeposit*2) {
		System.out.println("Your deposit will double in year "+year+". The actual amount will be "+fmt.format(balance));
		}else {
			System.out.println("Your deposit will not double by year "+year+" when your balance will be "+fmt.format(balance)+".");
		}
	}

}
