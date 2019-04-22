package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.User;
import com.cognizant.model.ProjectRecord;
import com.cognizant.model.UserRecord;
import com.cognizant.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public ProjectService projectService;


	public User saveUser(UserRecord userRecord) {
		User user=new User();
		user.setFirstName(userRecord.firstName);
		user.setLastName(userRecord.lastName);
		user.setEmpId(userRecord.employeeId);
//		ProjectRecord p=new ProjectRecord();
//		ProjectRecord p1= projectService.saveProject(p);
//		System.out.println(p1.projectId);
//		user.setProjectId(p1.projectId);
		user.getProjectId();
		return userRepository.save(user);
	}

	public List<User> getAll() {
		return userRepository.findAll();
	}

	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}
}
