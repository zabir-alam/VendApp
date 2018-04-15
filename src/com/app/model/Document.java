package com.app.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="doc_tab")
public class Document {
	
	@Id
	@Column(name="fId")
	private int fileId;
	
	@Column(name="fName")
	private String fName;
	
	@Column(name="data")
	@Lob
	private byte[] fileData;
	
	
	
	public Document() {
		super();
	}
	public Document(int fileId) {
		super();
		this.fileId = fileId;
	}
	
	
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	@Override
	public String toString() {
		return "Document [fileId=" + fileId + ", fName=" + fName
				+ ", fileData=" + Arrays.toString(fileData) + "]";
	}
	
	
	

}
