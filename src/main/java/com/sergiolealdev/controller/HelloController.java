package com.sergiolealdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergiolealdev.controller.dto.CustomerDto;
import com.sergiolealdev.service.CustomerService;

@RestController
public class HelloController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping
    public List<CustomerDto> greeting() {
		return customerService.getAll();
    }
	
	@RequestMapping(value="/test2")
    public String greeting2() {
        return "Hey Navidul 2";
    }
}
