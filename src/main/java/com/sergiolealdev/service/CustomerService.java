package com.sergiolealdev.service;

import java.util.List;

import com.sergiolealdev.controller.dto.CustomerDto;

public interface CustomerService {

	public List<CustomerDto> getAll();
	
	public List<CustomerDto> getByName(String name);
	
	public List<CustomerDto> getBySurname(String surname);
}
