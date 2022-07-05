package com.miniProject.Employees.Management.services;

import com.miniProject.Employees.Management.exception.RecordNotFoundException;
import com.miniProject.Employees.Management.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Page<Employee> displayAllEmployee(Pageable pageable);

    void deleteEmployee(Long id)throws RecordNotFoundException;

    Employee viewEmployeeById(Long id) throws RecordNotFoundException;

    Employee updateEmployeeById(Employee employee,Long id) throws RecordNotFoundException;

}
