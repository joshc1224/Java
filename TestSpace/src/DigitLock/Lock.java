package DigitLock;

/**
A simulated lock with digit buttons.
*/
public class Lock
	{
	private  int combination = 1729; 
	private int input=0;
	
	
	/**
	   Simulates a digit button push.
	   @param button a digit 0 ... 9
	*/
	public void push(int button)
	{
	   input = input*10+button;
	   
	}
	
	
	/**
	   Simulates a push of the open button.
	   @return true if the lock opened
	*/
	public boolean open()
	{
	   if(input==combination) {
		  
		   input = 0;
		   return true;
		 		   
	   }else {
		   input =0;
		   return false;
	   }
	   
	}
	}