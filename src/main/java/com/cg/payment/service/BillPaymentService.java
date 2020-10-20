package com.cg.payment.service;

import com.cg.payment.repo.BillPaymentRepository;
import com.cg.payment.repo.IBillPaymentRepository;
import com.cg.paymentapp.beans.BillPayment;

public class BillPaymentService implements IBillPaymentService {
	private IBillPaymentRepository repo;
	public BillPaymentService() {
		repo=new BillPaymentRepository();
	}

	public BillPayment addBillPayment(BillPayment payment) {
		// TODO Auto-generated method stub
		return repo.addBillPayment(payment);
	}

	public BillPayment viewBillPayment(BillPayment payment) {
		// TODO Auto-generated method stub
		return repo.viewBillPayment(payment);

}
}
