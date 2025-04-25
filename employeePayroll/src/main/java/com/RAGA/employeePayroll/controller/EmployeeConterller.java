package com.RAGA.employeePayroll.controller;

import com.RAGA.employeePayroll.entity.Employee;
import com.RAGA.employeePayroll.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee")
public class EmployeeConterller {
    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeServices.getAllEmployee();
    }

    @PostMapping
    public String postEmployee(@RequestBody Employee employee){
        return employeeServices.postEmployee(employee);
    }

    @GetMapping("/get/{id}")
    public Employee getByID(@PathVariable int id){
        return employeeServices.getByID(id);
    }

    @PutMapping("/update/{id}")
    public String updateByID(@PathVariable int id, @RequestBody Employee employee){
        return employeeServices.updateByID(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteByID(@PathVariable int id){
        return employeeServices.deleteByID(id);
    }
}
