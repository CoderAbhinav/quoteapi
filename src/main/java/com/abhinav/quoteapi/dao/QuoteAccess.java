package com.abhinav.quoteapi.dao;

import com.abhinav.quoteapi.model.Quote;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository("quote-access")
public class QuoteAccess implements QuoteDAO{

    private List<Quote> db = new ArrayList<>();

    public QuoteAccess() {
        db.add(new Quote(UUID.randomUUID(), "This is the first quote", "Author0"));
        db.add(new Quote(UUID.randomUUID(), "This is the second quote", "Author1"));
        db.add(new Quote(UUID.randomUUID(), "This is the third quote", "Author2"));
        db.add(new Quote(UUID.randomUUID(), "This is the fourth quote", "Author1"));
        db.add(new Quote(UUID.randomUUID(), "This is the fifth quote", "Author1"));
    }

    @Override
    public List<Quote> getQuote(int limit) {
        return db.stream().limit(limit).toList();
    }

    @Override
    public List<Quote> getQuoteFromAuthor(String authorName, int limit) {
        return db.stream().filter(quote -> {
            return quote.getAuthor().equals(authorName);
        }).limit(limit).toList();
    }

    @Override
    public List<Quote> getQuoteWithTag(String tag, int limit) {
        return db;
    }
}
