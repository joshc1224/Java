package sigmaGui;

public class Maths {

	
	public static int sigma(int arg0) {
	
		int retVal=0;
		
		for(int i=0;i<=arg0;i++) {
			retVal+=i;
		}
		
		return retVal;
	}
	
	public static int factorial(int arg0) {
		if(arg0==1) {
			return 1;
		}else {
			return arg0*factorial(arg0-1);
		}
	}
}
