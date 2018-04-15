package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loc_details")
public class Location implements Comparable<Location>{
	@Id
	@Column(name="locId")
	private int locId;
	@Column(name="locName")
	private String locName;
	@Column(name="locType")
	private String locType;



	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(int locId){
		this.locId=locId;
	}



	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getLocType() {
		return locType;
	}
	public void setLocType(String locType) {
		this.locType = locType;
	}


	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locName=" + locName
				+ ", locType=" + locType + "]";
	}


	@Override
	public int compareTo(Location o) {
		// TODO Auto-generated method stub
		return locId-o.locId;
	}


}
