package com.liumapp.schedule.util.config;

import com.liumapp.schedule.util.entity.Guest;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
public class ScheduleConfig {

    @Bean
    @ConfigurationProperties(prefix = "liumapp.schedule.util")
    public ScheduleUtilParams scheduleUtilParams(){
        ScheduleUtilParams scheduleUtilParams = new ScheduleUtilParams();
        return scheduleUtilParams;
    }

    @Bean
    public Guest guest(ScheduleUtilParams scheduleUtilParams) {
        Guest guest = new Guest();
        guest.setAppKey(scheduleUtilParams.getAppKey());
        return guest;
    }

    @Bean
    public Scheduler scheduler () throws SchedulerException {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        return scheduler;
    }

}
