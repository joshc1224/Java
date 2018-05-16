package SmartIDE;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex="/\\*.+([\\n\\*/])?|//.+";
		ArrayList<String> checks = new ArrayList<>();
		String toCheck1="abcde fghi 093 /*jklm 34209 nop qrs\n";
		String toCheck2="second Line\nfinalLine*/";
		checks.add(toCheck1);
		checks.add(toCheck2);
		while(sc.hasNextLine()) {
			String temp = RegExCheck(regex, sc.nextLine());
			if(temp.length()!=0)
			System.out.println(temp.trim());
			
			if (temp.length()!=0&&temp.charAt(0)=='/'&&temp.charAt(1)=='*'&&temp.charAt(temp.length()-1)!='/'&&temp.charAt(temp.length()-2)!='*') {
				boolean inside = true;
				while (inside) {
					//System.out.println("Inside");
					String regexIn=".+|.+\\*/";
					String inTemp= RegExCheck(regexIn, sc.nextLine());
					if (inTemp.length()!=0)
					System.out.println(inTemp.trim());
					if (inTemp.length()!=0&&inTemp.charAt(inTemp.length()-1)=='/'){
						inside=false;
						//System.out.println("Quitting");
					}
				}
			}
		}
		
		sc.close();
		
	}
	
	
	public static String RegExCheck(String regEx, String toCheck) {
		
		String sendUp = "";
		Pattern check = Pattern.compile(regEx);
		Matcher match = check.matcher(toCheck);
		
		while (match.find()) {
			if(match.group().length()!=0) {
				sendUp+=match.group().trim();
				//System.out.println(match.group().trim());
			}
			//System.out.println("start "+match.start());
			//System.out.println("end "+match.end());
		}
		return sendUp;
	}
	
}
