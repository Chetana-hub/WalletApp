package com.cg.paymentapp.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.paymentapp.beans.BillPayment;

public class BillPaymentRepository implements IBillPaymentRepository {
	private EntityManagerFactory factory;
	public BillPaymentRepository() {
		factory=Persistence.createEntityManagerFactory("WalletApplication");
	}

	public BillPayment addBillPayment(BillPayment payment) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		try {
			txn.begin();
			em.persist(payment);
			txn.commit();
		}
		finally {
			em.close();
			
		}
		return payment;
	}

	public BillPayment viewBillPayment(BillPayment payment) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		EntityTransaction txn=em.getTransaction();
		try {
			txn.begin();
			BillPayment billpayment=new BillPayment();
			billpayment=em.find(BillPayment.class, billpayment.getBillId());
			txn.commit();
		}
		finally {
			em.close();
		}
		return null;
	}

}
