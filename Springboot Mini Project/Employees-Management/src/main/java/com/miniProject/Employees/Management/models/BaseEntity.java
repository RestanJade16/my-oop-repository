package com.miniProject.Employees.Management.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity {

	//Force class that will extend to add additional column for auditing.
	@CreatedDate
	@Column(name = "created_date", nullable = false, updatable = false, columnDefinition = "TIMESTAMP(0) default CURRENT_TIMESTAMP")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private LocalDateTime createdDate = LocalDateTime.now();

	@LastModifiedDate
	@Column(name = "last_modified_date", nullable = false, columnDefinition = "TIMESTAMP(0) default CURRENT_TIMESTAMP")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private LocalDateTime lastModifiedDate = LocalDateTime.now();


}