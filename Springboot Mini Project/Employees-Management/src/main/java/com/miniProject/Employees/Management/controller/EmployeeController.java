package com.miniProject.Employees.Management.controller;

import com.miniProject.Employees.Management.exception.RecordNotFoundException;
import com.miniProject.Employees.Management.models.Employee;
import com.miniProject.Employees.Management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<Page<Employee>> displayAllEmployee(Pageable pageable){
        return new ResponseEntity<>(employeeService.displayAllEmployee(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.createEmployee(employee),HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) throws RecordNotFoundException{
                employeeService.deleteEmployee(id);
                return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> viewEmployeeById(@PathVariable Long id) throws RecordNotFoundException {
        return new ResponseEntity<>( employeeService.viewEmployeeById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) throws RecordNotFoundException {
        return new ResponseEntity<>(employeeService.updateEmployeeById(employee, id),HttpStatus.OK);
    }


}
