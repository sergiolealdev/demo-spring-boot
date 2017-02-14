package com.sergiolealdev.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergiolealdev.controller.dto.CustomerDto;
import com.sergiolealdev.model.Customer;
import com.sergiolealdev.repository.CustomerRepository;
import com.sergiolealdev.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<CustomerDto> getAll() {
		List<CustomerDto> listCustomer = new ArrayList<CustomerDto>();
		
		for (Customer customer : customerRepository.findAll()) {
			listCustomer.add(new CustomerDto(customer.getFirstName(),customer.getLastName()));
		}
		
        return listCustomer;
	}

	

}
