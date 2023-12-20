package com.nt.service;

import com.nt.model.Doctor;

public interface IDoctorService {
		public String getDoctor(Doctor doctor);
		public Doctor saveDoctors(Doctor doctor)throws Exception;
		
}
