package wordTranslator;

public class Translator {

	public static void main(String[] args) {
		
		Converter test = new Converter("dadmomcatdogfartinnsunsoneartarartgatgasfaryoumuaredtedget", 3);
		if (test.getValues()==null) {
			System.out.println("Empty String");
		}else {
			
			System.out.println(test.getValues());
		}
		
			
		}
	
}
