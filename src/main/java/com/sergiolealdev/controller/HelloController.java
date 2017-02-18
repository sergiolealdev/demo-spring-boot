package com.sergiolealdev.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sergiolealdev.controller.dto.CustomerDto;
import com.sergiolealdev.service.CustomerService;

@RestController
public class HelloController {
	
	private final Logger log = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping
    public List<CustomerDto> getAll() {
		return customerService.getAll();
    }
	
	@RequestMapping(value="/find")
	@ResponseBody
    public List<CustomerDto> getByName(@RequestParam("name") String name) {
		log.warn(name);
		return customerService.getByName(name);
    }
	
	@RequestMapping(value="/test2")
    public String greeting2() {
        return "Hey Navidul 2";
    }
}
