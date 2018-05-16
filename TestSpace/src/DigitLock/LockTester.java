package DigitLock;

public class LockTester {
	public static void main(String[] args)
	   {
	      Lock myLock = new Lock();
	      myLock.push(1);
	      myLock.push(7);
	      myLock.push(3);
	      myLock.push(9);
	      System.out.println(myLock.open());
	      System.out.println("Expected: false");
	      myLock.push(1);
	      myLock.push(7);
	      myLock.push(2);
	      myLock.push(9);
	      System.out.println(myLock.open());
	      System.out.println("Expected: true");
	      myLock.push(1);
	      myLock.push(7);
	      myLock.push(2);
	      System.out.println(myLock.open());
	      System.out.println("Expected: false");
	      myLock.push(9);
	      System.out.println(myLock.open());
	      System.out.println("Expected: false");
	      myLock.push(1);
	      myLock.push(7);
	      myLock.push(2);
	      myLock.push(9);
	      System.out.println(myLock.open());
	      System.out.println("Expected: true");
	   }
}
