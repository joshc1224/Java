package solutions;
import java.util.*;
public class Solution {
	
	   public static void main(String[] args)
	   {
	      String[] words = { "Mary", "had", "a", "little", "lamb",
	                         "it's", "fleece", "was", "white", "as",
	                         "snow" };
	            
	      Scanner in = new Scanner(System.in);
	      System.out.print("Word length: ");
	      int wordLength = in.nextInt();
	   
	      boolean found = false;
	      int pos = 0; 
	      int pos2=0;
	      int count = 0;
	      int[] fof=new int[words.length];
	      String check = "'";
	      while (pos<words.length)
	      {
	    	  String temp=words[pos];
	         if (temp.length()==wordLength)
	         {
	        	if(!temp.contains(check)) {
	        		fof[count]=pos;
		            found=true;
		            count++;
	        	}
	            
	         }
	        pos++;
	      }
	   
	      if (found)
	      {
	    	 int[] finalNums= Arrays.copyOf(fof, count);
	         System.out.println("Found " + count +" instance(s) of " +wordLength+"-letter words at indeces "+Arrays.toString(finalNums));
	      }
	      else
	      {
	         System.out.println("No word of length " + wordLength);
	      }
	   }
}