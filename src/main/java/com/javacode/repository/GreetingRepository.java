package com.javacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Object, Long> {

    // Query to get the welcoming message
    String getWelcomeMessage();

}