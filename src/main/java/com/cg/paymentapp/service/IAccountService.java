package com.cg.paymentapp.service;
import java.util.List;

import com.cg.paymentapp.beans.BankAccount;
import com.cg.paymentapp.beans.Wallet;

public interface IAccountService {

	public Wallet addAccount(BankAccount bacc);
	public Wallet removeAccount(BankAccount bacc);
	public List<BankAccount> viewAccount(BankAccount bacc);
	public List<Wallet> viewAllAccounts(Wallet wallet);
	
	
}
