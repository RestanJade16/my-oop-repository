package com.miniProject.Employees.Management.services;

import com.miniProject.Employees.Management.exception.RecordNotFoundException;
import com.miniProject.Employees.Management.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page <User> displayAllUser(Pageable pageable);

    User createNewUser(User user);

    String deleteUser(Long id) throws RecordNotFoundException;

    User updateUserInfo(User user, Long id)throws RecordNotFoundException;

    User viewUserById(Long id) throws RecordNotFoundException;
}
