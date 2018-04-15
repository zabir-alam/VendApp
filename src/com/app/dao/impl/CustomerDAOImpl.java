package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDAO;
import com.app.model.Customer;
@Repository
public class CustomerDAOImpl implements ICustomerDAO {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveCustomer(Customer customer) {
		
		return (Integer) ht.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return ht.loadAll(Customer.class);
	}

	@Override
	public void deleteCustomer(int cId) {
		
		Customer customer=new Customer(cId);
		ht.delete(customer);

	}

	@Override
	public Customer getLocationById(int cId) {
		
		return ht.get(Customer.class, cId);
	}

	@Override
	public void updateCustomer(Customer customer) {
		ht.update(customer);

	}

}
