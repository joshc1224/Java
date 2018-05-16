import java.util.Scanner;


public class Movement{
	public static int h =x;
	public static int l =0;
	public static int x = 10;
	public static int y = 10;
	public static int[][] board = new int[x][y];
	public static void main(String[] args){
		
		
		int playerHealth = randoms();
		
		
		
		for (int i=0;i<x;i++){
			for (int j=0;j<y;j++){
				board[i][j] = randoms();
			}
			
		}
		
		//uncomment below to print the board
		/*for (int i=0;i<x;i++){
			System.out.print("|");
			for (int j=0;j<y;j++){
				System.out.format("%02d", board[i][j]);
				System.out.print("|");
			}
			System.out.print("\n");
		}*/
		
		System.out.print("*************************************"+"\n"+
						 "Player Stength is: "+playerHealth+" ***************"+"\n"+
						 "*************************************"+"\n"+
						 "To the front is x, to the back is y"+"\n"+
						 "To the left is z, to the right is v"+"\n"+
						 "What would you like to do?");
						 
		int current = board[h][l];
		
	}
	
	public static int randoms(){
		return (int)(Math.random()*(11-1)+1);
	}
	
	public static int getFront(){
		if(h+1>x|h+1>y|h+1<0){
			return -1;
		}else{
			return board
	}
}

