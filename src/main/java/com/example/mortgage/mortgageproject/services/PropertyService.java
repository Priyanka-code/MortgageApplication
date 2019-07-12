package com.example.mortgage.mortgageproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mortgage.mortgageproject.repositories.PropertyRepository;

@Service
public class PropertyService {

	@Autowired
	PropertyRepository propertyRepository;

}
