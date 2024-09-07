package com.bank.service;

import java.util.List;

import com.bank.modal.Account;
import com.bank.modal.BankBranch;

public interface BankService {
   public List<BankBranch> getAllBranch();
   public BankBranch getBranchById(Integer branchId);
   public List<Account> getAllAccountByBranch(Integer branchId);
}
