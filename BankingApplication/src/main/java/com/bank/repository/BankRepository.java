package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.modal.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{

}
