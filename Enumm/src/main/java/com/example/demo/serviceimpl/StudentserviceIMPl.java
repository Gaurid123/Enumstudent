package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.serviecei.StudentserviceI;
@Service
public class StudentserviceIMPl implements StudentserviceI
{
	@Autowired
	private StudentRepository sr;
	@Override
	public Student postStudentData(Student stu) {
		
		return sr.save(stu);
	}

}
