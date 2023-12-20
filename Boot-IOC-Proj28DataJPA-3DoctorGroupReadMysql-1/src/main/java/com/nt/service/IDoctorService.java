package com.nt.service;


import com.nt.model.Doctor;

public interface IDoctorService {
	public Iterable<Doctor> getDoctors()throws Exception;
}
