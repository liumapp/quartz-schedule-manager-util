package com.liumapp.schedule.util.service;

import com.liumapp.schedule.util.container.JobInfo;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;

/**
 * Created by liumapp on 1/8/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface SetSimpleSchedule<In extends JobInfo, J extends JobDetail, G extends SimpleTrigger> {

    /**
     * make name and group name for job and trigger
     * @param jobInfo your socket pattern
     * @return Pattern
     */
    public JobInfo makeParams (In jobInfo) ;

    /**
     * make your job
     * @param jobInfo your object info
     * @return JobDetail
     */
    public JobDetail makeJob (In jobInfo) ;

    /**
     * make your trigger
     * @param jobInfo your object info
     * @return SimpleTrigger
     */
    public SimpleTrigger makeTrigger (In jobInfo) ;

    /**
     * make your job and trigger together
     * @param job your job
     * @param trigger your trigger
     * @throws SchedulerException something error?
     */
    public void putSchedule ( J job , G trigger ) throws SchedulerException;

}