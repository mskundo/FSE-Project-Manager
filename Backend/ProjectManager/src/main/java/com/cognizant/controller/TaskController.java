package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.TaskRecord;
import com.cognizant.service.TaskService;

@RestController
@RequestMapping("/projectmanager/tasks")
@CrossOrigin(origins = "*")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/saveTask")
	public TaskRecord saveTask(TaskRecord task){
		return taskService.saveTask(task);
	}
	
	

}
