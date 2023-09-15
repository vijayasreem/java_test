package com.javacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacode.model.MortgageLoanApplication;

@Repository
public interface MortgageLoanApplicationRepository extends JpaRepository<MortgageLoanApplication, Long>{
	
	//Method to get the loan application based on the user's ID
	MortgageLoanApplication findByUserId(long userId);
		
	//Method to check if the credit check is successful
	boolean isCreditCheckSuccessful(long userId);
		
	//Method to get the approved loan amount
	double getApprovedLoanAmount(long userId);
		
	//Method to get the interest rate
	double getInterestRate(long userId);
		
	//Method to get the repayment period
	int getRepaymentPeriod(long userId);
		
	//Method to assess the vehicle's value
	double assessVehicleValue(long userId);
		
	//Method to accept the loan offer
	boolean acceptLoanOffer(long userId);
		
	//Method to disburse the approved loan amount
	boolean disburseApprovedLoanAmount(long userId);
	
}