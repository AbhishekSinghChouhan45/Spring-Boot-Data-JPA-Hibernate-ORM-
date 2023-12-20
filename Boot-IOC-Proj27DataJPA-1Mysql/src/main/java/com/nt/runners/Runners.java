package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Doctor;
import com.nt.service.IDoctorService;
@Component
public class Runners implements CommandLineRunner {
@Autowired
private IDoctorService ser;
	@Override
	public void run(String... args) throws Exception {
	try {
		
		Doctor d = new Doctor();
		d.setDName("Riya Rathod"); 
		d.setDSpecialization("Nurse");
		d.setDIncome(19800.80);
		String msg = ser.getDoctor(d);
		System.out.println(msg);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}


}
