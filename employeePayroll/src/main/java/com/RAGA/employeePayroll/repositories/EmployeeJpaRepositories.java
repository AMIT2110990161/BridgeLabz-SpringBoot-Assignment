package com.RAGA.employeePayroll.repositories;

import com.RAGA.employeePayroll.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepositories extends JpaRepository<Employee, Integer> {
}
