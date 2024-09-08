package com.bank.modal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Integer accountId;
   private String accountHolderName;
   private String IFSCCode;
   private String address;
   private double viewBalance;
   @OneToMany(cascade = CascadeType.ALL)
   private List<Transaction> transactions;
}
