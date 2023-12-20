package com.nt.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repository.IStudentRepository;
@Service
@Profile("findAll")
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentRepository repo;

	@Override
	public Iterable<Student> findAllStudents() throws Exception {
		System.out.println("IN FIND BY ALL");
			Iterable<Student> list = new ArrayList<Student>();
			list = repo.findAll();
		return list;
	}
	@Override
	public Optional<Student> StudentsByName(Integer ID) throws Exception {
		return null;
	}
	@Override
	public String saveStudents(Student doctor) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
