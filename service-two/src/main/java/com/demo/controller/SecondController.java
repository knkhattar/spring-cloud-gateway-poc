package com.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app2")
public class SecondController {

    @GetMapping("/service2")
    public String test(){
        return "Hello from service2";
    }

}
