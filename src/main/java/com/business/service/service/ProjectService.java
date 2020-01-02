package com.business.service.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.business.service.domain.ApplicationReviewDetails;
import com.business.service.domain.EmailNotification;
import com.business.service.domain.EmailNotificationsAndContacts;
import com.business.service.domain.Project;
import com.business.service.domain.ProjectContacts;
import com.business.service.domain.ProjectDetails;
import com.business.service.domain.ProjectLog;
import com.business.service.domain.SearchControl;
import org.springframework.web.client.RestTemplate;

@Service
public class ProjectService {
	private final Logger log = LoggerFactory.getLogger(ProjectService.class);

	public List<Project> getProjects(){
        final String dataHubEndpointProjects = "<<Your Endpoint>>";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Project[]> response = restTemplate.getForEntity(
            dataHubEndpointProjects,
            Project[].class);

        Project[] projectArray = response.getBody();
        List<Project>  projects = new ArrayList<>();
        for (Project project: projectArray) {
            projects.add(project);
        }

		return projects;
	}

	public List<Project> searchProject(String projectNo,
			String projectName,
			String program,
			String projectStatus,
			String commitmentStatus,
			String member){
		Project project1 = new Project();
		List<Project> projects = new ArrayList<Project>();
		project1.setProjectNo("5000");
		project1.setProjName("2019 CIP #5000");
		project1.setProgram("CIP");
		project1.setMember("#1 - MEMBER 1");
		project1.setProjectStatus("In Review");
		project1.setCommitmentStatus("Inactive");
		//project1.setCommitmentBalance(10000);


		projects.add(project1);

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

	public EmailNotificationsAndContacts getEmailNotificationsAndContacts(String projectNo) {
		EmailNotificationsAndContacts emailNotificationsAndContacts = new EmailNotificationsAndContacts();

		List<EmailNotification> emailNotificationsList = new ArrayList<EmailNotification>();

		EmailNotification emailNotification1 = new EmailNotification();
		emailNotification1.setSentDate(new Date().toInstant());
		emailNotification1.setFromEmailAddress("CLP@fhlbny.com");
		List<String> toEmailAddresses = new ArrayList<String>();
		toEmailAddresses.add("john.smith@memberbank.com");
		toEmailAddresses.add("jane.anderson@memberbank.com");
		toEmailAddresses.add("margaret.thompson@memberbank.com");
		emailNotification1.setToEmailAddress(toEmailAddresses);

		List<String> ccEmailAddresses = new ArrayList<String>();
		ccEmailAddresses.add("margaret.thompson@memberbank.com");
		emailNotification1.setCcEmailAddress(ccEmailAddresses);

		emailNotification1.setNotificationType("Application Received");

		emailNotification1.setSubjectLine("Community Investment Program Application #5000 Received on 11/12/2019");

		emailNotificationsList.add(emailNotification1);

		emailNotificationsAndContacts.setEmailNotificationsList(emailNotificationsList);

		List<ProjectContacts> projectContactsList = new ArrayList<ProjectContacts>();

		ProjectContacts projectContacts1 = new ProjectContacts();
		projectContacts1.setContactName("John Smith");
		projectContacts1.setTitle("Lending Specialist");
		projectContacts1.setSource("Application (Certification Section)");
		projectContacts1.setPhoneNumber("(212) 960-8841");
		projectContacts1.setEmailAddress("sohn.smith@memberbank.com");

		projectContactsList.add(projectContacts1);

		ProjectContacts projectContacts2 = new ProjectContacts();
		projectContacts2.setContactName("Jane Anderson");
		projectContacts2.setTitle("Lending Analyst");
		projectContacts2.setSource("CRM");
		projectContacts2.setPhoneNumber("(212) 960-8841");
		projectContacts2.setEmailAddress("jane.anderson@memberbank.com");

		projectContactsList.add(projectContacts2);

		emailNotificationsAndContacts.setProjectContactsList(projectContactsList);

		return emailNotificationsAndContacts;
	}

	public List<ProjectLog> getProjectLog(String projectNo){
		List<ProjectLog> projectLogList = new ArrayList<ProjectLog>();
		ProjectLog projectLog = new ProjectLog();
		projectLog.setProjectDate(new Date().toInstant());
		projectLog.setEntryDetails("Application Submitted");
		projectLog.setProjectUser("John Smith (External User- Member# 1");
		projectLogList.add(projectLog);

		ProjectLog projectLog1 = new ProjectLog();
		projectLog1.setProjectDate(new Date().toInstant());
		projectLog1.setEntryDetails("'Application Received' email notification sent");
		projectLog1.setProjectUser("System");
		projectLogList.add(projectLog1);

		ProjectLog projectLog2 = new ProjectLog();
		projectLog2.setProjectDate(new Date().toInstant());
		projectLog2.setEntryDetails("Analyst Review Complete");
		projectLog2.setProjectUser("Jennifer Alberto");
		projectLogList.add(projectLog2);
		return projectLogList;
	}

}
