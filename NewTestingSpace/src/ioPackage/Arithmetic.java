package ioPackage;

public class Arithmetic {

	public static void main(String[] args)
	   {
	      System.out.println(check("3", "+", "4"));
	    /*  call(3, "-", 4, "-1");
	      call(3, "*", 4, "12");
	      call(3, "@", 4, "java.lang.IllegalArgumentException");
	      call(13, "/", 4, "3");
	      call(13, "/", 0, "java.lang.IllegalArgumentException");*/
	   }

	   public static boolean check(String a1, String op, String b1)
	   {
	      try
	      {
	    	  int a =Integer.parseInt(a1);
	    	  int b = Integer.parseInt(b1);
	         compute(a, op, b);
	      }
	      catch (IllegalArgumentException ex)
	      {
	         return false;
	      }
	     return true;
	   }
	
	
	public static int compute(int value1, String operator, int value2) {
		
		switch (operator) {
			
			case "+":
				return value1+value2;
			case "-":
				return value1-value2;
			case "*":
				return value1*value2;
			case "/":
				if (value2!=0) {
					return value1/value2;
				}else {throw new IllegalArgumentException("cannot divide by zero");}
				
			default:
				throw new IllegalArgumentException("Invalid operator");
		}	
	}
	
}
