package com.liumapp.schedule.util.config;

import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 12/19/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class ScheduleUtilParams {

    private String appKey;

    private boolean useDatabase = false;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public boolean isUseDatabase() {
        return useDatabase;
    }

    public void setUseDatabase(boolean useDatabase) {
        this.useDatabase = useDatabase;
    }
}
