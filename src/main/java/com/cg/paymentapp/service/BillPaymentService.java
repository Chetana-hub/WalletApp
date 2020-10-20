package com.cg.paymentapp.service;

import com.cg.paymentapp.beans.BillPayment;
import com.cg.paymentapp.repo.BillPaymentRepository;
import com.cg.paymentapp.repo.IBillPaymentRepository;

public class BillPaymentService implements IBillPaymentService {
	private IBillPaymentRepository repo;
	public BillPaymentService() {
		repo=new BillPaymentRepository();
	}

	public BillPayment addBillPayment(BillPayment payment) {
		return repo.addBillPayment(payment);
	}

	public BillPayment viewBillPayment(BillPayment payment) {
		return repo.viewBillPayment(payment);

}
}
