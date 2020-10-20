package com.cg.payment.repo;

import java.time.LocalDate;
import java.util.List;

import com.cg.paymentapp.beans.Transaction;
import com.cg.paymentapp.beans.Wallet;

public class TransactionRepository implements ITransactionRepository{

	public Transaction addTransaction(Transaction tran) {
		// TODO Auto-generated method stub
		return null;
	}

	public Transaction viewAllTransactions(Wallet wallet) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Transaction> viewTransactionsByDate(LocalDate from, LocalDate to) {
		// TODO Auto-generated method stub
		return null;
	}

	public Transaction viewAllTransactions(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
