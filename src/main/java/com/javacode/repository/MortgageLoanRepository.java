package com.javacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MortgageLoanRepository extends JpaRepository<MortgageLoan, Long> {

    @Query("SELECT * FROM MortgageLoan WHERE customerInformation = ?1")
    MortgageLoan findByCustomerInformation(String customerInformation);

    @Query("SELECT * FROM MortgageLoan WHERE creditCheck = ?1")
    MortgageLoan findByCreditCheck(String creditCheck);

    @Query("SELECT * FROM MortgageLoan WHERE approved = ?1")
    MortgageLoan findByApproved(String approved);

    @Query("SELECT * FROM MortgageLoan WHERE loanOffer = ?1")
    MortgageLoan findByLoanOffer(String loanOffer);

    @Query("SELECT * FROM MortgageLoan WHERE loanAmount = ?1")
    MortgageLoan findByLoanAmount(String loanAmount);

}