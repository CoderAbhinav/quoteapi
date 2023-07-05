package com.abhinav.quoteapi.service;

import com.abhinav.quoteapi.dao.QuoteDAO;
import com.abhinav.quoteapi.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {
    static private QuoteDAO quoteDAO;

    @Autowired
    public QuoteService(@Qualifier("quote-access") QuoteDAO  quoteDAO) {
        if (this.quoteDAO == null) {
            this.quoteDAO = quoteDAO;
        }
    }

    public List<Quote> getQuote() {
        return quoteDAO.getQuote();
    }

    public List<Quote> getQuotes(int limit) {
        return quoteDAO.getQuote(limit);
    }
}
