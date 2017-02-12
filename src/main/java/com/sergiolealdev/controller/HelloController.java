package com.sergiolealdev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping
    public String greeting() {
        return "Hey Navidul";
    }
	
	@RequestMapping(value="/test2")
    public String greeting2() {
        return "Hey Navidul 2";
    }
}
