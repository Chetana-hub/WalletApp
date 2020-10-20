package com.cg.payment.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.paymentapp.beans.Customer;
import com.cg.paymentapp.beans.Wallet;


public interface WalletService {
public Customer createAccount(String name ,String mobileno, BigDecimal amount);
public Customer showBalance (String mobileno);
public Customer fundTransfer (String sourceMobileNo,String targetMobileNo, BigDecimal amount);
public Customer depositAmount (String mobileNo,BigDecimal amount );
public Customer withdrawAmount(String mobileNo, BigDecimal amount);
public List<Customer> getList();
public Customer updateAccount(Customer customer);
public Customer addMoney(Wallet wallet, double amount);

}
