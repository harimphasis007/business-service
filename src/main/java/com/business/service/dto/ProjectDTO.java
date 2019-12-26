package com.business.service.dto;

import java.time.Instant;

import com.business.domain.Project;

public class ProjectDTO {
	
	private String projectNo;
	private String cisProgramType;
	private Instant projEffDate;
	private String custNo;
	private String custContactId;
	private String projName;
	
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
		this.cisProgramType = project.getCisProgramType();
		this.projEffDate = project.getProjEffDate();
		this.custNo = project.getCustNo();
		this.custContactId = project.getCustContactId();
		this.projName = project.getProjName();
	}
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getCisProgramType() {
		return cisProgramType;
	}
	public void setCisProgramType(String cisProgramType) {
		this.cisProgramType = cisProgramType;
	}
	public Instant getProjEffDate() {
		return projEffDate;
	}
	public void setProjEffDate(Instant projEffDate) {
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
