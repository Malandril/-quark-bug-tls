package com.test.scheduler.configuration;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "J")
public interface J {

    @WithDefault("J")
    String name();
}
