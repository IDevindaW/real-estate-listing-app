package com.realestate.listing_app.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.realestate.listing_app.model.Property;

public interface PropertyRepository extends MongoRepository<Property, String> {
}