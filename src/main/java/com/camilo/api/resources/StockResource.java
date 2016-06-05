package com.camilo.api.resources;

import com.camilo.api.model.StockQuote;
import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/price")
@Produces(MediaType.APPLICATION_JSON)
public class StockResource {
    private final String template;
    private final String defaultPrice;
    private final AtomicLong counter;

    public StockResource(String template, String defaultPrice) {
        this.template = template;
        this.defaultPrice = defaultPrice;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public StockQuote sendPrice(@QueryParam("stock") Optional<String> stock) {
        final String value = String.format(template, stock.or(defaultPrice));
        return new StockQuote(counter.incrementAndGet(), value);
    }
}