package com.javacode.service;

import java.util.Map;

public class UserStoryVerificationService {

    public String greetingMessage() {
        return "Welcome to the Document Verification App. Please provide your identity and address details.";
    }
    
    public String verifyIdentityAndAddress(Map<String, String> input) {
        return input.get("identity") == "yes" && input.get("address") == "yes" ? "The customer is eligible for banking services." : "The customer is not eligible for banking services.";
    }
    
    public String evaluateCreditworthiness(int annualIncome, int creditScore) {
        return annualIncome > 50000 && creditScore > 600 ? "The customer has a credit limit of $10000" : "The customer does not meet the credit limit requirements";
    }
    
    public String assessVehicleValue(int loanAmount, int vehicleValue) {
        return loanAmount == vehicleValue ? "The loan disbursement is approved." : "The loan disbursement is not approved.";
    }
    
    public String verifyVendorInfo(String vendorInfo) {
        return vendorInfo == "valid" ? "The vendor information is valid." : "The vendor information is invalid.";
    }
    
    public String checkForFunds(int amount) {
        return amount > 0 ? "The funds for disbursement is sufficient." : "The funds for disbursement is insufficient.";
    }
    
    public String promptForPaymentApproval(int amount) {
        return amount > 0 ? "Payment approval is required and not granted." : "Payment approval is not required.";
    }
}