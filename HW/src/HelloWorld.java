import java.util.*;
import javax.swing.*;
public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.print("Enter a Phrase: ");
		String phrase = new String();
		Scanner sc = new Scanner(System.in);
		phrase = sc.nextLine();
		int charNum = phrase.length()/2;
		
		for(int n = phrase.length()-1;n>=0; n--) {
			if(phrase.charAt(n)!=' ') {
				System.out.print(phrase.charAt(n));
			}else {
				System.out.print("!");
			}
			
		}
		
		
	}
	
}
