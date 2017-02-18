package com.sergiolealdev.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergiolealdev.controller.HelloController;
import com.sergiolealdev.controller.dto.CustomerDto;
import com.sergiolealdev.model.Customer;
import com.sergiolealdev.repository.CustomerRepository;
import com.sergiolealdev.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<CustomerDto> getAll() {
		return getListCustomerDto((List<Customer>)customerRepository.findAll());
	}

	@Override
	public List<CustomerDto> getByName(String firstName) {
		return getListCustomerDto(customerRepository.findByFirstName(firstName));
	}

	@Override
	public List<CustomerDto> getBySurname(String surname) {
		return getListCustomerDto(customerRepository.findByLastName(surname));
	}
	
	private List<CustomerDto> getListCustomerDto(List<Customer> customerList){
		log.warn("getListCustomerDto");
		List<CustomerDto> listCustomer = new ArrayList<CustomerDto>();
		
		for (Customer customer : customerList) {
			listCustomer.add(new CustomerDto(customer.getFirstName(),customer.getLastName()));
		}
		
		log.warn(String.valueOf(listCustomer.size()));
        return listCustomer;
	}

	

}
