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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bankId;
    private String bankName;
    private String address;
    @OneToMany(cascade=CascadeType.ALL)
    private List<BankBranch> bankBranch;
}
