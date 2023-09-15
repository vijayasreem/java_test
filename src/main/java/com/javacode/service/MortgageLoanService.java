package com.javacode.service;

import org.springframework.stereotype.Service;

import com.javacode.repository.MortgageLoanRepository;

@Service
public class MortgageLoanService {

    private MortgageLoanRepository mortgageLoanRepository;

    public MortgageLoanService(MortgageLoanRepository mortgageLoanRepository) {
        this.mortgageLoanRepository = mortgageLoanRepository;
    }

    // Method to collect customer information
    public void collectCustomerInformation() {
        // Logic to collect customer information
    }

    // Method to verify documents
    public void verifyDocuments() {
        // Logic to verify documents
    }

    // Method to perform credit check and pre-qualify applicants
    public void performCreditCheck() {
        // Logic to perform credit check and pre-qualify applicants
    }

    // Method to approve loans and assess vehicles
    public void approveLoansAndAssessVehicles() {
        // Logic to approve loans and assess vehicles
    }

    // Method to accept loan offers
    public void acceptLoanOffers() {
        // Logic to accept loan offers
    }

    // Method to disburse loan amounts
    public void disburseLoanAmounts() {
        // Logic to disburse loan amounts
    }

    // Method to find MortgageLoan by customer information
    public MortgageLoan findByCustomerInformation(String customerInformation) {
        return mortgageLoanRepository.findByCustomerInformation(customerInformation);
    }

    // Method to find MortgageLoan by credit check
    public MortgageLoan findByCreditCheck(String creditCheck) {
        return mortgageLoanRepository.findByCreditCheck(creditCheck);
    }

    // Method to find MortgageLoan by approved
    public MortgageLoan findByApproved(String approved) {
        return mortgageLoanRepository.findByApproved(approved);
    }

    // Method to find MortgageLoan by loan offer
    public MortgageLoan findByLoanOffer(String loanOffer) {
        return mortgageLoanRepository.findByLoanOffer(loanOffer);
    }

    // Method to find MortgageLoan by loan amount
    public MortgageLoan findByLoanAmount(String loanAmount) {
        return mortgageLoanRepository.findByLoanAmount(loanAmount);
    }

}