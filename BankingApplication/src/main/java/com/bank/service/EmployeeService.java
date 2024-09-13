package com.bank.service;

import java.util.List;

import com.bank.modal.Account;
import com.bank.modal.Employee;

public interface EmployeeService {
   public Employee login(Integer employeeId,String password);	
   public Account createAccount(Account account);
   public Account updateAccount(Account account);
   public Account deleteAccount(Integer branchId,Integer accountId);
   public Account getAccount(Integer branchId,Integer accountId);
   public List<Account> getAllAccount();
   public double deposit(Integer branchId,Integer accountId,Integer amount);
   public double withdraw(Integer branchId,Integer accountId,Integer amount); 
}
