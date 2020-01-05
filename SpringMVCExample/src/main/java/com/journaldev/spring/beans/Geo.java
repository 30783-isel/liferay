package com.journaldev.spring.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "geo")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Geo {

	private String lat;
	private String lng;
	
	
	
	public Geo() {
		super();
	}

	public Geo(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	
	
}
