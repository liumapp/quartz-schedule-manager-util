package com.liumapp.schedule.util.config;

import com.liumapp.schedule.util.entity.Guest;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
public class ScheduleConfig {

    @Bean
    @ConfigurationProperties(prefix = "liumapp.schedule.util")
    public ScheduleParams scheduleParams(){
        ScheduleParams scheduleParams = new ScheduleParams();
        return scheduleParams;
    }

    @Bean
    public Guest guest(ScheduleParams scheduleParams) {
        Guest guest = new Guest();
        guest.setAppKey(scheduleParams.getAppKey());
        return guest;
    }

}
