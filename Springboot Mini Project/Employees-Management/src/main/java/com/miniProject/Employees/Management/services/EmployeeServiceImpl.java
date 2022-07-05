package com.miniProject.Employees.Management.services;

import com.miniProject.Employees.Management.exception.RecordNotFoundException;
import com.miniProject.Employees.Management.models.Employee;
import com.miniProject.Employees.Management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Page<Employee> displayAllEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void deleteEmployee(Long id) throws RecordNotFoundException {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            employeeRepository.delete(employeeOptional.get());
        } else {
           throw new RecordNotFoundException("EMPLOYEE NOT FOUND!");
        }
    }

    @Override
    public Employee viewEmployeeById(Long id) throws RecordNotFoundException {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("EMPLOYEE NOT FOUND!"));
    }

    @Override
    public Employee updateEmployeeById(Employee employee,Long id) throws RecordNotFoundException {
        return employeeRepository.findById(id).map(updatedEmployee -> {
            updatedEmployee.setName(employee.getName());
            updatedEmployee.setLevel(employee.getLevel());
            updatedEmployee.setEmail(employee.getEmail());
            updatedEmployee.setCommunity(employee.getCommunity());
            updatedEmployee.setStatus(employee.getStatus());
            return employeeRepository.save(updatedEmployee);
        }).orElseThrow(() -> new RecordNotFoundException("EMPLOYEE NOT FOUND!"));
    }
}
