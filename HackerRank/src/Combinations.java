import java.util.*;

public class Combinations {
	public String inputstring;
	public StringBuilder output = new StringBuilder();
	public String fin ="";
	public Combinations(String input) {
		inputstring = input;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String one = sc.nextLine();
		String two = sc.nextLine();
		sc.close();
		Combinations combos1 = new Combinations(one);
		Combinations combos= new Combinations(two);
		combos.combine(0);
		combos1.combine(0);
		//System.out.println(combos.fin);
		//System.out.println(combos1.fin);
		String[] comboAr = combos.fin.split(" ");
		String[] combo1Ar = combos1.fin.split(" ");
		
		ArrayList<String> printer = findMatches(comboAr, combo1Ar);
		int longest=0;
		for(String x:printer) {
			if(x.length()>longest)
				longest=x.length();
		}
		System.out.println(longest);
	}
	
	 private void combine(int start ){
	        for( int i = start; i < inputstring.length(); ++i ){
	            output.append( inputstring.charAt(i) );
	            //System.out.println( output );
	            fin+=output+" ";
	            if ( i < inputstring.length() )
	            combine( i + 1);
	            
	            output.setLength( output.length() - 1 );
	          
	        }
	 }
	 public static ArrayList<String> findMatches(String[] one, String[] two){
		 ArrayList<String> newList = new ArrayList<>();
		 for (int i=0;i<one.length;i++	) {
			 for(int j=0;j<two.length;j++) {
				 if (one[i].equals(two[j])) {
					 newList.add(one[i]);
				 }
			 }
		 }
		 return newList;
	 }
}