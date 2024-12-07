package com.test.scheduler.configuration;

import io.smallrye.config.ConfigMapping;

/**
 * Configuration class to map properties file
 */
@ConfigMapping(prefix = "scheduler")
public interface SchedulerConfiguration {

    Task task();

    interface Task {
        String cron();

        String targetProfile();
    }

}
