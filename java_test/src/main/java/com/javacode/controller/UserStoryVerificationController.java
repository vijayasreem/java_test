package com.javacode.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javacode.service.UserStoryVerificationService;

@RestController
public class UserStoryVerificationController {

    private UserStoryVerificationService userStoryVerificationService;

    public UserStoryVerificationController(UserStoryVerificationService userStoryVerificationService) {
        this.userStoryVerificationService = userStoryVerificationService;
    }

    @GetMapping("/greetingMessage")
    public String greetingMessage() {
        return userStoryVerificationService.greetingMessage();
    }

    @PostMapping("/verifyIdentityAndAddress")
    public String verifyIdentityAndAddress(@RequestBody Map<String, String> input) {
        return userStoryVerificationService.verifyIdentityAndAddress(input);
    }
    
    @GetMapping("/evaluateCreditworthiness")
    public String evaluateCreditworthiness(int annualIncome, int creditScore) {
        return userStoryVerificationService.evaluateCreditworthiness(annualIncome, creditScore);
    }

    @GetMapping("/assessVehicleValue")
    public String assessVehicleValue(int loanAmount, int vehicleValue) {
        return userStoryVerificationService.assessVehicleValue(loanAmount, vehicleValue);
    }

    @GetMapping("/verifyVendorInfo")
    public String verifyVendorInfo(String vendorInfo) {
        return userStoryVerificationService.verifyVendorInfo(vendorInfo);
    }

    @GetMapping("/checkForFunds")
    public String checkForFunds(int amount) {
        return userStoryVerificationService.checkForFunds(amount);
    }

    @GetMapping("/promptForPaymentApproval")
    public String promptForPaymentApproval(int amount) {
        return userStoryVerificationService.promptForPaymentApproval(amount);
    }

}