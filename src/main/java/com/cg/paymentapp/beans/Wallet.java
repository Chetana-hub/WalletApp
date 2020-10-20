package com.cg.paymentapp.beans;

import java.math.BigDecimal;

public class Wallet {
	private int walletId;
	private BigDecimal balance;
	public Wallet(){
		
	}
	public Wallet(BigDecimal amount) {
		this.balance=amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
		public String toString() {
		return " balance= "+balance;
	}

}
