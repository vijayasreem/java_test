package com.javacode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacode.model.MortgageLoanApplication;
import com.javacode.service.MortgageLoanApplicationService;

@RestController
@RequestMapping("/MortgageLoanApplication")
public class MortgageLoanApplicationController {

	@Autowired
	MortgageLoanApplicationService mortgageLoanApplicationService;
	
	@GetMapping("/{id}")
	public MortgageLoanApplication getByUserId(@PathVariable long id) {
		return mortgageLoanApplicationService.getByUserId(id);
	}
	
	@PostMapping("/creditcheck/{id}")
	public boolean isCreditCheckSuccessful(@PathVariable long id) {
		return mortgageLoanApplicationService.isCreditCheckSuccessful(id);
	}
	
	@PostMapping("/approvedloanamount/{id}")
	public double getApprovedLoanAmount(@PathVariable long id) {
		return mortgageLoanApplicationService.getApprovedLoanAmount(id);
	}
	
	@PostMapping("/interestrate/{id}")
	public double getInterestRate(@PathVariable long id) {
		return mortgageLoanApplicationService.getInterestRate(id);
	}
	
	@PostMapping("/repaymentperiod/{id}")
	public int getRepaymentPeriod(@PathVariable long id) {
		return mortgageLoanApplicationService.getRepaymentPeriod(id);
	}
	
	@PostMapping("/vehiclevalue/{id}")
	public double assessVehicleValue(@PathVariable long id) {
		return mortgageLoanApplicationService.assessVehicleValue(id);
	}
	
	@PostMapping("/loanoffer/{id}")
	public boolean acceptLoanOffer(@PathVariable long id) {
		return mortgageLoanApplicationService.acceptLoanOffer(id);
	}
	
	@PostMapping("/disbursement/{id}")
	public boolean disburseApprovedLoanAmount(@PathVariable long id) {
		return mortgageLoanApplicationService.disburseApprovedLoanAmount(id);
	}
}