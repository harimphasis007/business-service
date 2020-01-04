package com.business.service.domain;

import java.time.Instant;
import java.util.List;

public class EmailNotification {
	private String sentDate;
	private String fromEmailAddress;
	private List<String> toEmailAddress;
	private List<String> ccEmailAddress;
	private String notificationType;
	private String subjectLine;
	public String getSentDate() {
		return sentDate;
	}
	public void setSentDate(String sentDate) {
		this.sentDate = sentDate;
	}
	public String getFromEmailAddress() {
		return fromEmailAddress;
	}
	public void setFromEmailAddress(String fromEmailAddress) {
		this.fromEmailAddress = fromEmailAddress;
	}
	public List<String> getToEmailAddress() {
		return toEmailAddress;
	}
	public void setToEmailAddress(List<String> toEmailAddress) {
		this.toEmailAddress = toEmailAddress;
	}
	public List<String> getCcEmailAddress() {
		return ccEmailAddress;
	}
	public void setCcEmailAddress(List<String> ccEmailAddress) {
		this.ccEmailAddress = ccEmailAddress;
	}
	public String getNotificationType() {
		return notificationType;
	}
	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}
	public String getSubjectLine() {
		return subjectLine;
	}
	public void setSubjectLine(String subjectLine) {
		this.subjectLine = subjectLine;
	}
}
