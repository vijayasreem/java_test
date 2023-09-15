package com.javacode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.javacode.service.MortgageLoanService;
import com.javacode.repository.MortgageLoanRepository;

@RestController
public class MortgageLoanController {

    @Autowired
    private MortgageLoanService mortgageLoanService;
    private MortgageLoanRepository mortgageLoanRepository;

    // Method to collect customer information
    @RequestMapping("/collectCustomerInformation")
    public void collectCustomerInformation() {
        mortgageLoanService.collectCustomerInformation();
    }

    // Method to verify documents
    @RequestMapping("/verifyDocuments")
    public void verifyDocuments() {
        mortgageLoanService.verifyDocuments();
    }

    // Method to perform credit check and pre-qualify applicants
    @RequestMapping("/performCreditCheck")
    public void performCreditCheck() {
        mortgageLoanService.performCreditCheck();
    }

    // Method to approve loans and assess vehicles
    @RequestMapping("/approveLoansAndAssessVehicles")
    public void approveLoansAndAssessVehicles() {
        mortgageLoanService.approveLoansAndAssessVehicles();
    }

    // Method to accept loan offers
    @RequestMapping("/acceptLoanOffers")
    public void acceptLoanOffers() {
        mortgageLoanService.acceptLoanOffers();
    }

    // Method to disburse loan amounts
    @RequestMapping("/disburseLoanAmounts")
    public void disburseLoanAmounts() {
        mortgageLoanService.disburseLoanAmounts();
    }

    // Method to find MortgageLoan by customer information
    @RequestMapping("/findByCustomerInformation")
    public MortgageLoan findByCustomerInformation(String customerInformation) {
        return mortgageLoanRepository.findByCustomerInformation(customerInformation);
    }

    // Method to find MortgageLoan by credit check
    @RequestMapping("/findByCreditCheck")
    public MortgageLoan findByCreditCheck(String creditCheck) {
        return mortgageLoanRepository.findByCreditCheck(creditCheck);
    }

    // Method to find MortgageLoan by approved
    @RequestMapping("/findByApproved")
    public MortgageLoan findByApproved(String approved) {
        return mortgageLoanRepository.findByApproved(approved);
    }

    // Method to find MortgageLoan by loan offer
    @RequestMapping("/findByLoanOffer")
    public MortgageLoan findByLoanOffer(String loanOffer) {
        return mortgageLoanRepository.findByLoanOffer(loanOffer);
    }

    // Method to find MortgageLoan by loan amount
    @RequestMapping("/findByLoanAmount")
    public MortgageLoan findByLoanAmount(String loanAmount) {
        return mortgageLoanRepository.findByLoanAmount(loanAmount);
    }
}