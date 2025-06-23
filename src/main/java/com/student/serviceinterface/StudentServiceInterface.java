package com.student.serviceinterface;

import java.util.List;

import com.student.entity.Student;

public interface StudentServiceInterface {
	
	List<Student> getStudentsByName(String name);
	
	List<Student> getStudentsBasedOnCourseAndEmail(String courseName, String email);
	
	List<Student> getStudentsBasedOnStartingChar(String part);
	
	List<Student> getStudentsBasedOnCourseName(String name);

}
