package com.example.mortgage.mortgageproject.services;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mortgage.mortgageproject.models.Customer;
import com.example.mortgage.mortgageproject.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public Customer getCustomer(Long customerId) {

		Optional<Customer> customer = customerRepository.findById(customerId);
		return customer.get();
	}


	public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
		if ((birthDate != null) && (currentDate != null)) {
			return Period.between(birthDate, currentDate).getYears();
		} else {
			return 0;
		}



	}
}
