package com.business.service.dto;

import com.business.service.domain.Project;

public class ProjectDTO {

	private String projectNo;
	private String projName;
	private String program;
	private String member;
	private String projectStatus;
	private String commitmentStatus;
	private double commitmentBalance;
	private String commitmentExpiration;
	private String cisProgramType;
	private String projEffDate;
	private String custNo;
	private String custContactId;


	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public ProjectDTO() {

	}

	public ProjectDTO(Project project) {
		this.projectNo = project.getProjectNo();
		this.projName = project.getProjName();
		this.program = project.getProgram();
		this.member = project.getMember();
		this.projectStatus = project.getProjectStatus();
		this.commitmentStatus = project.getCommitmentStatus();
		this.commitmentBalance = project.getCommitmentBalance();
		this.commitmentExpiration = project.getCommitmentExpiration();
		this.cisProgramType = project.getCisProgramType();
		this.projEffDate = project.getProjEffDate();
		this.custNo = project.getCustNo();
		this.custContactId = project.getCustContactId();

	}
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getCommitmentStatus() {
		return commitmentStatus;
	}

	public void setCommitmentStatus(String commitmentStatus) {
		this.commitmentStatus = commitmentStatus;
	}

	public double getCommitmentBalance() {
		return commitmentBalance;
	}

	public void setCommitmentBalance(double commitmentBalance) {
		this.commitmentBalance = commitmentBalance;
	}

	public String getCommitmentExpiration() {
		return commitmentExpiration;
	}

	public void setCommitmentExpiration(String commitmentExpiration) {
		this.commitmentExpiration = commitmentExpiration;
	}

	public String getCisProgramType() {
		return cisProgramType;
	}
	public void setCisProgramType(String cisProgramType) {
		this.cisProgramType = cisProgramType;
	}
	public String getProjEffDate() {
		return projEffDate;
	}
	public void setProjEffDate(String projEffDate) {
		this.projEffDate = projEffDate;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustContactId() {
		return custContactId;
	}
	public void setCustContactId(String custContactId) {
		this.custContactId = custContactId;
	}

}
