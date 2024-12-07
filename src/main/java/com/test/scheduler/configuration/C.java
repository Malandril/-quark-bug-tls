package com.test.scheduler.configuration;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "C")
public interface C {

    @WithDefault("C")
    String name();
}
