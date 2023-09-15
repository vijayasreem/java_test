package com.javacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacode.model.WelcomeMessage;
import com.javacode.repository.WelcomeMessageRepository;

@Service
public class WelcomeMessageService {
    
    @Autowired
    private WelcomeMessageRepository welcomeMessageRepository;
    
    public WelcomeMessage findByWelcomeMessage() {
        return welcomeMessageRepository.findByWelcomeMessage();
    }
    
    public void save(WelcomeMessage welcomeMessage) {
        welcomeMessageRepository.save(welcomeMessage);
    }
    
    public void delete(WelcomeMessage welcomeMessage) {
        welcomeMessageRepository.delete(welcomeMessage);
    }
    
    public void update(WelcomeMessage welcomeMessage) {
        welcomeMessageRepository.update(welcomeMessage);
    }
    
}