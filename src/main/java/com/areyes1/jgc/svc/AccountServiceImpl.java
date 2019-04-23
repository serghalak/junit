package com.areyes1.jgc.svc;

import java.util.ArrayList;
import java.util.List;

import com.areyes1.jgc.intf.AccountService;
import com.areyes1.jgc.obj.Account;
import com.areyes1.jgc.obj.Transaction;

public class AccountServiceImpl implements AccountService {

	public Account createNewAccount(Account account) {
		// TODO Auto-generated method stub
		return account;
	}

	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		account.setName("Alvin Reyes: New Name");
		return account;
	}

	public boolean removeAccount(Account account) {
		// TODO Auto-generated method stub
		return true;
	}

	public List<Transaction> listAllTransaction(Account account) {
		// TODO Auto-generated method stub
		List listOfAllTransactions = new ArrayList();
		listOfAllTransactions.add(new Transaction());
		listOfAllTransactions.add(new Transaction());
		listOfAllTransactions.add(new Transaction());
		account.setTransactions(listOfAllTransactions);
		return listOfAllTransactions;
	}
	 
	
}
