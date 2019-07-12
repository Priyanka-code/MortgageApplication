package com.example.mortgage.mortgageproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mortgage.mortgageproject.services.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanService loanService;
}
