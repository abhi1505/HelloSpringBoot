package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhilasha on 11-12-2018.
 */
@RestController
public class HomeController {

    @RequestMapping("/")					//Adding some changes
    public String home(){
        return "Hello Spring Boot";
    }
}
