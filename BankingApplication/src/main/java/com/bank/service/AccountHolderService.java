package com.bank.service;

import com.bank.modal.Account;

public interface AccountHolderService {
   public Account checkProfile(Integer accountId,Integer branchId);
   public double checkBalance(Integer accountId,Integer branchId);
   public String withdrawBalance(Integer accountId,Integer amount,Integer branchId);
   public String depositBalance(Integer accountId,Integer amount,Integer branchId);
}
