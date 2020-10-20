package com.cg.paymentapp.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.paymentapp.beans.BankAccount;
import com.cg.paymentapp.beans.Wallet;

public class AccountRepository implements IAccountRepository {
	private EntityManagerFactory emf;
	public AccountRepository() {
		emf=Persistence.createEntityManagerFactory("Wallet");
	}

	public Wallet addAccount(BankAccount bacc) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		try {
			transaction.begin();
			em.persist(bacc);
			transaction.commit();
		}finally {
			em.close();
		}
		return null;
	}

	public Wallet removeAccount(BankAccount bacc) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BankAccount> viewAccount(BankAccount bacc) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Wallet> viewAllAccounts(Wallet wallet) {
		// TODO Auto-generated method stub
		return null;
	}

}
