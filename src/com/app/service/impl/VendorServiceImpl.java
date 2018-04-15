package com.app.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IVendorDAO;
import com.app.model.Vendor;
import com.app.service.IVendorService;

@Service
public class VendorServiceImpl implements IVendorService {
	@Autowired
	private IVendorDAO dao;

	@Override
	public int saveVendor(Vendor ven) {
		// TODO Auto-generated method stub
		return dao.saveVendor(ven);
	}

	@Override
	public List<Vendor> getAllVendor() {
		List<Vendor>listVen=new ArrayList<Vendor>();
		listVen= dao.getAllVendor();
		if(listVen!=null||listVen.size()>0){
			Collections.sort(listVen);
		}
		System.out.println(listVen.get(0)+" "+listVen.get(1));
		return listVen;
	}

	@Override
	public void deleteVendor(int vId) {
		dao.deleteVendor(vId);
		
	}

	@Override
	public Vendor getVendorById(int vId) {
		// TODO Auto-generated method stub
		return dao.getVendorById(vId);
	}

	@Override
	public void updateVendor(Vendor ven) {
		System.out.println(ven.getvName()+" "+ven.getEmail());
		dao.updateVendor(ven);
		
	}
	

}
