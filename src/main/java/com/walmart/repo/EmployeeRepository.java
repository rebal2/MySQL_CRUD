package com.walmart.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.walmart.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	List<Employee> findAll();
}
