package com.abhinav.quoteapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("ok")
@RestController
public class TempController {
    @GetMapping
    String sayHello() {
        return "Hello";
    }

}
