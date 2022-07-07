package com.miniProject.Employees.Management.models;

import com.miniProject.Employees.Management.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user_object")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String status;

    @Column
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
