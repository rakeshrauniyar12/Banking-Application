package com.bank.modal;

import com.bank.enumvalue.TransactionEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer transactionId;
  @OneToOne
  private Integer branchId;
  @OneToOne
  private Integer accountId;
  private TransactionEnum modeOfTransaction;
  private double amount;
  
}
