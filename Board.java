
public class Board{
	
	private int[][] board;
	private int height, width;
	public Board(int x, int y, int z){
		
		height = x;
		width = y;
		
		board = new int[x][y];
		for (int i=0;i<x;i++){
			for (int j=0;j<y;j++){
				board[i][j]=randos(z);
				System.out.print(board[i][j]+"|");
			}
			System.out.print("\n");
		}
		
	}
	
	private int randos(int max){
		
		return (int)(Math.random()*(10-1)+1);
		
	}
	
	public int getValue(int x, int y){
		try{
			return board[x][y];
		} catch (Exception e){
			return -1;
		}
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getWidth(){
		return width;
	}
}