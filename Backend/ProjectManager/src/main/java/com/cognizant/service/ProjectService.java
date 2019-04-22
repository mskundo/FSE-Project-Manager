package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.Project;
import com.cognizant.model.ProjectRecord;
import com.cognizant.repository.ProjectRepository;

@Transactional
@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	public UserService userService;

	public List<Project> findAll() {
		return projectRepository.findAll();
	}

	public ProjectRecord saveProject(ProjectRecord projectRecord) {
		Project project = new Project();
		project.setProjectId(projectRecord.projectId);
		project.setProjectName(projectRecord.projectName);
		project.setStartDate(projectRecord.startDate);
		project.setEndDate(projectRecord.endDate);
		project.setPriority(projectRecord.priority);
		projectRepository.save(project);
		return projectRecord;
	}

}
