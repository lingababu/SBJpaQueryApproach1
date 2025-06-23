package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {

	@Id
	private Integer studentId;

	private String studentName;

	private String courseName;

	private String email;

}
