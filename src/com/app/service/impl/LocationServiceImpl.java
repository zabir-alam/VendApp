package com.app.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDAO;
import com.app.model.Location;
import com.app.service.ILocationService;
@Service
public class LocationServiceImpl implements ILocationService {
 
	@Autowired
	private ILocationDAO dao;
	@Override
	public int saveLocation(Location loc) {
		
		return dao.saveLocation(loc);
	}
	@Override
	public List<Location> getAllLocation() {
		List<Location>locList=new ArrayList<Location>();
		locList=dao.getAllLocation();
		if(locList!=null||locList.size()>0){
			Collections.sort(locList);
		}
		return locList;
	}
	@Override
	public void deleteLocation(int locId) {
		System.out.println("Service LocID"+locId);
		dao.deleteLocation(locId);
		
	}
	@Override
	public Location getLocationById(int locId) {
		// TODO Auto-generated method stub
		return dao.getLocationById(locId);
	}
	@Override
	public void updateLocation(Location loc) {
		dao.updateLocation(loc);
		
	}

}
