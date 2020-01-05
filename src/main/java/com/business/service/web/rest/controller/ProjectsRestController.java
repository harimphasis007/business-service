package com.business.service.web.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.business.service.domain.ApplicationReviewDetails;
import com.business.service.domain.EmailNotificationsAndContacts;
import com.business.service.domain.Project;
import com.business.service.domain.ProjectDetails;
import com.business.service.domain.ProjectLog;
import com.business.service.domain.SearchControl;
import com.business.service.service.ProjectService;

/**
 * Created by oneclicklabs.io
 */
@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectsRestController {

	// Logger instance
	private static final Logger logger = LoggerFactory.getLogger(ProjectsRestController.class);

	@Autowired
	private ProjectService projectService;

	/*
	@RequestMapping(value = "/getProjects", method = RequestMethod.GET)
	public List<Project> getProjects(@RequestParam(value = "request") String request,	@RequestParam(value = "version", required = false, defaultValue = "1") int version) {

		if (logger.isDebugEnabled()) {
			logger.debug("Start getSomething");
			logger.debug("data: '" + request + "'");
		}

		List<Project> response = null;

		try {
			switch (version) {
			case 1:
				if (logger.isDebugEnabled())
					logger.debug("in version 1");
				// TODO: add your business logic here
				response = projectService.getProjects();

				break;
			default:
				throw new Exception("Unsupported version: " + version);
			}
		} catch (Exception e) {
			//response = e.getMessage().toString();
			logger.error(e.getMessage().toString());
		}

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}*/

	@RequestMapping(value = "/getProjects", method = RequestMethod.GET)
	public List<Project> getProjects() {

		List<Project> response = null;

		response = projectService.getProjects();

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}

	@RequestMapping(value = "/getSearchControls", method = RequestMethod.GET)
	public SearchControl getSearchControls() {

		SearchControl response;

		response = projectService.getSearchControl();

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}

	@RequestMapping(value = "/getProjectInfoBeneficiaries", method = RequestMethod.GET)
	public ProjectDetails getProjectInfoBeneficiaries(@RequestParam String projectNo) {

		ProjectDetails response;

		response = projectService.getProjectInfoBeneficiaries(projectNo);

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}

	@RequestMapping(value = "/getApplicationReviewDetails", method = RequestMethod.GET)
	public ApplicationReviewDetails getApplicationReviewDetails(@RequestParam String projectNo) {

		ApplicationReviewDetails response;

		response = projectService.getApplicationReviewDetails(projectNo);

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}

	@RequestMapping(value = "/getEmailNotificationsAndContacts", method = RequestMethod.GET)
	public EmailNotificationsAndContacts getEmailNotificationsAndContacts(@RequestParam String projectNo) {

		EmailNotificationsAndContacts response;

		response = projectService.getEmailNotificationsAndContacts(projectNo);

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}

	@RequestMapping(value = "/getProjectLog", method = RequestMethod.GET)
	public List<ProjectLog> getProjectLog(@RequestParam String projectNo) {

		List<ProjectLog> response;

		response = projectService.getProjectLog(projectNo);

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}

	@RequestMapping(value = "/searchProject", method = RequestMethod.GET)
	public List<Project> searchProject(@RequestParam(required = false) String projectNo,
			@RequestParam(required = false) String projectName,
			@RequestParam(required = false) String program,
			@RequestParam(required = false) String projectStatus,
			@RequestParam(required = false) String commitmentStatus,
			@RequestParam(required = false) String member) {

		List<Project> response;

		response = projectService.searchProject(projectNo, projectName, program, projectStatus, commitmentStatus, member);

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End getSomething");
		}
		return response;
	}


	@RequestMapping(value = "/<add method name here>", method = RequestMethod.POST)
	public String postSomething(@RequestParam(value = "request") String request,@RequestParam(value = "version", required = false, defaultValue = "1") int version) {

		if (logger.isDebugEnabled()) {
			logger.debug("Start postSomething");
			logger.debug("data: '" + request + "'");
		}

		String response = null;

		try {
			switch (version) {
			case 1:
				if (logger.isDebugEnabled())
					logger.debug("in version 1");
				// TODO: add your business logic here
				response = "Response from Spring RESTful Webservice : "+ request;

				break;
			default:
				throw new Exception("Unsupported version: " + version);
			}
		} catch (Exception e) {
			response = e.getMessage().toString();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End postSomething");
		}
		return response;
	}

	@RequestMapping(value = "/<add method name here>", method = RequestMethod.PUT)
	public String putSomething(@RequestBody String request,@RequestParam(value = "version", required = false, defaultValue = "1") int version) {

		if (logger.isDebugEnabled()) {
			logger.debug("Start putSomething");
			logger.debug("data: '" + request + "'");
		}

		String response = null;

		try {
			switch (version) {
			case 1:
				if (logger.isDebugEnabled())
					logger.debug("in version 1");
				// TODO: add your business logic here
				response = "Response from Spring RESTful Webservice : "+ request;

				break;
			default:
				throw new Exception("Unsupported version: " + version);
			}
		} catch (Exception e) {
			response = e.getMessage().toString();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End putSomething");
		}
		return response;
	}

	@RequestMapping(value = "/<add method name here>", method = RequestMethod.DELETE)
	public void deleteSomething(@RequestBody String request,@RequestParam(value = "version", required = false, defaultValue = "1") int version) {

		if (logger.isDebugEnabled()) {
			logger.debug("Start putSomething");
			logger.debug("data: '" + request + "'");
		}

		String response = null;

		try {
			switch (version) {
			case 1:
				if (logger.isDebugEnabled())
					logger.debug("in version 1");
				// TODO: add your business logic here

				break;
			default:
				throw new Exception("Unsupported version: " + version);
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
		}

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + response + "'");
			logger.debug("End putSomething");
		}
	}
}
