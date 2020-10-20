package com.cg.payment.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.paymentapp.beans.Transaction;
import com.cg.paymentapp.beans.Wallet;

public interface ITransactionService {

	public Transaction addTransaction (Transaction tran);
	public Transaction viewAllTransactions (Wallet wallet);
	public List<Transaction> viewTransactionsByDate(LocalDate from,LocalDate to);
	public Transaction viewAllTransactions(String type);
}
