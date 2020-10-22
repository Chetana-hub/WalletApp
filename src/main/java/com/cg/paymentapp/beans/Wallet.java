package com.cg.paymentapp.beans;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.OneToMany;

public class Wallet {
	
	private int walletId ;
	private BigDecimal balance;
	private List<BenificiaryDetails> beneficiaryDetails;
	@OneToMany(mappedBy = "wallet")
    public List<BenificiaryDetails> getBeneficiaryDetails(){
	
        return this.beneficiaryDetails;
    }
    public void setStudents(List<BenificiaryDetails>  beneficiaryDetails) {
         this. beneficiaryDetails =  beneficiaryDetails;
    }
    private List<Customer> customers;
    @OneToMany(mappedBy = "wallet")
    private List<Wallet> wallet=new ArrayList<Wallet>();
        return this.customers;
    }
    public void setTeachers(List<Customer> customers) {
         this.customers = customers;
    }
    
	public Wallet(){
		
	}
	public Wallet(BigDecimal amount) {
		this.balance=amount;
	}
	public int setWallet

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
