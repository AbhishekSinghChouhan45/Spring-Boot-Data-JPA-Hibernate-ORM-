package com.nt.service;


import java.util.Optional;

import com.nt.model.Student;

public interface IStudentService {
	public Iterable<Student> findAllStudents()throws Exception;
	public Optional<Student> StudentsByName(Integer ID)throws Exception;
	public String saveStudents(Student doctor)throws Exception;
	
	
}
