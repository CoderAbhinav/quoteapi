package com.abhinav.quoteapi.api;

import com.abhinav.quoteapi.model.Quote;
import com.abhinav.quoteapi.service.QuoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/V1/quote")
@RestController
public class QuoteAPIController {
    private static QuoteService quoteService;

    public QuoteAPIController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping
    public List<Quote> getQuote() {
        return quoteService.getQuote();
    }
}
