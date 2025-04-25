package com.RAGA.employeePayroll.repositories;

import com.RAGA.employeePayroll.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeCurdRepositories extends CrudRepository<Employee, Integer> {
}
