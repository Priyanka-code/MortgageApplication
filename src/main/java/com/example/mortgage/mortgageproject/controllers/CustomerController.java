package com.example.mortgage.mortgageproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mortgage.mortgageproject.models.Customer;
import com.example.mortgage.mortgageproject.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	/**
	 * @param customerId
	 * @return
	 */
	@GetMapping("/details/{customerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("customerId") Long customerId){
		return new ResponseEntity<>(customerService.getCustomer(customerId), HttpStatus.OK);
	}
}
