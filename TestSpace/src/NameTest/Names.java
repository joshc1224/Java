package NameTest;

public class Names {
	
	public static String lastNameFirst(String name) {
		
		String lastName="", firstName="", result="";
		if (!name.contains(" ")) {
			result = name;
		}else {
			int i = name.length()-1;
			while (lastName=="") {
			if (name.charAt(i)==' ') {
							
			lastName = name.substring(i+1, name.length());
			firstName = name.substring(0,i);
			result = lastName+", "+firstName;
			
			}else
				i--;
			}
			
					
		   }
		return result;
	}

	public static void main(String[] args) {
		
		String result = Names.lastNameFirst("joshua");
		System.out.println(result);
	}

}
