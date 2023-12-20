package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repository.IStudentRepository;
@Service
@Profile("findName")
public class StudentServiceImpl2 implements IStudentService {
	@Autowired
	private IStudentRepository repo;

	@Override
	public Iterable<Student> findAllStudents() throws Exception {
		return null;
	}
	@Override
	public Optional<Student> StudentsByName(Integer ID) throws Exception {
		System.out.println("IN FIND BY NAME");
		Optional<Student> list = null;
		list = repo.findById(ID);
		if(list.isEmpty())
			return null;
		return list;
	}
	@Override
	public String saveStudents(Student doctor) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
