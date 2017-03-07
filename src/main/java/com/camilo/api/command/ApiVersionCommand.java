package com.camilo.api.command;

import com.camilo.api.configuration.StockApiConfiguration;
import io.dropwizard.cli.ConfiguredCommand;
import io.dropwizard.setup.Bootstrap;
import net.sourceforge.argparse4j.inf.Namespace;
import net.sourceforge.argparse4j.inf.Subparser;

public class ApiVersionCommand extends ConfiguredCommand<StockApiConfiguration> {

    public ApiVersionCommand(String name, String description) {
        super(name, description);
    }

    @Override
    public void configure(Subparser subparser) {
        super.configure(subparser);
        subparser.description("Prints API version");
    }

    @Override
    public void run(Bootstrap<StockApiConfiguration> bootstrap, Namespace namespace, StockApiConfiguration stockApiConfiguration) throws Exception {
        //TODO add version to the stockApiConfiguration
        System.out.println("v1");
    }
}
