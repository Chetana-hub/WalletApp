package com.cg.payment.service;


import com.cg.paymentapp.beans.Customer;

public interface IUserService {

	public Customer validateLogin(String mobileNumber,String password);
}
