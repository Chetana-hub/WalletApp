package com.cg.paymentapp.repo;
import java.util.List;

import com.cg.paymentapp.beans.Customer;

public interface WalletRepo {

	public boolean save(Customer customer);
	public Customer findOne(String mobileNo);
	public List<Customer> getList();
}
