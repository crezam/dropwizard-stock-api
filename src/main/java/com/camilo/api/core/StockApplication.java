package com.camilo.api.core;

import com.camilo.api.configuration.StockApiConfiguration;
import com.camilo.api.resources.StockResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class StockApplication extends Application<StockApiConfiguration> {

    public static void main(String[] args) throws Exception {
        new StockApplication().run(args);
    }

    @Override
    public String getName() {
        return "stock-api";
    }

    @Override
    public void initialize(Bootstrap<StockApiConfiguration> bootstrap) {

    }

    @Override
    public void run(StockApiConfiguration stockApiConfiguration, Environment environment) throws Exception {

        final StockResource resource = new StockResource(
                stockApiConfiguration.getDefaultStock(),
                stockApiConfiguration.getDefaultPrice()
        );
        environment.jersey().register(resource);

    }
}
