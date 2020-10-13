package com.sample.healthcheck;

import com.codahale.metrics.health.HealthCheck;

public class HerokuHealthCheck extends HealthCheck {
    protected Result check() throws Exception {
        return null;
    }
}
