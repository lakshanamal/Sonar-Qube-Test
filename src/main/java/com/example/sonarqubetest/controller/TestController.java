package com.example.sonarqubetest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @PostMapping
    public void test(){
        List<String> arry = new ArrayList<>();
        arry.add("heelo");
        arry.forEach(System.out::println);
        System.out.println("hello");
        String test;
        test="hellop";
        System.out.println(test);
    }

    @PostMapping("/test")
    public void test1(){
        List<String> arry = new ArrayList<>();
        arry.add("heelo");
        arry.forEach(System.out::println);
        System.out.println("hello");
        String test;
        test="hellop";
        System.out.println(test);
    }
}
