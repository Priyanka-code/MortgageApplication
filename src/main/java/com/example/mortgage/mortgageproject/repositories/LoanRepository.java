package com.example.mortgage.mortgageproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mortgage.mortgageproject.models.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{

}
