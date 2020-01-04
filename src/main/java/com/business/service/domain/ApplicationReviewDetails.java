package com.business.service.domain;

import java.time.Instant;

public class ApplicationReviewDetails {
	private String applicationDate;
	private double totalAmountRequested;
	private int totalReviewTurntime;
	private Instant notificationSentDate;
	private String certifiationName;
	private String certificationTitle;
	private String certificationDate;
	private boolean isProjectSpecificApplication;
	private String projectNameMemberSpecified;
	private String projectDescription;
	private String currentReviewStatus;
	private String currentAssignment;
	private String currentAssignmentStartDate;
	private int currentTurntimeDaysElapsed;
	//Analyst Fields
	private String assignedAnalyst;
	private String analystReviewStartDate;
	private Instant analystReviewEndDate;
	private int analystTurntime;
	private String analystComments;
	private String analystRecommendation;
	//Manager Fields
	private String assinedManager;
	private Instant managerReviewStartDate;
	private String managerDecision;
	private Instant managerReviewEndDate;
	private int managerTurntime;
	private String managerComments;

	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public double getTotalAmountRequested() {
		return totalAmountRequested;
	}
	public void setTotalAmountRequested(double totalAmountRequested) {
		this.totalAmountRequested = totalAmountRequested;
	}
	public int getTotalReviewTurntime() {
		return totalReviewTurntime;
	}
	public void setTotalReviewTurntime(int totalReviewTurntime) {
		this.totalReviewTurntime = totalReviewTurntime;
	}
	public Instant getNotificationSentDate() {
		return notificationSentDate;
	}
	public void setNotificationSentDate(Instant notificationSentDate) {
		this.notificationSentDate = notificationSentDate;
	}
	public String getCertifiationName() {
		return certifiationName;
	}
	public void setCertifiationName(String certifiationName) {
		this.certifiationName = certifiationName;
	}
	public String getCertificationTitle() {
		return certificationTitle;
	}
	public void setCertificationTitle(String certificationTitle) {
		this.certificationTitle = certificationTitle;
	}
	public String getCertificationDate() {
		return certificationDate;
	}
	public void setCertificationDate(String certificationDate) {
		this.certificationDate = certificationDate;
	}
	public boolean isProjectSpecificApplication() {
		return isProjectSpecificApplication;
	}
	public void setProjectSpecificApplication(boolean isProjectSpecificApplication) {
		this.isProjectSpecificApplication = isProjectSpecificApplication;
	}
	public String getProjectNameMemberSpecified() {
		return projectNameMemberSpecified;
	}
	public void setProjectNameMemberSpecified(String projectNameMemberSpecified) {
		this.projectNameMemberSpecified = projectNameMemberSpecified;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getCurrentReviewStatus() {
		return currentReviewStatus;
	}
	public void setCurrentReviewStatus(String currentReviewStatus) {
		this.currentReviewStatus = currentReviewStatus;
	}
	public String getCurrentAssignment() {
		return currentAssignment;
	}
	public void setCurrentAssignment(String currentAssignment) {
		this.currentAssignment = currentAssignment;
	}
	public String getCurrentAssignmentStartDate() {
		return currentAssignmentStartDate;
	}
	public void setCurrentAssignmentStartDate(String currentAssignmentStartDate) {
		this.currentAssignmentStartDate = currentAssignmentStartDate;
	}
	public int getCurrentTurntimeDaysElapsed() {
		return currentTurntimeDaysElapsed;
	}
	public void setCurrentTurntimeDaysElapsed(int currentTurntimeDaysElapsed) {
		this.currentTurntimeDaysElapsed = currentTurntimeDaysElapsed;
	}
	public String getAssignedAnalyst() {
		return assignedAnalyst;
	}
	public void setAssignedAnalyst(String assignedAnalyst) {
		this.assignedAnalyst = assignedAnalyst;
	}
	public String getAnalystReviewStartDate() {
		return analystReviewStartDate;
	}
	public void setAnalystReviewStartDate(String analystReviewStartDate) {
		this.analystReviewStartDate = analystReviewStartDate;
	}
	public Instant getAnalystReviewEndDate() {
		return analystReviewEndDate;
	}
	public void setAnalystReviewEndDate(Instant analystReviewEndDate) {
		this.analystReviewEndDate = analystReviewEndDate;
	}
	public int getAnalystTurntime() {
		return analystTurntime;
	}
	public void setAnalystTurntime(int analystTurntime) {
		this.analystTurntime = analystTurntime;
	}
	public String getAnalystComments() {
		return analystComments;
	}
	public void setAnalystComments(String analystComments) {
		this.analystComments = analystComments;
	}
	public String getAnalystRecommendation() {
		return analystRecommendation;
	}
	public void setAnalystRecommendation(String analystRecommendation) {
		this.analystRecommendation = analystRecommendation;
	}
	public String getAssinedManager() {
		return assinedManager;
	}
	public void setAssinedManager(String assinedManager) {
		this.assinedManager = assinedManager;
	}
	public Instant getManagerReviewStartDate() {
		return managerReviewStartDate;
	}
	public void setManagerReviewStartDate(Instant managerReviewStartDate) {
		this.managerReviewStartDate = managerReviewStartDate;
	}
	public String getManagerDecision() {
		return managerDecision;
	}
	public void setManagerDecision(String managerDecision) {
		this.managerDecision = managerDecision;
	}
	public Instant getManagerReviewEndDate() {
		return managerReviewEndDate;
	}
	public void setManagerReviewEndDate(Instant managerReviewEndDate) {
		this.managerReviewEndDate = managerReviewEndDate;
	}
	public int getManagerTurntime() {
		return managerTurntime;
	}
	public void setManagerTurntime(int managerTurntime) {
		this.managerTurntime = managerTurntime;
	}
	public String getManagerComments() {
		return managerComments;
	}
	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}


}
