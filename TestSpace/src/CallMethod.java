public class CallMethod
{
   public static void main(String[] args)
   {
      String river = "Mississippi";
      

      // Call the Strings.abbreviate method to 
      // get an abbreviation of this string of length 6
      // and print the result.

      String result1 = Strings.abbreviate(river, 6);
      System.out.println(result1);

      // Repeat with this string and length 6.

      String greeting = "Hello";
         String result2 = Strings.abbreviate(greeting, 6);
      // Still with the greeting string, change the length to 4.
         String result3 = Strings.abbreviate(greeting, 4);
      // And to 3
         String result4 = Strings.abbreviate(greeting, 3);
      // And to 2
         String result5 = Strings.abbreviate(greeting, 2);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
      System.out.println(result5);
   }
}