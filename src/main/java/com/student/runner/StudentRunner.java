package com.student.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.student.entity.Student;
import com.student.repo.StudentRepo;
import com.student.serviceimpl.StudentImpl;

@Component
public class StudentRunner implements ApplicationRunner {
	
	@Autowired
	private StudentImpl studentImpl;
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
//		List<Student> studentsList = new ArrayList<>();
//		
//		studentsList.add(new Student(1,"lb", "java", "lb@gmail.com"));
//		studentsList.add(new Student(2,"vijay", "spring boot", "vijay@gmail.com"));
//		studentsList.add(new Student(3,"chand", "python", "chand@gmail.com"));
//		studentsList.add(new Student(4,"sumiya", ".net", "sumiya@gmail.com"));
//		studentsList.add(new Student(5,"anil", "node js", "anil@gmail.com"));
//		studentsList.add(new Student(6,"bikari", "angular", "bikari@gmail.com"));
//		
//		studentRepo.saveAll(studentsList);
//		
//		System.out.println("-".repeat(30));
		
//		List<Student> studentsByName = studentImpl.getStudentsByName("lb");
//		
//		studentsByName.forEach(System.out :: println);
//		
//		List<Student> studentsBasedOnCourseAndEmail = studentImpl.getStudentsBasedOnCourseAndEmail(".net", "lb@gmail.com");
//		
//		studentsBasedOnCourseAndEmail.forEach(System.out :: println);
		
//		List<Student> studentsBasedOnStartingChar = studentImpl.getStudentsBasedOnStartingChar("S");
//		
//		studentsBasedOnStartingChar.forEach(System.out :: println);
		
		List<Student> studentsBasedOnCourseName = studentImpl.getStudentsBasedOnCourseName("java");
		
		studentsBasedOnCourseName.forEach(System.out :: println);

	}

}
