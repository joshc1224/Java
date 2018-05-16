public class Strings
{
   /**
      Forms an abbreviated version of a string.
      @param str a string
      @param length the number of characters to show in the 
      abbreviation
      @return str, if it has at most length characters, or a string
      of the requested length consisting of the first characters of
      str and ...
   */
   public static String abbreviate(String str, int length)
   {
      String result = "";
      if (str.length() <= length) 
      {
         result = str;
      }
      else if (length >= 3)
      {
         result = str.substring(0, length - 3) + "...";
      }
      else if (length >= 0)
      {
         result = "...".substring(0, length);
      }
      return result;
   }
}
