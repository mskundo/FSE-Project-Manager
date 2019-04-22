package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.Project;
import com.cognizant.entity.User;
import com.cognizant.model.ProjectRecord;
import com.cognizant.model.UserRecord;
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
		UserRecord r=new UserRecord();
		User r1=userService.saveUser(r);
		r1.setProjectId(projectRecord.projectId);
		return projectRecord;
	}

}
