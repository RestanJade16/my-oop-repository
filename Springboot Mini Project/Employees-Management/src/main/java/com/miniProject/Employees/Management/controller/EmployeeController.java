package com.miniProject.Employees.Management.controller;

import com.miniProject.Employees.Management.models.Employee;
import com.miniProject.Employees.Management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> displayAllEmployee(){
        return employeeService.displayAllEmployee();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);

    }

    @GetMapping("{id}")
    public Employee viewEmployeeById(@PathVariable Long id){
        return employeeService.viewEmployeeById(id);

    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return  employeeService.updateEmployeeById(employee, id);
    }


}
