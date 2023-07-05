package com.abhinav.quoteapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Quote {
    private final UUID id;
    private final String quote;
    private final String Author;


    public Quote(@JsonProperty("id") UUID id, @JsonProperty("quote") String quote, @JsonProperty("author") String author) {
        this.id = id;
        this.quote = quote;
        Author = author;
    }

    public UUID getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
