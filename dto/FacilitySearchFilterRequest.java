package com.daview.dto;

import java.util.List;

public class FacilitySearchFilterRequest {
    private String location;
    private String city;
    private String theme;

    private List<String> residence;
    private List<String> facility;
    private List<String> environment;
    private List<String> etc;
    
    
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public List<String> getResidence() {
		return residence;
	}
	public void setResidence(List<String> residence) {
		this.residence = residence;
	}
	public List<String> getFacility() {
		return facility;
	}
	public void setFacility(List<String> facility) {
		this.facility = facility;
	}
	public List<String> getEnvironment() {
		return environment;
	}
	public void setEnvironment(List<String> environment) {
		this.environment = environment;
	}
	public List<String> getEtc() {
		return etc;
	}
	public void setEtc(List<String> etc) {
		this.etc = etc;
	}

  
}