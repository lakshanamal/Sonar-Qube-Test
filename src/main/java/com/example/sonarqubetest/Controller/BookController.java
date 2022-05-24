package com.example.sonarqubetest.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @PostMapping
    public String test() {
        System.out.println("hello");
        return "hello";
    }
}
