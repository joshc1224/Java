package solutions;
import java.util.*;
public class Solution2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] results= new int[10];
		int l,r, count = 0;
		l = sc.nextInt();
		r = sc.nextInt();
		
		for (int i=l;i<=r;i++) {
			for (int j=i;j<=r;j++) {
				
				if (count>=results.length) {
					results = Arrays.copyOf(results, 2*results.length);
				}
				//System.out.println("count"+count);
				results[count] = calcXOR(i,j);
				//System.out.println(calcXOR(i,j));
				count ++;
			}
		}
		//results = Arrays.copyOf(results, count);
		//System.out.println(Arrays.toString(results));
		System.out.println(findMax(results, count));
		
	}
	public static int calcXOR(int x, int y) {
		
		int count=0;
		String a = Integer.toBinaryString(x);
		String b = Integer.toBinaryString(y);
		String XOR="";
		//System.out.println(a.length()+" "+b.length());
		if (a.length()<b.length()) {
			//System.out.println("a must get bigger");
			while (a.length()<b.length()) {
				a = "0" + a.substring(0);
			}
		}else if(b.length()<a.length()) {
			//System.out.println("b must get bigger");
			while (b.length()<a.length()) {
				b ="0"+b.substring(0);
			}
		}
		if(a.length()==b.length()) {
			for (int i =0;i<a.length();i++) {
				if(a.charAt(i)==b.charAt(i)) {
					XOR+="0";
					//System.out.println(XOR);
				}else {XOR+="1";}
			}
		}
		int decimalValue = Integer.parseInt(XOR,2);
		//System.out.println(a+" "+b+"\n"+XOR+"\n"+decimalValue);
		return decimalValue;
	}
	
	public static int findMax(int[] arr, int count) {
		
		int max = arr[0];
		if (count>0) {//make sure there are numbers in the array
			for (int i = 0; i<count;i++) {//loop through all elements to determine if they are largest
				if (arr[i]>max){
					max = arr[i];
				}
			}
		}
		return max;
	}
}
