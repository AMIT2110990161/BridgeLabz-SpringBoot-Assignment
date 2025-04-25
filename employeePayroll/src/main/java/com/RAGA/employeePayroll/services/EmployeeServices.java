package com.RAGA.employeePayroll.services;

import com.RAGA.employeePayroll.entity.Employee;
import com.RAGA.employeePayroll.repositories.EmployeeCurdRepositories;
import com.RAGA.employeePayroll.repositories.EmployeeJpaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeCurdRepositories employeeCurdRepositories;

    @Autowired
    private EmployeeJpaRepositories employeeJpaRepositories;

    public List<Employee> getAllEmployee(){
        return (List<Employee>) employeeCurdRepositories.findAll();
    }

    public String postEmployee(Employee employee){
        employeeCurdRepositories.save(employee);
        return "OK!";
    }

    public Employee getByID(int id){
        return employeeJpaRepositories.findById(id).get();
    }

    public String updateByID(int id, Employee employee){
        employee.setId(id);
        employeeJpaRepositories.save(employee);
        return "OK! Updated";
    }

    public String deleteByID(int id){
        employeeJpaRepositories.deleteById(id);
        return "OK! Deleted";
    }

}
