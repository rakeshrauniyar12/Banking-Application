package com.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.modal.Account;
import com.bank.modal.BankBranch;
import com.bank.repository.BankBranchRepository;

public class AccountHolderServiceImpl implements AccountHolderService{
	
	
	@Autowired
	private BankBranchRepository bankBranchRepo;

	@Override
	public Account checkProfile(Integer accountId, Integer branchId) {
		 Account acc= null;
		  Optional<BankBranch> bankBranch = bankBranchRepo.findById(branchId);
		  if(bankBranch.isPresent()) {
			 Account account= bankBranch.get().getAccounts().get(accountId);
			 acc=account;
		  }
		return acc;
	}

	@Override
	public double checkBalance(Integer accountId, Integer branchId) {
		 double bal= 0.00;
		  Optional<BankBranch> bankBranch = bankBranchRepo.findById(branchId);
		  if(bankBranch.isPresent()) {
			 Account account= bankBranch.get().getAccounts().get(accountId);
			 bal=account.getViewBalance();
		  }
		return bal;
	}

	@Override
	public String withdrawBalance(Integer accountId, Integer amount, Integer branchId) {
		 String bal= "Insufficient balance";
		  Optional<BankBranch> bankBranch = bankBranchRepo.findById(branchId);
		  if(bankBranch.isPresent()) {
			 Account account= bankBranch.get().getAccounts().get(accountId);
			   if(account.getViewBalance()>=amount) {
				   double updatedBal= account.getViewBalance()-amount; 
				   bankBranchRepo.save(bankBranch.get());
				   bal="You have withdraw "+"Rs:- "+ amount + "Successfully";
			   };
		  }
		return bal;
	}

	@Override
	public String depositBalance(Integer accountId, Integer amount, Integer branchId) {
		 String bal= "something went wrong";
		  Optional<BankBranch> bankBranch = bankBranchRepo.findById(branchId);
		  if(bankBranch.isPresent()) {
			 Account account= bankBranch.get().getAccounts().get(accountId);
			   if(account.getViewBalance()>=amount) {
				   double updatedBal= account.getViewBalance()+amount; 
				   bankBranchRepo.save(bankBranch.get());
				   bal="You have deposit "+"Rs:- "+ amount + "Successfully";
			   };
		  }
		return bal;
	}

}
