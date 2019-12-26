package com.business.service.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.business.domain.Project;
import com.business.service.dto.ProjectDTO;

@Service
public class ProjectService {
	
	private final Logger log = LoggerFactory.getLogger(ProjectService.class);
	
	public List<Project> getProjects(){
		Project project1 = new Project();
		List<Project> projects = new ArrayList<Project>();
		project1.setProjectNo("5000");
		project1.setProjName("2019 CIP #5000");
		
		Project project2 = new Project();
		project2.setProjectNo("4999");
		project2.setProjName("2019 CIP #4999");
		
		Project project3 = new Project();
		project3.setProjectNo("4998");
		project3.setProjName("2019 CIP #4998");
		
		projects.add(project1);
		projects.add(project2);
		projects.add(project3);
		
		return projects;
	}

}
