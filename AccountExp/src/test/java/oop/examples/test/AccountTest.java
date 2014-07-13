package oop.examples.test;

import org.junit.*;
import static org.junit.Assert.*;

import oop.examples.NormalAccount;

/**
 * Created with IntelliJ IDEA.
 * User: chauttm
 * Date: 9/18/13
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountTest {
    @Test
    public void testNormalAccount () {
		NormalAccount account = new NormalAccount(10);
		assertEquals(10, account.getBalance());
	}
	
	@Test
    public void testDepositToNormalAccount () {
		NormalAccount account = new NormalAccount(10);
		account.deposit(2);
		assertEquals(12, account.getBalance());
	}
	
	@Test
    public void testWithdrawFromNormalAccount () {
		NormalAccount account = new NormalAccount(10);
		account.withdraw(2);
		assertEquals(8, account.getBalance());
	}
	
	@Test
    public void testEndMonthNormalAccount_FeeDeduction () {
		NormalAccount account = new NormalAccount(10);
		account.withdraw(2);
		account.deposit(30);
		account.endMonth();		
		assertEquals(33, account.getBalance());
	}
	
	@Test
    public void testEndMonthNormalAccount_TransactionCountChangesWithDepositAndWithdraw () {
		NormalAccount account = new NormalAccount(10);
		assertEquals(0, account.getTransactionCount());
		account.withdraw(2);
		assertEquals(1, account.getTransactionCount());
		account.deposit(30);
		assertEquals(2, account.getTransactionCount());
	}
	
	@Test
    public void testEndMonthNormalAccount_ResetTransactionCount () {
		NormalAccount account = new NormalAccount(10);
		account.withdraw(2);
		account.deposit(30);
		account.endMonth();		
		assertEquals(0, account.getTransactionCount());
	}
}



