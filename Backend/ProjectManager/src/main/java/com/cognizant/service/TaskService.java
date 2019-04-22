package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.Task;
import com.cognizant.model.TaskRecord;
import com.cognizant.repository.TaskRepository;

@Service
@Transactional
public class TaskService {

	@Autowired
	public TaskRepository taskRepository;

	public TaskRecord saveTask(TaskRecord task) {
		Task t = new Task();
		t.setTaskId(task.taskId);
		t.setTaskName(task.taskName);
		t.setStartDate(task.startDate);
		t.setEndDate(task.endDate);
		t.setPriority(task.priority);
		t.setStatus(task.status);
		taskRepository.save(t);
		return task;
	}

}
