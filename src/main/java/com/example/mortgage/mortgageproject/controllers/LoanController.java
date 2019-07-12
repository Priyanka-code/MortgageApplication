package com.example.mortgage.mortgageproject.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mortgage.mortgageproject.models.Customer;
import com.example.mortgage.mortgageproject.models.Loan;
import com.example.mortgage.mortgageproject.services.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanService loanService;

	/**
	 * @param customer
	 * @return
	 */
	@PutMapping("/loan/details")
	public ResponseEntity<Loan> loanOffers(@Valid @RequestBody Customer customer){
		List<Loan> offers = loanService.calcualteOfferedLoanAmount(customer.getCustomerId(), customer.getArea(), customer.getPropertyType());
          
		return new ResponseEntity(offers, HttpStatus.OK);

	}
}
