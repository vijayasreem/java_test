package com.javacode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacode.model.MortgageLoanApplication;
import com.javacode.repository.MortgageLoanApplicationRepository;

@Service
public class MortgageLoanApplicationService {
	
	@Autowired
	MortgageLoanApplicationRepository mortgageLoanApplicationRepository;
	
	//Method to get the loan application based on the user's ID
	public MortgageLoanApplication getByUserId(long userId) {
		return mortgageLoanApplicationRepository.findByUserId(userId);
	}
		
	//Method to check if the credit check is successful
	public boolean isCreditCheckSuccessful(long userId) {
		return mortgageLoanApplicationRepository.isCreditCheckSuccessful(userId);
	}
		
	//Method to get the approved loan amount
	public double getApprovedLoanAmount(long userId) {
		return mortgageLoanApplicationRepository.getApprovedLoanAmount(userId);
	}
		
	//Method to get the interest rate
	public double getInterestRate(long userId) {
		return mortgageLoanApplicationRepository.getInterestRate(userId);
	}
		
	//Method to get the repayment period
	public int getRepaymentPeriod(long userId) {
		return mortgageLoanApplicationRepository.getRepaymentPeriod(userId);
	}
		
	//Method to assess the vehicle's value
	public double assessVehicleValue(long userId) {
		return mortgageLoanApplicationRepository.assessVehicleValue(userId);
	}
		
	//Method to accept the loan offer
	public boolean acceptLoanOffer(long userId) {
		return mortgageLoanApplicationRepository.acceptLoanOffer(userId);
	}
		
	//Method to disburse the approved loan amount
	public boolean disburseApprovedLoanAmount(long userId) {
		return mortgageLoanApplicationRepository.disburseApprovedLoanAmount(userId);
	}
}