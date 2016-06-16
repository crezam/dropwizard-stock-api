package com.camilo.api.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class StockApiConfiguration extends Configuration {

    @NotEmpty
    private String defaultStock;

    @NotEmpty
    private String defaultPrice;

    @JsonProperty
    public String getDefaultStock() {
        return defaultStock;
    }

    @JsonProperty
    public void setDefaultStock(String stock) {
        this.defaultStock = stock;
    }

    @JsonProperty
    public String getDefaultPrice() { return defaultPrice; }

    @JsonProperty
    public void setDefaultPrice(String defaultPrice) { this.defaultPrice = defaultPrice; }
}
