package testing;
import java.util.ArrayList;
import java.util.List;
public class firstInSet {

	public static int firstInSet1(String input, String setCheck) {
		int result=0;
		ArrayList<String>  inputList = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>();

		for (int i=0;i<setCheck.length();i++) {
			list.add(setCheck.substring(i, i+1));
		}
		
		
		for (int i=0;i<input.length();i++)
			if (list.contains(input.substring(i,i+1))){
				 result = i;
			}else {
				result = -1;
			}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(firstInSet.firstInSet1("spring", "aeiou"));
	}

}
