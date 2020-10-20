package com.cg.payment.repo;
import com.cg.paymentapp.beans.BillPayment;

public interface IBillPaymentRepository {

	public BillPayment addBillPayment(BillPayment payment);
	public BillPayment viewBillPayment(BillPayment payment);
}
