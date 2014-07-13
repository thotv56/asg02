package oop.examples;

public class NormalAccount extends Account{
	static int FLAT_MONTHLY_FEE = 5;
	
	public NormalAccount(int initialBalance) {
		super(initialBalance);
	}
	
	public int endMonthCharge() {
		return FLAT_MONTHLY_FEE;
	}
	
}