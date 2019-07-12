package com.example.mortgage.mortgageproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mortgage.mortgageproject.models.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{

	Property findByType(String propertyType);

}
