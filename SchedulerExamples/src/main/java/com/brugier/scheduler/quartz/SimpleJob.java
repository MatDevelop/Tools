package com.brugier.scheduler.quartz;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDataMap dataMap = context.getJobDetail().getJobDataMap();
		String jobSays = dataMap.getString("jobSays");
		float myFloatValue = dataMap.getFloat("myFloatValue");

		System.out.println("Job says: " + jobSays + ", abd value is: " + myFloatValue);
	}

}
