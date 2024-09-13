package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
