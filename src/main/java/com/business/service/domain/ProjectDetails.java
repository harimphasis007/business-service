package com.business.service.domain;

public class ProjectDetails {
	private String projectNo;
	private String projName;

	//Info & Beneficiaries - Properties
	private String programType;
	private String projectType;
	private String infoBeneficiariesId;
	private int noOfRentalUnits;
	private int noOfOwnedUnits;
	private int noOfJobsCreated;
	private int noOfJobsRetained;
	private String geoDefinedBeneficiaries;
	private String individualBeneficiaries;
	private String activityBeneficiaries;
	private String otherBeneficiaries;
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getProgramType() {
		return programType;
	}
	public void setProgramType(String programType) {
		this.programType = programType;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public int getNoOfRentalUnits() {
		return noOfRentalUnits;
	}
	public void setNoOfRentalUnits(int noOfRentalUnits) {
		this.noOfRentalUnits = noOfRentalUnits;
	}
	public int getNoOfOwnedUnits() {
		return noOfOwnedUnits;
	}
	public void setNoOfOwnedUnits(int noOfOwnedUnits) {
		this.noOfOwnedUnits = noOfOwnedUnits;
	}
	public int getNoOfJobsCreated() {
		return noOfJobsCreated;
	}
	public void setNoOfJobsCreated(int noOfJobsCreated) {
		this.noOfJobsCreated = noOfJobsCreated;
	}
	public int getNoOfJobsRetained() {
		return noOfJobsRetained;
	}
	public void setNoOfJobsRetained(int noOfJobsRetained) {
		this.noOfJobsRetained = noOfJobsRetained;
	}
	public String getGeoDefinedBeneficiaries() {
		return geoDefinedBeneficiaries;
	}
	public void setGeoDefinedBeneficiaries(String geoDefinedBeneficiaries) {
		this.geoDefinedBeneficiaries = geoDefinedBeneficiaries;
	}
	public String getIndividualBeneficiaries() {
		return individualBeneficiaries;
	}
	public void setIndividualBeneficiaries(String individualBeneficiaries) {
		this.individualBeneficiaries = individualBeneficiaries;
	}
	public String getActivityBeneficiaries() {
		return activityBeneficiaries;
	}
	public void setActivityBeneficiaries(String activityBeneficiaries) {
		this.activityBeneficiaries = activityBeneficiaries;
	}
	public String getOtherBeneficiaries() {
		return otherBeneficiaries;
	}
	public void setOtherBeneficiaries(String otherBeneficiaries) {
		this.otherBeneficiaries = otherBeneficiaries;
	}

    public String getInfoBeneficiariesId() {
        return infoBeneficiariesId;
    }

    public void setInfoBeneficiariesId(String infoBeneficiariesId) {
        this.infoBeneficiariesId = infoBeneficiariesId;
    }
}
