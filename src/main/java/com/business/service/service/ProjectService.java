package com.business.service.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.business.service.domain.ApplicationReviewDetails;
import com.business.service.domain.Project;
import com.business.service.domain.ProjectDetails;
import com.business.service.domain.SearchControl;

@Service
public class ProjectService {
	
	private final Logger log = LoggerFactory.getLogger(ProjectService.class);
	
	public List<Project> getProjects(){
		Project project1 = new Project();
		List<Project> projects = new ArrayList<Project>();
		project1.setProjectNo("5000");
		project1.setProjName("2019 CIP #5000");
		project1.setProgram("CIP");
		project1.setMember("#1 - MEMBER 1");
		project1.setProjectStatus("In Review");
		project1.setCommitmentStatus("Inactive");
		//project1.setCommitmentBalance(10000);
		
		Project project2 = new Project();
		project2.setProjectNo("4999");
		project2.setProjName("2019 UDA #4999");
		project2.setProgram("UDA");
		project2.setMember("#2 - MEMBER 2");
		project2.setProjectStatus("Approved");
		project2.setCommitmentStatus("Active");
		project2.setCommitmentBalance(22000000);
		project2.setCommitmentExpiration(new Date().toInstant());
		
		Project project3 = new Project();
		project3.setProjectNo("4998");
		project3.setProjName("2019 RDA #4998");
		project3.setProgram("RDA");
		project3.setMember("#3- MEMBER 3");
		project3.setProjectStatus("Approved");
		project3.setCommitmentStatus("Inactive");
		project3.setCommitmentBalance(0);
		project3.setCommitmentExpiration(new Date().toInstant());
		
		projects.add(project1);
		projects.add(project2);
		projects.add(project3);
		
		return projects;
	}
	
	public SearchControl getSearchControl() {
		SearchControl searchControl = new SearchControl();
		List<String> programsList = new ArrayList<String>();
		programsList.add("CIP");
		programsList.add("UDA");
		programsList.add("RDA");
		List<String> projectStatusList = new ArrayList<String>();
		projectStatusList.add("Approved");
		projectStatusList.add("Rejected");
		projectStatusList.add("In Review");
		List<String> commitmentStatusList = new ArrayList<String>();
		commitmentStatusList.add("Active");
		commitmentStatusList.add("Cancelled");
		commitmentStatusList.add("Expired");
		List<String> membersList = new ArrayList<String>();
		membersList.add("#1 - MEMBER 1");
		membersList.add("#2 - MEMBER 2");
		membersList.add("#3 - MEMBER 3");
		
		searchControl.setCommitmentStatusList(commitmentStatusList);
		searchControl.setMembersList(membersList);
		searchControl.setProgramsList(programsList);
		searchControl.setProjectStatusList(projectStatusList);
		
		return searchControl;
	}
	
	public ProjectDetails getProjectInfoBeneficiaries(String projectNo) {
		ProjectDetails projectDetails = new ProjectDetails();
		projectDetails.setProjectNo(projectNo);
		projectDetails.setProjName("2019 UDA #4999");
		projectDetails.setProgramType("Urban");
		projectDetails.setProjectType("Housing");
		projectDetails.setNoOfRentalUnits(5);
		projectDetails.setNoOfOwnedUnits(10);
		projectDetails.setNoOfJobsCreated(2);
		projectDetails.setNoOfJobsRetained(5);
		projectDetails.setGeoDefinedBeneficiaries("TargetedIncome");
		projectDetails.setIndividualBeneficiaries("JobsCreated");
		projectDetails.setActivityBeneficiaries("SBA");
		projectDetails.setOtherBeneficiaries("");
				
		return projectDetails;
	}
	
	public ApplicationReviewDetails getApplicationReviewDetails(String projectNo) {
		ApplicationReviewDetails applicationReviewDetails = new ApplicationReviewDetails();
		applicationReviewDetails.setApplicationDate(new Date().toInstant());
		applicationReviewDetails.setTotalAmountRequested(22000000);
		applicationReviewDetails.setCertifiationName("John Smith");
		applicationReviewDetails.setCertificationTitle("Lending Specialist");
		applicationReviewDetails.setCertificationDate(new Date().toInstant());
		applicationReviewDetails.setProjectSpecificApplication(false);
		applicationReviewDetails.setCurrentReviewStatus("Analyst Review");
		applicationReviewDetails.setCurrentAssignment("John");
		applicationReviewDetails.setCurrentAssignmentStartDate(new Date().toInstant());
		applicationReviewDetails.setCurrentTurntimeDaysElapsed(6);
		applicationReviewDetails.setAssignedAnalyst("John");
		applicationReviewDetails.setAnalystReviewStartDate(new Date().toInstant());
		applicationReviewDetails.setAssinedManager("Smith");
		
		return applicationReviewDetails;
	}

}
