package com.cg.payment.service;

import com.cg.paymentapp.beans.BillPayment;

public interface IBillPaymentService {

	public BillPayment addBillPayment(BillPayment payment);
	public BillPayment viewBillPayment(BillPayment payment);
}
