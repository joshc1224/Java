package testing;

public class WordMasker {
	
	public static String masker(String input) {
		String result="";
		
		for (int i=input.length()-1;i>=0;i--) {
			result += "*";
		}
		return result;
	}
	


	public static void main(String[] args) {
		String result = WordMasker.masker("Joshua");
		System.out.println(result);
	}
	
}