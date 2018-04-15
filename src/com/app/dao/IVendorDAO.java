package com.app.dao;

import java.util.List;

import com.app.model.Vendor;



public interface IVendorDAO {
	public  int saveVendor(Vendor ven);
	public List<Vendor> getAllVendor();
	public void deleteVendor(int vId);
	
	public Vendor getVendorById(int vId);
	public void updateVendor(Vendor ven);

}
