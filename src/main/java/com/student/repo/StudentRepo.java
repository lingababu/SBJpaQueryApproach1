package com.student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	//Select * from Student where studentName =?
	List<Student> readByStudentName(String name);
	
	//select * from student where name=? and email=?
	List<Student> readByCourseNameOrEmail(String name, String email);
	
	//select * from student where name like 's%'
	List<Student> readByStudentNameStartingWith(String part);
	
	List<Student> readByCourseName(String name);

}
