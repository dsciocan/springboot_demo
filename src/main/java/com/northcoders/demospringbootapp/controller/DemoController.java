package com.northcoders.demospringbootapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class DemoController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello there!";
    }

}
