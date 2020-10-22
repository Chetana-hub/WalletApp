package com.cg.paymentapp.repo;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.paymentapp.beans.BenificiaryDetails;
import com.cg.paymentapp.beans.Customer;

public class BenificiaryRepository implements IBenificiaryRepository{
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em=emf.createEntityManager();	

	@Override
	public BenificiaryDetails addBenificiary(BenificiaryDetails bd) {
		// TODO Auto-generated method stub
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(bd);
		txn.commit();
		return null;
	}

	@Override
	public BenificiaryDetails updateBenificiary(BenificiaryDetails bd) {
		// TODO Auto-generated method stub
		System.out.println("heyyyyyyyyyyyyyyyy updateing");
		return null;
	}

	@Override
	public BenificiaryDetails deleteBenificiary(BenificiaryDetails bd) {
		// TODO Auto-generated method stub
		BenificiaryDetails b=em.find(BenificiaryDetails.class,bd);
		EntityTransaction txn=em.getTransaction();
		if(b!=null)
		{
			txn.begin();
			em.remove(b);
			txn.commit();
		}
		return null;
	}

	@Override
	public BenificiaryDetails viewBenificiary(BenificiaryDetails bd) {
		// TODO Auto-generated method stub
		System.out.println("Showingggggg table");
		return null;
	}

	@Override
	public BenificiaryDetails viewAllBenificiary(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	

}