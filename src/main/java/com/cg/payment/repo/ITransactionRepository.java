package com.cg.payment.repo;

import java.time.LocalDate;
import java.util.List;

import com.cg.paymentapp.beans.Transaction;
import com.cg.paymentapp.beans.Wallet;

public interface ITransactionRepository {

	public Transaction addTransaction (Transaction tran);
	public Transaction viewAllTransactions (Wallet wallet);
	public List<Transaction> viewTransactionsByDate(LocalDate from,LocalDate to);
	public Transaction viewAllTransactions(String type);
}
