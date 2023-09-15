package com.javacode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MortgageLoanApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long userId;
	private boolean creditCheck;
	private double approvedLoanAmount;
	private double interestRate;
	private int repaymentPeriod;
	private double vehicleValue;
	private boolean loanOffer;
	private boolean disbursement;
	
	public MortgageLoanApplication() {
		
	}

	public MortgageLoanApplication(long userId, boolean creditCheck, double approvedLoanAmount, double interestRate,
			int repaymentPeriod, double vehicleValue, boolean loanOffer, boolean disbursement) {
		this.userId = userId;
		this.creditCheck = creditCheck;
		this.approvedLoanAmount = approvedLoanAmount;
		this.interestRate = interestRate;
		this.repaymentPeriod = repaymentPeriod;
		this.vehicleValue = vehicleValue;
		this.loanOffer = loanOffer;
		this.disbursement = disbursement;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public boolean isCreditCheck() {
		return creditCheck;
	}

	public void setCreditCheck(boolean creditCheck) {
		this.creditCheck = creditCheck;
	}

	public double getApprovedLoanAmount() {
		return approvedLoanAmount;
	}

	public void setApprovedLoanAmount(double approvedLoanAmount) {
		this.approvedLoanAmount = approvedLoanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getRepaymentPeriod() {
		return repaymentPeriod;
	}

	public void setRepaymentPeriod(int repaymentPeriod) {
		this.repaymentPeriod = repaymentPeriod;
	}

	public double getVehicleValue() {
		return vehicleValue;
	}

	public void setVehicleValue(double vehicleValue) {
		this.vehicleValue = vehicleValue;
	}

	public boolean isLoanOffer() {
		return loanOffer;
	}

	public void setLoanOffer(boolean loanOffer) {
		this.loanOffer = loanOffer;
	}

	public boolean isDisbursement() {
		return disbursement;
	}

	public void setDisbursement(boolean disbursement) {
		this.disbursement = disbursement;
	}
	
	
	
}