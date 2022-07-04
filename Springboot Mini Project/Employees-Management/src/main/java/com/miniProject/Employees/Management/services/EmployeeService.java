package com.miniProject.Employees.Management.services;

import com.miniProject.Employees.Management.models.Employee;

import java.util.List;


public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> displayAllEmployee();

    void deleteEmployee(Long id);

    Employee viewEmployeeById(Long id);

    Employee updateEmployeeById(Employee employee,Long id);

}
