package old;

public class MoveToContact {
	public static void main(String[] args) {
	
		double num1=2.75, num2=3.25, numTest=2.9;
		double i = 1.0;
			while (numTest%num2!=0) {
				numTest = num1*i;
				System.out.println(i+" "+numTest+" "+num2);
				i++;
			}
	}
}
