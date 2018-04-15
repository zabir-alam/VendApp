package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IVendorDAO;
import com.app.model.Vendor;
@Repository
public class VendorDAOImpl implements IVendorDAO {
	@Autowired
	 private HibernateTemplate ht;

	@Override
	public int saveVendor(Vendor ven) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(ven);
	}

	@Override
	public List<Vendor> getAllVendor() {
		// TODO Auto-generated method stub
		return ht.loadAll(Vendor.class);
	}

	@Override
	public void deleteVendor(int vId) {
		ht.delete(new Vendor(vId));
		
	}

	@Override
	public Vendor getVendorById(int vId) {
		// TODO Auto-generated method stub
		return ht.get(Vendor.class, vId);
	}

	@Override
	public void updateVendor(Vendor ven) {
		System.out.println("Update DAOImpl"+ven.getvId()+" "+ven.getvName()+" "+ven.getEmail()+" "+ven.getMobile()+" "+ven.getAddress());
		ht.update(ven);
		System.out.println("after Update DAOImpl"+ven.getvName()+" "+ven.getEmail());
		
		
	}

	

}
