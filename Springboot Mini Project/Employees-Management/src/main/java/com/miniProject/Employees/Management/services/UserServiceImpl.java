package com.miniProject.Employees.Management.services;

import com.miniProject.Employees.Management.enums.UserRole;
import com.miniProject.Employees.Management.exception.RecordNotFoundException;
import com.miniProject.Employees.Management.models.User;
import com.miniProject.Employees.Management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    //---------------------Finding username in H2 database------------------------------------

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        } else {
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
        }
    }

    //---------------------Role configuration to return on LoadUserByUsername------------------------------------
    private List<SimpleGrantedAuthority> getAuthority(User user) {
        UserRole userRole = Arrays.stream(UserRole.values()).filter(role -> {
            return role.name().equalsIgnoreCase(user.getRole().name());
        }).findFirst().orElse(null);
        return List.of(new SimpleGrantedAuthority(String.format("ROLE_%s", userRole.name())));
    }

    //---------------------Display all user implementation------------------------------------
    @Override
    public Page<User> displayAllUser(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    //---------------------Create user implementation------------------------------------
    @Override
    public User createNewUser(User user) {
        Optional.ofNullable(user.getPassword()).ifPresent(password -> {
            user.setPassword(new BCryptPasswordEncoder().encode(password));
        });
        return userRepository.save(user);

    }

    //---------------------Delete user implementation------------------------------------
    @Override
    public String deleteUser(Long id) throws RecordNotFoundException {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.delete(user.get());
            return id + " is successfully deleted!";
        } else {
            throw new RecordNotFoundException("User not found!");
        }
    }

    //---------------------Update user implementation------------------------------------
    @Override
    public User updateUserInfo(User user, Long id) throws RecordNotFoundException{
       return userRepository.findById(id).map(updatedUserInfo ->{
           updatedUserInfo.setStatus(user.getStatus());
           updatedUserInfo.setRole(user.getRole());
           updatedUserInfo.setLastModifiedDate(LocalDateTime.now()); // try if mag update if wala ung line
           return userRepository.save(updatedUserInfo);
       }).orElseThrow(() -> new RecordNotFoundException("User not found!"));
    }

    //---------------------View User by Id implementation------------------------------------
    @Override
    public User viewUserById(Long id) throws RecordNotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new RecordNotFoundException("User not found!"));
    }
}
