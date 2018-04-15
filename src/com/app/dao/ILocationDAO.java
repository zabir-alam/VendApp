package com.app.dao;

import java.util.List;

import com.app.model.Location;

public interface ILocationDAO {
	public  int saveLocation(Location loc);
	public List<Location> getAllLocation();
	public void deleteLocation(int locId);
	
	public Location getLocationById(int locId);
	public void updateLocation(Location loc);

}
