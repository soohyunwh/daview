package com.daview.dto;

import java.util.List;

public class CaregiverFilterDTO {
	
	private String location;
    private String city;
    private String gender;
    private List<String> certificates;
    private List<String> workType;
    private List<String> employmentType;
    
    
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getCertificates() {
		return certificates;
	}
	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}
	public List<String> getWorkType() {
		return workType;
	}
	public void setWorkType(List<String> workType) {
		this.workType = workType;
	}
	public List<String> getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(List<String> employmentType) {
		this.employmentType = employmentType;
	}
    
    

}
