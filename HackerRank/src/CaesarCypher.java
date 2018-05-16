import java.util.*;

public class CaesarCypher {

	public static void main(String[] args) {
	
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		String check = "abcd";
		String out="";
		int key =25;
		System.out.println(alpha.indexOf('a'));
		
		for(int i=0;i<check.length();i++) {
			String temp = alpha;
			while (temp.length()<alpha.charAt(check.charAt(i))+key) {
				temp+=temp;
			}
			out += alpha.substring(alpha.indexOf(check.charAt(i)+key), alpha.indexOf((check.charAt(i)+key)+1));
		}
		System.out.println(out);
	}
}
