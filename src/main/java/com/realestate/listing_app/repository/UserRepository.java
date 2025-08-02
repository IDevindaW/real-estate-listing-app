package com.realestate.listing_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.realestate.listing_app.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}