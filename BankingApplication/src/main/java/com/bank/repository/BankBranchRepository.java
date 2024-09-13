package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.modal.BankBranch;

public interface BankBranchRepository extends JpaRepository<BankBranch, Integer>{

}
