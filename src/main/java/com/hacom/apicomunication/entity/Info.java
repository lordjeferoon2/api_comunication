package com.hacom.apicomunication.entity;

import java.util.List;

public class Info {
	private String language;
	private List<String> category;
	private String event;
	private List<String> responseType;
	private String urgency;
	private String severity;
	private String certainty;
	private String audience;
	private List<EventCode> eventCode;
	private String effective;
	private String onset;
	private String expires;
	private String senderName;
	private String headline;
	private String description;
	private String instruction;
	private String web;
	private String contact;
	private List<Parameter> parameter;
	private List<Resource> resource;
	private List<Area> area;
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public List<String> getCategory() {
		return category;
	}
	
	public void setCategory(List<String> category) {
		this.category = category;
	}
	
	public String getEvent() {
		return event;
	}
	
	public void setEvent(String event) {
		this.event = event;
	}
	
	public List<String> getResponseType() {
		return responseType;
	}
	
	public void setResponseType(List<String> responseType) {
		this.responseType = responseType;
	}
	
	public String getUrgency() {
		return urgency;
	}
	
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	
	public String getSeverity() {
		return severity;
	}
	
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	public String getCertainty() {
		return certainty;
	}
	
	public void setCertainty(String certainty) {
		this.certainty = certainty;
	}
	
	public String getAudience() {
		return audience;
	}
	
	public void setAudience(String audience) {
		this.audience = audience;
	}
	
	public List<EventCode> getEventCode() {
		return eventCode;
	}
	
	public void setEventCode(List<EventCode> eventCode) {
		this.eventCode = eventCode;
	}
	
	public String getEffective() {
		return effective;
	}
	
	public void setEffective(String effective) {
		this.effective = effective;
	}
	
	public String getOnset() {
		return onset;
	}
	
	public void setOnset(String onset) {
		this.onset = onset;
	}
	
	public String getExpires() {
		return expires;
	}
	
	public void setExpires(String expires) {
		this.expires = expires;
	}
	
	public String getSenderName() {
		return senderName;
	}
	
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	
	public String getHeadline() {
		return headline;
	}
	
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getInstruction() {
		return instruction;
	}
	
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
	public String getWeb() {
		return web;
	}
	
	public void setWeb(String web) {
		this.web = web;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public List<Parameter> getParameter() {
		return parameter;
	}
	
	public void setParameter(List<Parameter> parameter) {
		this.parameter = parameter;
	}
	
	public List<Resource> getResource() {
		return resource;
	}
	
	public void setResource(List<Resource> resource) {
		this.resource = resource;
	}
	
	public List<Area> getArea() {
		return area;
	}
	
	public void setArea(List<Area> area) {
		this.area = area;
	}
	
}
