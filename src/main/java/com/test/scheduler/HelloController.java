package com.test.scheduler;

import com.test.scheduler.configuration.L;
import com.test.scheduler.configuration.M;
import com.test.scheduler.configuration.N;
import com.test.scheduler.configuration.SchedulerConfiguration;
import com.test.scheduler.configuration.B;
import com.test.scheduler.configuration.C;
import com.test.scheduler.configuration.D;
import com.test.scheduler.configuration.E;
import com.test.scheduler.configuration.G;
import com.test.scheduler.configuration.H;
import com.test.scheduler.configuration.I;
import com.test.scheduler.configuration.J;
import com.test.scheduler.configuration.K;
import io.quarkus.tls.TlsConfiguration;
import io.quarkus.tls.TlsConfigurationRegistry;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.security.KeyStoreException;
import java.util.Optional;

@Slf4j
@Path("/test")
@Singleton
public class HelloController {
    @Inject
    TlsConfigurationRegistry tlsConfigurationRegistry;

    @Inject
    SchedulerConfiguration configuration;

    @Inject
    Intermediate intermediate;
    @Inject
    B b;
    @Inject
    C c;
    @Inject
    D d;
    @Inject
    E e;
    @Inject
    G g;
    @Inject
    H h;
    @Inject
    I i;
    @Inject
    J j;
    @Inject
    K k;
    @Inject
    L l;
    @Inject
    M m;
    @Inject
    N n;

    @ConfigProperty(name = "quarkus.tls.mytls.key.store.p12.path")
    String string;

    @GET
    @Path("/hello")
    public Data hello() throws KeyStoreException {
        Optional<TlsConfiguration> tlsConfiguration = tlsConfigurationRegistry.get("mytls");
        return new Data(tlsConfiguration.get().getKeyStore(),string);
    }

    public  static  record Data(java.security.KeyStore keystore, String configuredPath){}
}
