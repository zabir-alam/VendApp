package com.app.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CodeUtil {
	
	private String getStr(int length){
		return UUID.randomUUID().toString().replaceAll("_", "").substring(0,length);
	}
	public String getPwd(){
		return getStr(6);
	}
	public String getTocken(){
		return getStr(8);
	}

}
