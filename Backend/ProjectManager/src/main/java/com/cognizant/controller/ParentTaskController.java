package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.ParentTask;
import com.cognizant.model.ParentTaskRecord;
import com.cognizant.service.ParentTaskService;

@RestController
@RequestMapping("/projectmanager/parentTask")
@CrossOrigin(origins="*")
public class ParentTaskController {
	
	@Autowired
	public ParentTaskService parentTaskService;
	
	@PostMapping("/save")
	public ParentTask save(@RequestBody ParentTaskRecord parentTaskRecord) {
		return parentTaskService.save(parentTaskRecord);

	}
}
