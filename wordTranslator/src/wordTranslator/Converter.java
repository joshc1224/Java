package wordTranslator;

public class Converter {

	private String values;
	private int counter = 0;
	private int maxPerLine;
	public Converter(String input, int maxPerLine) {
		
		byte[] a = input.getBytes();
		
		
		/*System.out.println("10000000");
		System.out.println("26310000");
		System.out.println("84268421");
		System.out.println("--------");*/
		for(int i=0;i<a.length;i++) {
			
			String number = Integer.toBinaryString(a[i]);
			int number1 = Integer.parseInt(number);
			String numberOut = String.format("%08d", number1);
			
			if(i==0) {
				values=numberOut;
				counter++;
			}else if(counter==maxPerLine) {
				values+="\n"+numberOut;
				counter=1;
			}else {
				values+=numberOut;
				counter++;
			}
			
			/*if(i==0) {
				values = numberOut + "-";
			}else if (values.length()>10&&values.charAt(values.length()-10)=='-'&&values.charAt(values.length()-1)=='-'){
				values += numberOut + "\n";
			}else if (i==a.length-1){
				values += numberOut ;
			}else {
				values+=numberOut + "-";
			}
			
			//System.out.println(Integer.toBinaryString(a[i]));
			//System.out.println(Integer.toHexString(a[i]));*/
		}
		
	}
	
	public String getValues() {
		return values;
	}
}
