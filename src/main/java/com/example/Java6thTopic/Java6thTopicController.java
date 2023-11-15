package com.example.Java6thTopic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Java6thTopicController {
    @GetMapping("/greet")
    public String  greet(){

        return "Hello!!";
    }
}