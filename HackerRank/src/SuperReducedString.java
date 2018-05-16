import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SuperReducedString {

	public static void main(String[] args) {
		
		String test ="saveChangesInTheEditor";
		
		System.out.println(countCamelCase(test));
		
	}
	
	
	public static int countCamelCase(String in) {
		
		int count =1;
		String output =in;
		
		Pattern check = Pattern.compile("[A-Z]");
		Matcher match = check.matcher(output);
		
		while (match.find()) {
			count ++;
		}
		return count;
	}
	
	public static String removePair(String in, int index) {
		
			String toGoBack = in.substring(0,index)+in.substring(index+2);
			return toGoBack;
		
	}
		
}
