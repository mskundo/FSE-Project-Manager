package com.cognizant.model;

import java.util.Date;

import com.cognizant.entity.User;

public class TaskRecord {
	
	public Long taskId=0L;
	public String taskName="";
	public Date startDate=null;
	public Date endDate=null;
	public int priority=0;
	public String status="";
	public User user;
}
