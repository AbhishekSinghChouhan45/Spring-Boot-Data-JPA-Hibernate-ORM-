package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repository.IStudentRepository;
@Service
@Profile("Save")
public class StudentServiceImpl3 implements IStudentService {
	@Autowired
	private IStudentRepository repo;

	@Override
	public Iterable<Student> findAllStudents() throws Exception {
		return null;
	}
	@Override
	public Optional<Student> StudentsByName(Integer ID) throws Exception {
		return null;
	}
	@Override
	public String saveStudents(Student doctor) throws Exception {
		System.out.println("IN Save");
		repo.save(doctor);
		return "Student Saved Successfully Student ID is: "+doctor.getSId();
	}

}
