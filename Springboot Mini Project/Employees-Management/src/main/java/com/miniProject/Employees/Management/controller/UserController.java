package com.miniProject.Employees.Management.controller;

import com.miniProject.Employees.Management.exception.RecordNotFoundException;
import com.miniProject.Employees.Management.models.User;
import com.miniProject.Employees.Management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<Page<User>> displayAllUser(Pageable pageable){
        return new ResponseEntity<>(userService.displayAllUser(pageable), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.createNewUser(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) throws RecordNotFoundException {
        return new ResponseEntity<>(userService.deleteUser(id),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> viewUserById(@PathVariable Long id) throws RecordNotFoundException {
        return new ResponseEntity<>(userService.viewUserById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id, @RequestBody User user) throws RecordNotFoundException {
        return new ResponseEntity<>(userService.updateUserInfo(user, id), HttpStatus.OK);
    }

}
