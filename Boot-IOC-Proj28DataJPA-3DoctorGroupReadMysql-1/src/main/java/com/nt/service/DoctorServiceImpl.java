package com.nt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Doctor;
import com.nt.repository.IDoctorRepository;
@Component
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository repo;
	@Override
	public Iterable<Doctor> getDoctors() throws Exception {
		System.out.println("DoctorServiceImpl ");
			Iterable<Doctor> list = new ArrayList<Doctor>();
			list= repo.findAll();
			return list;
	}

}
