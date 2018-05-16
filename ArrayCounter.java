import java.util.*;

public class ArrayCounter{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();		
		int[] test = new int[length];
		for(int z=0;z<length;z++){
			test[z]=sc.nextInt();
		}
		
		int negative=0;		
		int count = test.length;
		int lowest = test[0];
		int sum = 0;
		for (int a=0;a<test.length+1;a++){
			//System.out.println("A"+a);
			for (int i=0;i<test.length-count;i++){
				
				for (int j=i;j<=i+count;j++){
					
					sum += test[j];
					//System.out.println(sum+"\n"+lowest);
					
				}
				if(sum<0){
					negative++;
				}
				
				
			}
			sum=0;
			count--;
		}
		/*System.out.print("|");
		for(int i=0;i<sums.length;i++){
			System.out.print(sums[i]+"|");
		}*/
		
		System.out.println(negative);
	}
	
	
}
