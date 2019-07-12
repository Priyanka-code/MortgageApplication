package com.example.mortgage.mortgageproject.services;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mortgage.mortgageproject.models.Customer;
import com.example.mortgage.mortgageproject.models.Loan;
import com.example.mortgage.mortgageproject.models.Property;
import com.example.mortgage.mortgageproject.repositories.CustomerRepository;
import com.example.mortgage.mortgageproject.repositories.LoanRepository;
import com.example.mortgage.mortgageproject.repositories.PropertyRepository;

@Service
public class LoanService {

	@Autowired
	LoanRepository loanRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	PropertyRepository propertyRepository;

	/**
	 * @param customerId
	 * @param propertyArea
	 * @param propertyType
	 * @return
	 */
	public List<Loan> calcualteOfferedLoanAmount(Long customerId, int propertyArea, String propertyType) {
		List<Loan> offeredLoans = new ArrayList();		
		if(!(customerId==null)) {
			Optional<Customer> customer = customerRepository.findById(customerId);
			CustomerService customerService = new CustomerService();
			Date dateOfBirth = customer.get().getDateOfBirth();
			int age = customerService.calculateAge(dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());

			if(age>25 && customer.get().getMonthlySalary()>10000) {
				Property p = propertyRepository.findByType(propertyType);
				int propertyPrice = (p.getRate()*propertyArea);
				if(propertyPrice>500000) {
					int proposedLoan = (propertyPrice*80)/100;
					List<Loan> loans = loanRepository.findAll();
					for (Loan loan : loans) {
						if (proposedLoan>loan.getLoanAmount()) {
							offeredLoans.add(loan);
						}
					}
				}
			}
		}
		return offeredLoans;
	}
}
