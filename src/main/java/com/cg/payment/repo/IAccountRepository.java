package com.cg.payment.repo;


import java.util.List;

import com.cg.paymentapp.beans.BankAccount;
import com.cg.paymentapp.beans.Wallet;

public interface IAccountRepository {

	public Wallet addAccount(BankAccount bacc);
	public Wallet removeAccount(BankAccount bacc);
	public Wallet viewAccount(BankAccount bacc);
	public List<Wallet> viewAllAccounts(Wallet wallet);
	
	
}