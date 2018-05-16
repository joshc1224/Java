package PasswordGenerator;

public class GeneratorTest {
	
	public static void main(String[] args) {
		
		Generator pwd = new Generator();
		pwd.makePassword(100);
		System.out.println(pwd.getPassword());
	}
	

}
