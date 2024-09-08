package com.bank.service;

import java.util.List;

import com.bank.modal.Account;

public interface BranchService{
	public Account createAccount(Account account);
    public Account getAccount(Integer accountId);
    public List<Account> getAllAccount();
    public Account updateAccount(Account account);
    public Account deleteAccount(Integer accountId);
    public double viewBalanceByAccountId(Integer accountId);
    public String withdrawBalanceOfAccountHolder(Integer accountId);
    public String depositBalanceOfAccountHolder(Integer accountId);
}
