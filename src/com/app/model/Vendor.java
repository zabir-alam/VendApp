package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ven_tab")
public class Vendor implements Comparable<Vendor>{
	
	@Id
	@Column(name="vId")
	private int vId;
	@ManyToOne
	@JoinColumn(name="locIdFk")
	private Location loc;
	@Column(name="vName")
	private String vName;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private String mobile;
	@Column(name="address")
	private String address;


	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Vendor() {
		
	}
	public Vendor(int vId) {
		super();
		this.vId = vId;
	}
	
	
	@Override
	public String toString() {
		return "Vendor [vId=" + vId + ", loc=" + loc + ", vName=" + vName
				+ ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + "]";
	}
	@Override
	public int compareTo(Vendor o) {
		
		return vId-o.vId;
	}
	

}
