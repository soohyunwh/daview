package com.daview.dto;

public class ChatMessageDTO {
	private String chatroomId;
    private Long senderId;
    private String content;
    private String sentAt;
    
	public String getChatroomId() {
		return chatroomId;
	}
	public void setChatroomId(String chatroomId) {
		this.chatroomId = chatroomId;
	}
	public Long getSenderId() {
		return senderId;
	}
	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSentAt() {
		return sentAt;
	}
	public void setSentAt(String sentAt) {
		this.sentAt = sentAt;
	}

}
