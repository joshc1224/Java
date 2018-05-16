package testAndDestroy;
import java.util.ArrayList;
/**
This class models a ball that bounces off walls.
*/
public class Ball
{
	// Instance variables
	private int position=0, distanceToWall=0;
	private boolean moveRight=true;
	
	/**
	   Constructs a ball at position 0 traveling east.
	   @param rightWall the position of the wall to the right
	*/
	public Ball(int rightWall)
	{
	   distanceToWall=rightWall;
	}
	
	/**
	   Moves the ball.
	*/
	public void move()
	{
	  if (moveRight) {
		  if (position<distanceToWall) {
			  position++;
		  }else if (position==distanceToWall) {
			  position --;
			  moveRight=false;
		  }
	  }else {
		  if (position>0) {
			  position--;
		  }else if (position==0) {
			  position ++;
			  moveRight=true;
		  }
	  }
	}
	
	/**
	   Gets the current position.
	   @return the current position
	*/
	public int getPosition()
	{
	   return position;
	}
}