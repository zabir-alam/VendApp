package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerDAO;
import com.app.model.Customer;
import com.app.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDAO dao;

	@Override
	public int saveCustomer(Customer customer) {
		
		return dao.saveCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	@Override
	public void deleteCustomer(int cId) {

dao.deleteCustomer(cId);

	}

	@Override
	public Customer getLocationById(int cId) {
		
		return dao.getLocationById(cId);
	}

	@Override
	public void updateCustomer(Customer customer) {
			dao.updateCustomer(customer);
	}

}
