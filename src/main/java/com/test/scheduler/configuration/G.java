package com.test.scheduler.configuration;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "G")
public interface G {

    @WithDefault("G")
    String name();
}
