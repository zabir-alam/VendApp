package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {
	public  int saveCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public void deleteCustomer(int cId);
	
	public Customer getLocationById(int cId);
	public void updateCustomer(Customer customer);


}
