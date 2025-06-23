package com.student.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.entity.Student;
import com.student.repo.StudentRepo;
import com.student.serviceinterface.StudentServiceInterface;

@Service
public class StudentImpl implements StudentServiceInterface {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getStudentsByName(String name) {

		List<Student> studentsList = studentRepo.readByStudentName(name);

		return studentsList;
	}

	@Override
	public List<Student> getStudentsBasedOnCourseAndEmail(String courseName, String email) {

		List<Student> byCourseNameAndEmail = studentRepo.readByCourseNameOrEmail(courseName, email);

		return byCourseNameAndEmail;
	}

	@Override
	public List<Student> getStudentsBasedOnStartingChar(String part) {

		List<Student> byStudentNameLike = studentRepo.readByStudentNameStartingWith(part);

		return byStudentNameLike;
	}

	@Override
	public List<Student> getStudentsBasedOnCourseName(String name) {

		List<Student> byCourseName = studentRepo.readByCourseName(name);

		return byCourseName;
	}

}
