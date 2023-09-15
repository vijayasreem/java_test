package com.javacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacode.repository.GreetingRepository;

@Service
public class GreetingService {
    
    @Autowired
    private GreetingRepository greetingRepository;

    // Method to fetch and return the welcome message
    public String getWelcomeMessage() {
        return greetingRepository.getWelcomeMessage();
    }

}