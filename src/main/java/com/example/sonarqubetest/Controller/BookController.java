package com.example.sonarqubetest.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @PostMapping
    public void test() {
        System.out.println("hello");
    }
}
