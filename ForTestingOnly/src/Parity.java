
public class Parity {

	public static void main(String[] args) {
		
		System.out.println(parity("0000000"));
		
	}
	
	
	public static char parity(String s) {
		if (s.equals("0")){
			return '0';
		}else if (s.equals("1")) {
			return '1';
		}
		if (s.charAt(0)==parity(s.substring(1))) {
			return'0';
		}else {
			return '1';
		}
	}
	
}
