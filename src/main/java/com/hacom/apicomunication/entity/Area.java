package com.hacom.apicomunication.entity;

import java.math.BigDecimal;
import java.util.List;

public class Area {
	private String areaDesc;
	private List<String> polygon;
	private List<String> circle;
	private List<Geocode> geocode;
	private BigDecimal altitude;
	private BigDecimal ceiling;
	
	public String getAreaDesc() {
		return areaDesc;
	}
	
	public void setAreaDesc(String areaDesc) {
		this.areaDesc = areaDesc;
	}
	
	public List<String> getPolygon() {
		return polygon;
	}
	
	public void setPolygon(List<String> polygon) {
		this.polygon = polygon;
	}
	
	public List<String> getCircle() {
		return circle;
	}
	
	public void setCircle(List<String> circle) {
		this.circle = circle;
	}
	
	public List<Geocode> getGeocode() {
		return geocode;
	}
	
	public void setGeocode(List<Geocode> geocode) {
		this.geocode = geocode;
	}
	
	public BigDecimal getAltitude() {
		return altitude;
	}
	
	public void setAltitude(BigDecimal altitude) {
		this.altitude = altitude;
	}
	
	public BigDecimal getCeiling() {
		return ceiling;
	}
	
	public void setCeiling(BigDecimal ceiling) {
		this.ceiling = ceiling;
	}
	
}
