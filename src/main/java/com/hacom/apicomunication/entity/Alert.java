package com.hacom.apicomunication.entity;

import java.util.List;

public class Alert {
	private String identifier;
	private String sender;
	private String sent;
	private String status;
	private String msgType;
	private String source;
	private String scope;
	private String restriction;
	private String addresses;
	private List<String> code;
	private String note;
	private String references;
	private String incidents;
	private List<Info> info;
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	public String getSender() {
		return sender;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getSent() {
		return sent;
	}
	
	public void setSent(String sent) {
		this.sent = sent;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	public String getScope() {
		return scope;
	}
	
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	public String getRestriction() {
		return restriction;
	}
	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}
	public String getAddresses() {
		return addresses;
	}
	
	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}
	
	public List<String> getCode() {
		return code;
	}
	
	public void setCode(List<String> code) {
		this.code = code;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getReferences() {
		return references;
	}
	
	public void setReferences(String references) {
		this.references = references;
	}
	
	public String getIncidents() {
		return incidents;
	}
	
	public void setIncidents(String incidents) {
		this.incidents = incidents;
	}
	
	public List<Info> getInfo() {
		return info;
	}
	
	public void setInfo(List<Info> info) {
		this.info = info;
	}
	
}
