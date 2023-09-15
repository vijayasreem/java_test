package com.javacode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javacode.model.WelcomeMessage;
import com.javacode.service.WelcomeMessageService;

@RestController
public class WelcomeMessageController {
    
    @Autowired
    private WelcomeMessageService welcomeMessageService;
    
    @GetMapping("/welcomeMessage")
    public WelcomeMessage findByWelcomeMessage() {
        return welcomeMessageService.findByWelcomeMessage();
    }
    
    @PostMapping("/welcomeMessage")
    public void save(@RequestBody WelcomeMessage welcomeMessage) {
        welcomeMessageService.save(welcomeMessage);
    }
    
    @DeleteMapping("/welcomeMessage")
    public void delete(@RequestBody WelcomeMessage welcomeMessage) {
        welcomeMessageService.delete(welcomeMessage);
    }
    
    @PutMapping("/welcomeMessage")
    public void update(@RequestBody WelcomeMessage welcomeMessage) {
        welcomeMessageService.update(welcomeMessage);
    }
    
}