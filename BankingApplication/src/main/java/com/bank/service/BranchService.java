package com.bank.service;

import java.util.List;

import com.bank.modal.Account;

public interface BranchService<T> {
    public Account getAccount(Integer accountId);
    public List<Account> getAllAccount();
    public Account updateAccount(T account);
    public Account deleteAccount(Integer accountId);
}
