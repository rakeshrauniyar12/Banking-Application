package com.bank.modal;

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
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)	
   private Integer employeeId;
   @OneToOne
   private Integer branchId;
   private String employeeName;
   private String address;
   
}
