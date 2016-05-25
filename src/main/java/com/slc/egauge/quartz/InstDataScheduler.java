/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.quartz;

import com.slc.egauge.services.InstantaneousDataService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.quartz.Job;
import static org.quartz.JobBuilder.newJob;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import static org.quartz.TriggerBuilder.newTrigger;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author srostantkritikos06
 */
public class InstDataScheduler {
    public void getData() {
        try {
                SchedulerFactory sf = new StdSchedulerFactory();
                Scheduler scheduler = sf.getScheduler();
                scheduler.start();
                
                JobDetail job =  newJob(InstantaneousDataService.class).build();
                
                Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1").startNow()
                        .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(35).repeatForever()).build();
                
                scheduler.scheduleJob(job, trigger);
                
            } catch (SchedulerException ex) {
            Logger.getLogger(InstDataScheduler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception thrown in scheduler function");
        }
    }
            
}
