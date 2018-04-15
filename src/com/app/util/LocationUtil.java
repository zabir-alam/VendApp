package com.app.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.model.Location;
import com.app.model.Vendor;
import com.app.service.ILocationService;
import com.app.service.IVendorService;

@Component
public class LocationUtil {
	@Autowired
	private ILocationService service;
	
	@Autowired
	private IVendorService vservice;
	
	//Get AllLocation
	
	public List<Location> getAllLocation(){
		return service.getAllLocation();
	}
	
	
	//Get AllVendor
	
	public List<Vendor> getAllVendor(){
	return vservice.getAllVendor();
}
}
