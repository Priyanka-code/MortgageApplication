package com.example.mortgage.mortgageproject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Loan")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "loanno")
	private Long loanNo;
	@Column(name = "loanamount")
	private int loanAmount;
	@Column(name = "rateofint")
	private int rateOfInt;
	@Column(name = "tenure")
	private int tenure;
	@Column(name = "emi")
	private int emi;

	public Long getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(Long loanNo) {
		this.loanNo = loanNo;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getRateOfInt() {
		return rateOfInt;
	}
	public void setRateOfInt(int rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	public Loan(Long loanNo, int loanAmount, int rateOfInt, int tenure, int emi) {
		super();
		this.loanNo = loanNo;
		this.loanAmount = loanAmount;
		this.rateOfInt = rateOfInt;
		this.tenure = tenure;
		this.emi = emi;
	}

	public Loan() {}

}
