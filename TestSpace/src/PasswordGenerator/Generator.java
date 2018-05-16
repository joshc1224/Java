package PasswordGenerator;

public class Generator {
	
	private String password="";
	
	public String getPassword(){
		return password;
	}
	
	public void makePassword(int length) {
		
		
		
		for (int i=0;i<length-2;i++) {
			password=password + randomCharacter("abcdefghijklmnopqrstuvwxyz");
		}
		String numI = randomCharacter("1234567890");
		String symI = randomCharacter("+-*/?!@#$%&");
		password = insertAtRandom(password, numI);
		password = insertAtRandom(password, symI);
	
	}
	public String randomCharacter(String list) {
		
		int n = list.length();
		int r = (int)(n*Math.random());
		return list.substring(r, r+1);
	}
	public String insertAtRandom(String original, String toInsert) {
		
		String output = "";
		int l = original.length();
		int n = (int)((l+1)*Math.random());
		output = original.substring(0, n)+toInsert+original.substring(n);
		return output;
	}
	//public static void main(String[] args) {
	//	System.out.println(makePassword(10));
	//}
}
