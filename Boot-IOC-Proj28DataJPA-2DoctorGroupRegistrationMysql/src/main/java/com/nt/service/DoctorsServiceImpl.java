package com.nt.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Doctor;
import com.nt.repository.IDoctorsRepository;
@Component
public class DoctorsServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorsRepository repo;
	@Override
	public String registerDoctor(List<Doctor> doctor) throws Exception {
		Map<Integer,String> ids = new HashMap<Integer,String>();
		repo.saveAll(doctor);
		doctor.forEach(d->{
			ids.put(d.getDId(),d.getDName());
		});
		return doctor.size()+" Doctors registerd successfully and there ids are: "+ids;
	}

}
