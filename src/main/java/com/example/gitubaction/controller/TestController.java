package com.example.gitubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/github-pipeline")
    public String testController(){
        return "hello-github-pipeline-3";
    }
}
