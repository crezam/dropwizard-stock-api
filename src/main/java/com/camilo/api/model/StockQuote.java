package com.camilo.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class StockQuote {

    private long id;

    @Length(max = 3)
    private String price;

    public StockQuote() {
        // Jackson deserialization
    }

    public StockQuote(long id, String price) {
        this.id = id;
        this.price = price;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getPrice() {
        return price;
    }

}
