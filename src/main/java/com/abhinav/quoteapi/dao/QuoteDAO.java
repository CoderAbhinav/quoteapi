package com.abhinav.quoteapi.dao;

import com.abhinav.quoteapi.model.Quote;

import java.util.List;

public interface QuoteDAO {
    static int default_limit = 10;

    List<Quote> getQuote(int limit);

    default List<Quote> getQuote() {
        return getQuote(default_limit);
    }

    List<Quote> getQuoteFromAuthor(String authorName, int limit);

    default List<Quote> getQuoteFromAuthor(String authorName) {
        return getQuoteFromAuthor(authorName, default_limit);
    }

    List<Quote> getQuoteWithTag(String tag, int limit);

    default List<Quote> getQuoteWithTag(String tag) {
        return getQuoteWithTag(tag, default_limit);
    }
}
