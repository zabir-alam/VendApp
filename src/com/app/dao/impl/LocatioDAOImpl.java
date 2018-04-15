package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ILocationDAO;
import com.app.model.Location;
@Repository
public class LocatioDAOImpl implements ILocationDAO {

	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveLocation(Location loc) {
		int idVal=(Integer) ht.save(loc);
		
		return idVal;
	}
	@Override
	public List<Location> getAllLocation() {
	 
		return  ht.loadAll(Location.class);
	}
	@Override
	public void deleteLocation(int locId) {
		
		Location loc=new Location(locId);
		ht.delete(loc);
		
	}
	@Override
	public Location getLocationById(int locId) {
	 
		return ht.get(Location.class, locId);
	}
	@Override
	public void updateLocation(Location loc) {
		ht.update(loc);
		
	}

}
