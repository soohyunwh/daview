// ✅ 병합된 CaregiverDTO.java - 팀원 코드 + 확장 필드 포함 완전 버전

package com.daview.dto;

import java.util.List;

public class CaregiverDTO {
    private String caregiverId;
    private Long memberId;
    private String hopeWorkAreaLocation;
    private String hopeWorkAreaCity;
    private String hopeWorkPlace;
    private String hopeWorkType;
    private String hopeEmploymentType;
    private String educationLevel;
    private String introduction;
    private int hopeWorkAmount;
    private String caregiverCreatedAt;
    private String caregiverUpdateAt;

    private List<String> certificates;
    private List<CaregiverCareerDTO> career;

    private String username;
    private String userGender;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserGender() {
        return userGender;
    }
    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getCaregiverId() {
        return caregiverId;
    }
    public void setCaregiverId(String caregiverId) {
        this.caregiverId = caregiverId;
    }

    public Long getMemberId() {
        return memberId;
    }
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getHopeWorkAreaLocation() {
        return hopeWorkAreaLocation;
    }
    public void setHopeWorkAreaLocation(String hopeWorkAreaLocation) {
        this.hopeWorkAreaLocation = hopeWorkAreaLocation;
    }

    public String getHopeWorkAreaCity() {
        return hopeWorkAreaCity;
    }
    public void setHopeWorkAreaCity(String hopeWorkAreaCity) {
        this.hopeWorkAreaCity = hopeWorkAreaCity;
    }

    public String getHopeWorkPlace() {
        return hopeWorkPlace;
    }
    public void setHopeWorkPlace(String hopeWorkPlace) {
        this.hopeWorkPlace = hopeWorkPlace;
    }

    public String getHopeWorkType() {
        return hopeWorkType;
    }
    public void setHopeWorkType(String hopeWorkType) {
        this.hopeWorkType = hopeWorkType;
    }

    public String getHopeEmploymentType() {
        return hopeEmploymentType;
    }
    public void setHopeEmploymentType(String hopeEmploymentType) {
        this.hopeEmploymentType = hopeEmploymentType;
    }

    public String getEducationLevel() {
        return educationLevel;
    }
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getIntroduction() {
        return introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getHopeWorkAmount() {
        return hopeWorkAmount;
    }
    public void setHopeWorkAmount(int hopeWorkAmount) {
        this.hopeWorkAmount = hopeWorkAmount;
    }

    public String getCaregiverCreatedAt() {
        return caregiverCreatedAt;
    }
    public void setCaregiverCreatedAt(String caregiverCreatedAt) {
        this.caregiverCreatedAt = caregiverCreatedAt;
    }

    public String getCaregiverUpdateAt() {
        return caregiverUpdateAt;
    }
    public void setCaregiverUpdateAt(String caregiverUpdateAt) {
        this.caregiverUpdateAt = caregiverUpdateAt;
    }

    public List<String> getCertificates() {
        return certificates;
    }
    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    public List<CaregiverCareerDTO> getCareer() {
        return career;
    }
    public void setCareer(List<CaregiverCareerDTO> career) {
        this.career = career;
    }
}
