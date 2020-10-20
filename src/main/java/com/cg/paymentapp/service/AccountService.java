package com.cg.paymentapp.service;

import java.util.List;

import com.cg.paymentapp.beans.BankAccount;
import com.cg.paymentapp.beans.Wallet;
import com.cg.paymentapp.repo.AccountRepository;
import com.cg.paymentapp.repo.IAccountRepository;

public class AccountService implements IAccountService {
	private IAccountRepository repo;
	public AccountService() {
		repo=new AccountRepository();
	}

	public Wallet addAccount(BankAccount bacc) {
		return repo.addAccount(bacc);
	}

	public Wallet removeAccount(BankAccount bacc) {
		return repo.removeAccount(bacc);
	}

	public List<BankAccount> viewAccount(BankAccount bacc){
		return repo.viewAccount(bacc);
	}

	public List<Wallet> viewAllAccounts(Wallet wallet) {
		return repo.viewAllAccounts(wallet);
	}

}
