package com.example.mortgage.mortgageproject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Property")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "propertyId")
	private Long propertyId;
	@Column(name = "type")
	private String type;
	@Column(name = "rate")
	private int rate;

	public Long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public Property(Long propertyId, String type,  int rate) {
		super();
		this.propertyId = propertyId;
		this.type = type;
		this.rate = rate;
	}

	public Property() {}

}
