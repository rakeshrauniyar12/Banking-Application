package com.bank.service;

import com.bank.modal.Account;

public interface AccountHolderService {
	public Account checkProfile(Integer accountId);
   public double checkBalance(Integer accountId);
   public String withdrawBalance(Integer accountId,Integer amount);
   public String depositBalance(Integer accountId,Integer amount);
}
