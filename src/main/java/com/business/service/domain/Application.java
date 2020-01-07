package com.business.service.domain;

public class Application {
    private String applicationNo;
    private String applicationDate;
    private String applicationReviewStatus;
    private String createdOn;
    private String createdBy;
    private String currentCompletePer;
    private String lastUpdatedOn;

    public String getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getApplicationReviewStatus() {
        return applicationReviewStatus;
    }

    public void setApplicationReviewStatus(String applicationReviewStatus) {
        this.applicationReviewStatus = applicationReviewStatus;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCurrentCompletePer() {
        return currentCompletePer;
    }

    public void setCurrentCompletePer(String currentCompletePer) {
        this.currentCompletePer = currentCompletePer;
    }

    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }
}
