package com.test.scheduler.configuration;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "D")
public interface D {

    @WithDefault("D")
    String name();
}
