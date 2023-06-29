package com.example.day84h2demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByDept(String dept);

}