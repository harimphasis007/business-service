package com.business.service.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.*;

import com.business.service.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

@Service
public class ProjectService {
	private final Logger log = LoggerFactory.getLogger(ProjectService.class);

	public List<Project> getProjects(){
        final String dataHubEndpointProjects = "http://mvp-dataservice.us-east-1.elasticbeanstalk.com:5000/services/dataservice/api/projects";
        final List<Project>  projects = new ArrayList<>();
        final RestTemplate restTemplate = new RestTemplate();

        /*Commenting this, in case we want to do in the right way*/
        /*ResponseEntity<Project[]> response = restTemplate.getForEntity(
            dataHubEndpointProjects,
            Project[].class);

        Project[] projectArray = response.getBody();
        for (final Project project: projectArray) {
            projects.add(project);
        }*/

        final String json = restTemplate.getForObject(
            dataHubEndpointProjects,
            String.class);

        final JsonArray jarr = new JsonParser().parse(json).getAsJsonArray();

        for (int i = 0; i < jarr.size(); i++) {
            final Project project = new Project();
            JsonElement projectNo = jarr.get(i).getAsJsonObject().get("projectNo");
            JsonElement projectName = jarr.get(i).getAsJsonObject().get("projectName");
            JsonElement program = jarr.get(i).getAsJsonObject().getAsJsonObject("program").get("programName");
            JsonElement memberName = jarr.get(i).getAsJsonObject().getAsJsonObject("member").get("memberName");
            JsonElement projectStatus = jarr.get(i).getAsJsonObject().get("projectStatus");
            JsonElement commitmentStatus = jarr.get(i).getAsJsonObject().getAsJsonObject("commitment").get("commitmentStatus");
            JsonElement commitmentExpiration = jarr.get(i).getAsJsonObject().getAsJsonObject("commitment").get("commitmentExpiration");

            project.setProjectNo(projectNo instanceof JsonNull ? "" : projectNo.getAsString());
            project.setProjName(projectName instanceof JsonNull ? "" : projectName.getAsString());
            project.setProgram(program instanceof JsonNull ? "" : program.getAsString());
            project.setMember(memberName instanceof JsonNull ? "" : memberName.getAsString());
            project.setProjectStatus(projectStatus instanceof JsonNull ? "" : projectStatus.getAsString());
            project.setCommitmentStatus(commitmentStatus instanceof JsonNull ? "" : commitmentStatus.getAsString());
            String commitmentBal = jarr.get(i).getAsJsonObject().getAsJsonObject("commitment").get("commitmentBal").getAsString();
            project.setCommitmentBalance(Float.parseFloat(commitmentBal.isEmpty()? "0": commitmentBal));
            project.setCommitmentExpiration(commitmentExpiration instanceof JsonNull ? "" : commitmentExpiration.getAsString());
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
	    final Project project = getProjectDetails(projectNo);
        final ProjectDetails projectDetails = new ProjectDetails();
        final String dataHubEndpointProjectInfoBeneficiaries = "http://mvp-dataservice.us-east-1.elasticbeanstalk.com:5000/services/dataservice/api/info-beneficiaries/" + project.getId();
        final RestTemplate restTemplate = new RestTemplate();

        final String json = restTemplate.getForObject(
            dataHubEndpointProjectInfoBeneficiaries,
            String.class);

        final JsonObject jObj = new JsonParser().parse(json).getAsJsonObject();

        JsonElement jobCreated = jObj.get("jobCreated");
        JsonElement jobRetained = jObj.get("jobRetained");
        JsonElement ownerOccUnits = jObj.get("ownerOccUnits");
        JsonElement rentalUnits = jObj.get("rentalUnits");
        JsonElement geoDefinedBeneficiaries = jObj.get("geoDefinedBeneficiaries");
        JsonElement individualBeneficiaries = jObj.get("individualBeneficiaries");
        JsonElement activityBeneficiaries = jObj.get("activityBeneficiaries");
        JsonElement otherBeneficiaries = jObj.get("otherBeneficiaries");
        JsonElement area = jObj.get("area");
        JsonElement developmentInd = jObj.get("developmentInd");


		projectDetails.setProjectNo(projectNo);
		projectDetails.setProjName(project.getProjName());
		projectDetails.setProgramType(area instanceof JsonNull ? "" : area.getAsString());
		projectDetails.setProjectType(developmentInd instanceof JsonNull ? "" : developmentInd.getAsString());
		projectDetails.setNoOfRentalUnits(rentalUnits instanceof JsonNull ? 0 : rentalUnits.getAsInt());
		projectDetails.setNoOfOwnedUnits(ownerOccUnits instanceof JsonNull ? 0 : ownerOccUnits.getAsInt());
		projectDetails.setNoOfJobsCreated(jobCreated instanceof JsonNull ? 0 : jobCreated.getAsInt());
		projectDetails.setNoOfJobsRetained(jobRetained instanceof JsonNull ? 0 : jobRetained.getAsInt());
		projectDetails.setGeoDefinedBeneficiaries(geoDefinedBeneficiaries instanceof JsonNull ? "" : geoDefinedBeneficiaries.getAsString());
		projectDetails.setIndividualBeneficiaries(individualBeneficiaries instanceof JsonNull ? "" : individualBeneficiaries.getAsString());
		projectDetails.setActivityBeneficiaries(activityBeneficiaries instanceof JsonNull ? "": activityBeneficiaries.getAsString());
		projectDetails.setOtherBeneficiaries(otherBeneficiaries instanceof JsonNull ? "" : otherBeneficiaries.getAsString());

		return projectDetails;
	}

    private Project getProjectDetails(String projectNumber) {
        final String dataHubEndpointProjects = "http://mvp-dataservice.us-east-1.elasticbeanstalk.com:5000/services/dataservice/api/projectsbyprojectid/" + projectNumber;
        //final String dataHubEndpointProjects = "http://mvp-dataservice.us-east-1.elasticbeanstalk.com:5000/services/dataservice/api/projects/1";
        final RestTemplate restTemplate = new RestTemplate();
        final Project project = new Project();

        final String json = restTemplate.getForObject(
            dataHubEndpointProjects,
            String.class);

        final JsonObject jObj = new JsonParser().parse(json).getAsJsonObject();

        JsonElement projectName = jObj.get("projectName");
        JsonElement idJSONElement = jObj.get("id");

        project.setId(idJSONElement instanceof JsonNull ? "" : idJSONElement.getAsString());
        project.setProjectNo(projectNumber);
        project.setProjName(projectName instanceof JsonNull ? "" : projectName.getAsString());

        return project;
    }

	public ApplicationReviewDetails getApplicationReviewDetails(String projectNo) {
        final Project project = getProjectDetails(projectNo);
        final ApplicationReviewDetails applicationReviewDetails = new ApplicationReviewDetails();
        final String dataHubEndpointProjectApplicationReviewDetails = "http://mvp-dataservice.us-east-1.elasticbeanstalk.com:5000/services/dataservice/api/applications/" + project.getId();
        final RestTemplate restTemplate = new RestTemplate();

        final String json = restTemplate.getForObject(
            dataHubEndpointProjectApplicationReviewDetails,
            String.class);

        final JsonObject jObj = new JsonParser().parse(json).getAsJsonObject();

        JsonElement applicationDate = jObj.get("applicationDate");
        JsonElement totalAmountRequested = jObj.get("totalAmountRequested");
        JsonElement certificationName = jObj.get("certificationName");
        JsonElement certificationTitle = jObj.get("certificationTitle");
        JsonElement certificationDate = jObj.get("certificationDate");
        JsonElement projectSpecificApplication = jObj.get("projectSpecificApplication");
        JsonElement currentReviewStatus = jObj.get("currentReviewStatus");
        JsonElement currentAssign = jObj.getAsJsonObject("assignment").get("currentAssign");
        JsonElement currentAssStDate = jObj.getAsJsonObject("assignment").get("currentAssStDate");
        JsonElement analystAssign = jObj.getAsJsonObject("assignment").get("analystAssign");
        JsonElement managerAssign = jObj.getAsJsonObject("assignment").get("managerAssign");
        JsonElement reviewStartDate = jObj.getAsJsonObject("assignment").getAsJsonObject("worker").getAsJsonObject("review").get("reviewStartDate");

		applicationReviewDetails.setApplicationDate(applicationDate instanceof JsonNull ? "" : applicationDate.getAsString());
		applicationReviewDetails.setTotalAmountRequested(totalAmountRequested instanceof JsonNull ? 0 : totalAmountRequested.getAsDouble());
		applicationReviewDetails.setCertifiationName(certificationName instanceof JsonNull ? "" : certificationName.getAsString());
		applicationReviewDetails.setCertificationTitle(certificationTitle instanceof JsonNull ? "" : certificationTitle.getAsString());
		applicationReviewDetails.setCertificationDate(certificationDate instanceof JsonNull ? "" : certificationDate.getAsString());
		applicationReviewDetails.setProjectSpecificApplication(projectSpecificApplication instanceof JsonNull ? false : ("NO".equals(projectSpecificApplication.getAsString()) ? false : true));
		applicationReviewDetails.setCurrentReviewStatus(currentReviewStatus instanceof JsonNull ? "" : currentReviewStatus.getAsString());
		applicationReviewDetails.setCurrentAssignment(currentAssign instanceof JsonNull ? "" : currentAssign.getAsString());
		applicationReviewDetails.setCurrentAssignmentStartDate(currentAssStDate instanceof JsonNull ? "" : currentAssStDate.getAsString());
		applicationReviewDetails.setCurrentTurntimeDaysElapsed(6);
		applicationReviewDetails.setAssignedAnalyst(analystAssign instanceof JsonNull ? "" : analystAssign.getAsString());
		applicationReviewDetails.setAnalystReviewStartDate(reviewStartDate instanceof JsonNull ? "" : reviewStartDate.getAsString());
		applicationReviewDetails.setAssinedManager(managerAssign instanceof JsonNull ? "" : managerAssign.getAsString());

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
