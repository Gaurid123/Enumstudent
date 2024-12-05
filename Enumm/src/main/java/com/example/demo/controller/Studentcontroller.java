package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviecei.StudentserviceI;

@RestController
public class Studentcontroller
{
	@Autowired
	StudentserviceI si;
	
	public ResponseEntity<Student> postData(@RequestBody Student stu)
	{
	 Student data=si.postStudentData(stu);
	 return new ResponseEntity<Student>(data,HttpStatus.CREATED);
	}

}
