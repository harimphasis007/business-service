package com.business.service.domain;

import java.util.List;

public class EmailNotificationsAndContacts {
	private List<EmailNotification> emailNotificationsList;
	private List<ProjectContacts> projectContactsList;
	public List<EmailNotification> getEmailNotificationsList() {
		return emailNotificationsList;
	}
	public void setEmailNotificationsList(List<EmailNotification> emailNotificationsList) {
		this.emailNotificationsList = emailNotificationsList;
	}
	public List<ProjectContacts> getProjectContactsList() {
		return projectContactsList;
	}
	public void setProjectContactsList(List<ProjectContacts> projectContactsList) {
		this.projectContactsList = projectContactsList;
	}
}
