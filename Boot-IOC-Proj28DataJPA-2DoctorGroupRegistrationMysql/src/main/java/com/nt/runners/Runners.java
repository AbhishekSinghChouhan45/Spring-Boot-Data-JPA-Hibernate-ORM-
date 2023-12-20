package com.nt.runners;

import java.util.ArrayList;
import java.util.List;

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
		List<Doctor> doc = new ArrayList<Doctor>();
		Doctor d1 = new Doctor();
		d1.setDName("Vijay varma"); d1.setDSpecialization("Psycology"); d1.setDIncome(70000.80);
		doc.add(d1); 
//		Doctor d2 = new Doctor();
//		d2.setDName("Vishal varma"); d2.setDSpecialization("Surgen"); d2.setDIncome(73000.80);
//		doc.add(d2); 
//		Doctor d3 = new Doctor();
//		d3.setDName("Jayvardhan shah"); d3.setDSpecialization("Therpist"); d3.setDIncome(64000.80);
//		doc.add(d3); 
		String msg = ser.registerDoctor(doc);	
		System.out.println(msg);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
