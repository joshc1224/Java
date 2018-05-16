
public class testing {
	
	public static void main(String[] args) {
		
		int[] test = {6,2,4,5,2,1,6,2,5};
		
		System.out.println(foo(test, 6,0));
		
	}
	
	
	public static int foo(int[] a, int b, int j)
	 { 
	   if (j < a.length)
	 { 
	       if (a[j] != b)
	 {    
	        return foo(a, b, j+1);   
	     } 
	else 
	{    
	        return foo(a, b, j+1) + 1;   
	     } 
	   }
	 else
	 { 
	       return 0; 
	   }
	}
}
