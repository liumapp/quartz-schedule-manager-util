package com.liumapp.schedule.util.config;

import com.liumapp.schedule.util.config.spring.AutoWiringSpringBeanJobFactory;
import com.liumapp.schedule.util.tool.WorkerTool;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.spi.JobFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
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
    @ConfigurationProperties(prefix = "liumapp.schedule")
    public ScheduleUtilParams scheduleUtilParams(){
        ScheduleUtilParams scheduleUtilParams = new ScheduleUtilParams();
        return scheduleUtilParams;
    }

    @Bean
    public JobFactory jobFactory(ApplicationContext applicationContext) {
        AutoWiringSpringBeanJobFactory jobFactory = new AutoWiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        return jobFactory;
    }

    @Bean
    public Scheduler scheduler (JobFactory jobFactory) throws SchedulerException {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        scheduler.setJobFactory(jobFactory);
        scheduler.start();

        return scheduler;
    }

    @Bean
    public WorkerTool workerTool () {
        WorkerTool workerTool = new WorkerTool();
        return workerTool;
    }

}
