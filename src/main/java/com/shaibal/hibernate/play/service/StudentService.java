package com.shaibal.hibernate.play.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaibal.hibernate.play.model.Student;
import com.shaibal.hibernate.play.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public void save(Student student) {
		studentRepository.save(student);
	}
}
