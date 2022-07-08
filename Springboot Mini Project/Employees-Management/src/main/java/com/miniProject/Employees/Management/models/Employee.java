package com.miniProject.Employees.Management.models;

import com.miniProject.Employees.Management.enums.EmployeeStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "employee_object")
@EntityListeners(AuditingEntityListener.class)
public class Employee extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private String level;

    @Column
    private String email;

    @Column
    private String community;

    @Column
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

}

