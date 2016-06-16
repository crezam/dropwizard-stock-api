package com.camilo.api.health;

import com.codahale.metrics.health.HealthCheck;

public class StockHealthCheck extends HealthCheck {

    private final String stock;

    public StockHealthCheck(String stock) {
        super();
        this.stock = stock;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(stock, "TEST");
        if(!saying.contains("TEST")) {
            return Result.unhealthy("Bad response");
        }
        return Result.healthy();
    }

    @Override
    public Result execute() {
        return super.execute();
    }
}
