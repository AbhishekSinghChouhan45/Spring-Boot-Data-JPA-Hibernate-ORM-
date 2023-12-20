package com.nt.runners;

import java.util.ArrayList;

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
			Iterable<Doctor> list = new ArrayList<Doctor>();
			list = ser.getDoctors();
			list.forEach(d->{
				System.out.println(d);
			});
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
