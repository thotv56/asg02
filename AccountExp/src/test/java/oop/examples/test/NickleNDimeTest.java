package oop.examples.test;

import org.junit.*;
import static org.junit.Assert.*;

import oop.examples.NickleNDime;

/**
 * Created with IntelliJ IDEA.
 * User: chauttm
 * Date: 9/18/13
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class NickleNDimeTest {
    @Test
    public void testNickleNDime () {
		NickleNDime account = new NickleNDime(10);
		assertEquals(10, account.getBalance());
	}
	
	@Test
    public void testDepositToNickleNDime () {
		NickleNDime account = new NickleNDime(10);
		account.deposit(2);
		assertEquals(12, account.getBalance());
	}
	
	@Test
    public void testWithdrawFromNickleNDimeAccount () {
		NickleNDime account = new NickleNDime(10);
		account.withdraw(2);
		assertEquals(8, account.getBalance());
	}
	
	@Test
    public void testEndMonthNickleNDimeAccount_FeeDeduction () {
		NickleNDime account = new NickleNDime(10);
		account.withdraw(2);
		account.deposit(30);
		account.endMonth();		
		assertEquals(37, account.getBalance());
	}
	
	@Test
    public void testEndMonthNickleNDimeAccount_TransactionCountChangesWithDepositAndWithdraw () {
		NickleNDime account = new NickleNDime(10);
		assertEquals(0, account.getTransactionCount());
		account.withdraw(2);
		assertEquals(1, account.getTransactionCount());
		account.deposit(30);
		assertEquals(2, account.getTransactionCount());
	}
	
	@Test
    public void testEndMonthNickleNDimeAccount_ResetTransactionCount () {
		NickleNDime account = new NickleNDime(10);
		account.withdraw(2);
		account.deposit(30);
		account.endMonth();		
		assertEquals(0, account.getTransactionCount());
	}
	
	@Test
    public void testEndMonthNickleNDimeAccount_FeeResetEveryMonth () {
		NickleNDime account = new NickleNDime(10);
		account.withdraw(10);  //0
		account.deposit(30);	//30
		account.endMonth();		//29
		account.withdraw(10);	//19
		account.deposit(30);	//49
		account.endMonth();		//48		
		assertEquals(48, account.getBalance());
	}
}



