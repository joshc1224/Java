import java.util.*;

public class ArrayListCluster{
	
	public static void main(String[] args){
		//Create ArrayLists to hold variables
		ArrayList<ArrayList> xList = new ArrayList<>();
		ArrayList<String> outList = new ArrayList<>();
		ArrayList<Integer> sizes = new ArrayList<>();
		//Open Scanner
		Scanner sc = new Scanner(System.in);
		
		int numLists = sc.nextInt();
		
		//Take in the sizes to check for length later, and take in th contents of each list
		//make it an array list and stor in the xList variable
		
		for (int i = 0; i<numLists;i++){
			int size = sc.nextInt();
			sizes.add(size);
			ArrayList<Integer> iList = new ArrayList<>();
			for(int j=0;j<size;j++){
				
				iList.add(sc.nextInt());
		
			}
			xList.add(iList);
		}
		/*for(int i=0;i<xList.size();i++){
			System.out.println(sizes.get(i)+" "+xList.get(i).get(1));
		}*/
		
		//take in queries and store results in ArrayList outList
		int numQueries = sc.nextInt();
		
		for(int i=0;i<numQueries;i++){
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(y>sizes.get(x-1)|y<0){
				//System.out.println("ERROR!");
				outList.add("ERROR!");
			}else{
				//System.out.println("Added: "+xList.get(x-1).get(y-1));
				outList.add(xList.get(x-1).get(y-1).toString());
			}
		}
		
		//Print the results
		
		for(int i=0;i<outList.size();i++){
			System.out.println(outList.get(i));
		}
	}
	
	
	
}
