package com.sample;

import com.sample.healthcheck.HerokuHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HerokuApplication extends Application<HerokuConfiguration> {

    public static void main(String[] args) throws Exception {
        new HerokuApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<HerokuConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HerokuConfiguration herokuConfiguration, Environment environment) throws Exception {
        final HerokuRestResource resource = new HerokuRestResource();
        final HerokuHealthCheck healthCheck = new HerokuHealthCheck();

        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }
}
