package com.daview.dto;

public class NoticeDTO {
    private int noticeId;
    private String facilityId;
    private String noticeTitle;
    private String noticeContent;
    private boolean noticeIsFixed;
    private String noticeCreatedAt; // LocalDateTime → String
    private String facilityName;
    private String facilityType;
    private String noticeUpdatedAt;

    public String getNoticeUpdatedAt() {
		return noticeUpdatedAt;
	}

	public void setNoticeUpdatedAt(String noticeUpdatedAt) {
		this.noticeUpdatedAt = noticeUpdatedAt;
	}

	public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public boolean isNoticeIsFixed() {
        return noticeIsFixed;
    }

    public void setNoticeIsFixed(boolean noticeIsFixed) {
        this.noticeIsFixed = noticeIsFixed;
    }

    public String getNoticeCreatedAt() {
        return noticeCreatedAt;
    }

    public void setNoticeCreatedAt(String noticeCreatedAt) {
        this.noticeCreatedAt = noticeCreatedAt;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }
}