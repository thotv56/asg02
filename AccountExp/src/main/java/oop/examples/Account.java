package oop.examples;

public abstract class Account {
	protected int balance;
	protected int transactions;
	
	public Account(int initialBalance) {
		balance = initialBalance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	public int getTransactionCount() {
		return transactions;
	}
	
	public void deposit(int amount) {
		balance += amount;
		transactions ++;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
		transactions ++;
	}
	public abstract int endMonthCharge();
	
	public void endMonth() {
		balance -= endMonthCharge();
		transactions = 0;
	}
}