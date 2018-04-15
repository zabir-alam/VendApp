package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@Column(name="cId")
	private int custId;
	@Column(name="name")
	private String cName;
	@Column(name="mail")
	private String eMail;
	
	@Column(name="type")
	private String cType;
	
	@Column(name="addr")
	private String cAddr;
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="token")
	private String accTocken;
	
	
	public Customer() {
		super();
	}
	
	public Customer(int custId) {
		super();
		this.custId = custId;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getcAddr() {
		return cAddr;
	}

	public void setcAddr(String cAddr) {
		this.cAddr = cAddr;
	}

	public String getaccTocken() {
		return accTocken;
	}

	public void setaccTocken(String accTocken) {
		this.accTocken = accTocken;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", cName=" + cName + ", eMail="
				+ eMail + ", cType=" + cType + ", cAddr=" + cAddr + ", pwd="
				+ pwd + ", accTocken=" + accTocken + "]";
	}
	
	

}
