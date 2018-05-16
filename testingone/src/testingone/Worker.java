package testingone;

public class Worker extends Person{

	private double mSalary;
	
	public Worker(String pName, double pSalary) {
		super(pName);
		mSalary=pSalary;
	}
	public double getSalary() {
		return mSalary;
	}
	public void setSalary(double pSalary) {
		mSalary=pSalary;
	}
}/*end worker class*/
