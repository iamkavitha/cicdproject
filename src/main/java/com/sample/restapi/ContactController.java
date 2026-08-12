package com.sample.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/hello")
    public String welcomePage(){
        return "Hello!!!...Welcome";
    }
}
