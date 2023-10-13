package com.hacom.apicomunication.entity;

import java.math.BigInteger;

public class Resource {
	private String resourceDesc;
	private String mimeType;
	private BigInteger size;
	private String uri;
	private String derefUri;
	private String digest;
	
	public String getResourceDesc() {
		return resourceDesc;
	}
	
	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public BigInteger getSize() {
		return size;
	}
	
	public void setSize(BigInteger size) {
		this.size = size;
	}
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public String getDerefUri() {
		return derefUri;
	}
	
	public void setDerefUri(String derefUri) {
		this.derefUri = derefUri;
	}
	
	public String getDigest() {
		return digest;
	}
	
	public void setDigest(String digest) {
		this.digest = digest;
	}
	
}
