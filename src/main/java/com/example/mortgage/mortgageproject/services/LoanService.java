package com.example.mortgage.mortgageproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mortgage.mortgageproject.repositories.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
	LoanRepository loanRepository;

}
