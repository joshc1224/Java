package recursionPractice;

import java.util.Scanner;

public class SuperDigit {

	public static void main(String[] args) {
		SuperDigit test = new SuperDigit();
		test.run();
	}
	
	private void run() {
		
		Scanner sc = new Scanner(System.in);
		Long digit = sc.nextLong();
		Long multi = sc.nextLong();
		
		Long digCat = cat(digit, multi);
		System.out.println(digCat);
		System.out.println(super_digit(digCat));
	}
	
	private Long cat(Long digit, Long multi) {
		String digitStr = digit.toString();
		String retu = "";
		for (long i =0;i<multi;i++) {
			retu+=digitStr;
		}
		return Long.parseLong(retu);
	}
	
	private Long super_digit(Long orig) {
		if(orig/10==0) {
			return orig;
		}
		long runs=0;
		while(orig!=0) {
			runs+= orig%10;
			orig = orig/10;
		}
		return super_digit(runs);
	}
}
