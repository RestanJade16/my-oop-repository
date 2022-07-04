package com.miniProject.Employees.Management.services;

import com.miniProject.Employees.Management.models.Employee;
import com.miniProject.Employees.Management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public List<Employee> displayAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            employeeRepository.delete(employeeOptional.get());
        }
    }

    @Override
    public Employee viewEmployeeById(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            return employeeOptional.get();
        }
        return null;
    }

    @Override
    public Employee updateEmployeeById(Employee employee,Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            employeeOptional.get().setName(employee.getName());
            employeeOptional.get().setLevel(employee.getLevel());
            employeeOptional.get().setEmail(employee.getEmail());
            employeeOptional.get().setCommunity(employee.getCommunity());
            employeeOptional.get().setStatus(employee.getStatus());
            return employeeRepository.save(employeeOptional.get());
        }
        return null;
    }
}
