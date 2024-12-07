package com.test.scheduler.configuration;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

import java.time.Duration;

@ConfigMapping(prefix = "A.auth")
public interface M {
    @WithDefault("4")
    int maxFailures();

    @WithDefault("4")
    Duration lockDelay();

    @WithDefault("4")
    int cacheSize();
}
