package com.areyes1.jgc.svc;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.areyes1.jgc.obj.Account;

public class AccountServiceImplTest {

	AccountServiceImpl accountService=new AccountServiceImpl();
	
	@Test
	public void testCreateNewAccount() {
		//fail("Not yet implemented");
		Account newAccount=new Account();
		newAccount.setName("Alvin Reyes");
		newAccount.setDescription("This is the description");
		Account newAccountInserted=accountService.createNewAccount(newAccount);
		assertThat(newAccount, isA(Account.class));
		assertThat(newAccountInserted, isA(Account.class));
		assertEquals(newAccount.getName(),newAccountInserted.getName());
	}
	
	@Test
	public void testUpdateAccount() {
		//fail("Not yet implemented");
		Account oldAccount=new Account();
		oldAccount.setName("Alvin Reyes");
		oldAccount.setDescription("This is the description");
		String name=oldAccount.getName();
		Account expectedAccountObj=new Account();
		expectedAccountObj=accountService.updateAccount(oldAccount);
		assertThat(expectedAccountObj, isA(Account.class));
		assertNotEquals(name, expectedAccountObj.getName());
		
	}
	
	@Test
	public void testRemoveAccount() {
		//fail("Not yet implemented");
		Account toBeRemovedAccount = new Account();
		toBeRemovedAccount.setName("alvin Reyes");
		toBeRemovedAccount.setDescription("this is the description");
		assertTrue(accountService.removeAccount(toBeRemovedAccount));
		
	}
	
	@Test
	public void testListAllTransactions() {
		//fail("Not yet implemented");
		Account account=new Account();
		account.setName("alvin Reyes");
		accountService.listAllTransaction(account);
		assertTrue(accountService.listAllTransaction(account).size()>1);
	}
}
