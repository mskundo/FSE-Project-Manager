package com.cognizant.model;

import java.util.Date;

import com.cognizant.entity.User;

public class ProjectRecord {
	
	public Long projectId=0L;
	public String projectName="";
	public Date startDate=null;
	public Date endDate=null;
	public int priority=0;
	public User user;
	public Long taskId=0L;
	public String taskName="";
	public Date TaskStartDate=null;
	public Date TaskEndDate=null;
	public String TaskPriority="";
}
