package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Doctor;
import com.nt.repository.ICrudRepository;

@Service("docService")
public class DoctorServiceImpl implements IDoctorService{
	@Autowired
	private ICrudRepository repo;

	@Override
	public String getDoctor(Doctor doctor) {
			Doctor docID = repo.save(doctor);
			return "Doctor Registered Successfully Doctor id is: "+docID.getDId();
	}
	
}
