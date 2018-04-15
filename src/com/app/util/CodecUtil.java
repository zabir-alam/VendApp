package com.app.util;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Component
public class CodecUtil {
	public String doEncoding(String normal){
		return new String(Base64.encodeBase64(normal.getBytes()));
	}
public String doDecoding(String encode){
	return new String(Base64.decodeBase64(encode.getBytes()));
}
}
