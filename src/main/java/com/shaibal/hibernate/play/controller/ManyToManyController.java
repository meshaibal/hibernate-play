package com.shaibal.hibernate.play.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shaibal.hibernate.play.model.Student;
import com.shaibal.hibernate.play.model.Subject;
import com.shaibal.hibernate.play.service.StudentService;

@RestController
@RequestMapping("/")
public class ManyToManyController {

	@Autowired
	private StudentService studentService;
	
	@PutMapping()
	public void saveStudent() {
		Student student = new Student();
		
		Subject sub1 = new Subject();
		sub1.setName("sub1");
		
		Subject sub2 = new Subject();
		sub2.setName("sub2");
		
		student.getSubjects().add(sub1);
		student.getSubjects().add(sub2);
		
		studentService.save(student);
	}
}
