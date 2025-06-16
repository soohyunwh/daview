package com.daview.dto;

import java.util.List;

public class FacilityDTO {
    private String facilityId;
    private String facilityName;
    private Integer facilityCharge;
    private String facilityAddressLocation;
    private String facilityAddressCity;
    private String facilityDetailAddress;
    private String facilityTheme;
    private String facilityHomepage;
    
    private String facilityPhone;
    
    private String photoUrl;            // 메인 포토
    private List<String> photos;        // 썸네일 포함 모든 사진
    private List<String> tags;          // 태그들
    private List<NoticeDTO> notices;    // 공지사항
    
    private String facilityType;
    
    // Getters and Setters 생략 (자동 생성 또는 IDE로 생성 가능)
    
    
    
    public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public String getFacilityDetailAddress() {
		return facilityDetailAddress;
	}
	public void setFacilityDetailAddress(String facilityDetailAddress) {
		this.facilityDetailAddress = facilityDetailAddress;
	}
	public String getFacilityTheme() {
		return facilityTheme;
	}
	public void setFacilityTheme(String facilityTheme) {
		this.facilityTheme = facilityTheme;
	}
	public String getFacilityHomepage() {
		return facilityHomepage;
	}
	public void setFacilityHomepage(String facilityHomepage) {
		this.facilityHomepage = facilityHomepage;
	}
	public String getFacilityPhone() {
		return facilityPhone;
	}
	public void setFacilityPhone(String facilityPhone) {
		this.facilityPhone = facilityPhone;
	}
	public List<String> getPhotos() {
		return photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<NoticeDTO> getNotices() {
		return notices;
	}
	public void setNotices(List<NoticeDTO> notices) {
		this.notices = notices;
	}


    // ✅ Getter/Setter
    public String getFacilityId() { return facilityId; }
    public void setFacilityId(String facilityId) { this.facilityId = facilityId; }

    public String getFacilityName() { return facilityName; }
    public void setFacilityName(String facilityName) { this.facilityName = facilityName; }

    public int getFacilityCharge() { return facilityCharge; }
    public void setFacilityCharge(int facilityCharge) { this.facilityCharge = facilityCharge; }

    public String getFacilityAddressLocation() { return facilityAddressLocation; }
    public void setFacilityAddressLocation(String facilityAddressLocation) { this.facilityAddressLocation = facilityAddressLocation; }

    public String getFacilityAddressCity() { return facilityAddressCity; }
    public void setFacilityAddressCity(String facilityAddressCity) { this.facilityAddressCity = facilityAddressCity; }

	public void setFacilityCharge(Integer facilityCharge) {
		this.facilityCharge = facilityCharge;
		
		
		
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

    
    
}
