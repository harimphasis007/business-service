package com.business.service.domain;

import java.util.List;

public class SearchControl {
	private List<String> programsList;
	private List<String> projectStatusList;
	private List<String> commitmentStatusList;
	private List<String> membersList;
	public List<String> getProgramsList() {
		return programsList;
	}
	public void setProgramsList(List<String> programsList) {
		this.programsList = programsList;
	}
	public List<String> getProjectStatusList() {
		return projectStatusList;
	}
	public void setProjectStatusList(List<String> projectStatusList) {
		this.projectStatusList = projectStatusList;
	}
	public List<String> getCommitmentStatusList() {
		return commitmentStatusList;
	}
	public void setCommitmentStatusList(List<String> commitmentStatusList) {
		this.commitmentStatusList = commitmentStatusList;
	}
	public List<String> getMembersList() {
		return membersList;
	}
	public void setMembersList(List<String> membersList) {
		this.membersList = membersList;
	}
	
}
