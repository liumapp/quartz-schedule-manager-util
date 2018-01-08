package com.liumapp.schedule.util.container;

import org.quartz.DateBuilder;

/**
 * Created by liumapp on 1/8/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class JobInfo {

    private String jobName ;

    private String triggerName ;

    private String groupName ;

    private Integer time;

    private DateBuilder.IntervalUnit unit;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public DateBuilder.IntervalUnit getUnit() {
        return unit;
    }

    public void setUnit(DateBuilder.IntervalUnit unit) {
        this.unit = unit;
    }
}
