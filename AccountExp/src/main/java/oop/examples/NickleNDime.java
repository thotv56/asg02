package oop.examples;

public class NickleNDime  extends Account{
	int withdrawCount;
	
	public NickleNDime(int initialBalance) {
		super(initialBalance);
	}
		
	public void withdraw(int amount) {
		super.withdraw(amount);
		withdrawCount++;
	}
	
	public int endMonthCharge() {
		return 1 * withdrawCount;
	}
	
	public void endMonth() {
		super.endMonth();
		withdrawCount = 0;
	}
}