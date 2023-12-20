package com.nt.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Doctor;
import com.nt.repository.IDoctorRepository;

@Component
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository repo;
	@Override
	public String registerDoctor(List<Doctor> doctor) {
		List<Integer> ids = new ArrayList<Integer>();
		try {
			repo.saveAll(doctor);
			doctor.forEach(d->{
				ids.add(d.getDId());
			});
		}catch (Exception e) {
			System.out.println("Ex "+e.getMessage());
		}
		return doctor.size()+" Doctors are registered successfully and there Id's are: "+ids;
	}

}
