package com.liumapp.schedule.util.service;

import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;

/**
 * Created by liumapp on 1/8/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface SetSimpleSchedule<O extends Object , J extends JobDetail, G extends SimpleTrigger> {

    /**
     * make your job
     * @param val your object info
     * @return JobDetail
     */
    public JobDetail makeJob (O... val) ;

    /**
     * make your trigger
     * @param val your socket pattern
     * @return SimpleTrigger
     */
    public SimpleTrigger makeTrigger (O... val) ;

    /**
     * make your job and trigger together
     * @param job your job
     * @param trigger your trigger
     * @throws SchedulerException something error?
     */
    public void putSchedule ( J job , G trigger ) throws SchedulerException;

}