package com.brugier.scheduler.quartz;

import org.quartz.DateBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzScheduler {

	public static void main(String[] args) {
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		try {
			Scheduler scheduler = schedulerFactory.getScheduler();
			
			JobDetail job = JobBuilder.newJob(SimpleJob.class)
									  .withIdentity("myJob", "group1")
									  .usingJobData("jobSays", "Hello World!")
									  .usingJobData("myFloatValue", 3.141f)
									  .build();
			
			Trigger trigger = TriggerBuilder.newTrigger()
										    .withIdentity("myTrigger", "group1")
										    .startNow()
										    .withSchedule(SimpleScheduleBuilder.simpleSchedule()
										    								   .withIntervalInSeconds(10)
										    								   .repeatForever())
										    .build();
			
			JobDetail jobA = JobBuilder.newJob(JobA.class)
									   .withIdentity("jobA", "group2")
									   .build();

            JobDetail jobB = JobBuilder.newJob(JobB.class)
            						   .withIdentity("jobB", "group2")
            						   .build();

            Trigger triggerA = TriggerBuilder.newTrigger()
            								 .withIdentity("triggerA", "group2")
            								 .startNow()
            								 .withPriority(15)
            								 .withSchedule(SimpleScheduleBuilder.simpleSchedule()
            										 							.withIntervalInSeconds(6)
            										 							.repeatForever())
            								 .build();

            Trigger triggerB = TriggerBuilder.newTrigger()
            								 .withIdentity("triggerB", "group2")
            								 .startAt(DateBuilder.todayAt(23, 15, 10))
            								 .withPriority(10)
            								 .withSchedule(SimpleScheduleBuilder.simpleSchedule()
            										 							.withIntervalInSeconds(3)
            										 							.repeatForever())
            								 .build();


            scheduler.scheduleJob(job, trigger);
            scheduler.scheduleJob(jobA, triggerA);
            scheduler.scheduleJob(jobB, triggerB);
            scheduler.start();
			
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
}
