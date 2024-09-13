package com.bank.modal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankBranch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bankBranchId;
    private String branchName;
    private String branchAddress;
    @OneToOne
	private Integer bankId;
    @OneToMany
    private List<Employee> employees;
    private double totalAmount;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Account> accounts; 
}
