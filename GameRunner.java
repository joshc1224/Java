import java.util.Scanner;

public class GameRunner{
	public static Board gameBoard;
	public static void main(String[] args){
		
		gameBoard = new Board(10,10,10);
		GameView view = new GameView(gameBoard.getHeight(), gameBoard.getWidth());
	}
	
	
	
}