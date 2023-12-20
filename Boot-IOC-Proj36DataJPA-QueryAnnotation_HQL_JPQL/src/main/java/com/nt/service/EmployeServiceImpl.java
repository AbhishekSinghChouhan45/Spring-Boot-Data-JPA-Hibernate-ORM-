package com.nt.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employe;
import com.nt.repository.IEmployeRepository;
@Service
public class EmployeServiceImpl implements IEmployeService{
	@Autowired
	private IEmployeRepository repo;
	@Override
	public List<Employe> getAllDoctors() throws Exception {
		return repo.getAllEmployes();
	}
	@Override
	public List<Employe> getAllDoctorsByNameAndAddress(String name1,String address) throws Exception {
		return repo.getAllEmployesByNameAndAddress(name1,address);
	}
	@Override
	public List<Object[]> getAllDoctorsExtra() throws Exception {
		return repo.getAllEmployesExtra();
	}
	@Override
	public Object getAllDoctorsExtrabyName(String name) throws Exception {
		return repo.getAllEmployesExtrabyName(name);
	}
	@Override
	public int updateName(String name, Integer id) throws Exception {
		return repo.updateName(name, id);
	}
	@Override
	public int insertEmploye(String name, String add, Integer age, Date dob, String gender, Double sal)
			throws Exception {
		return repo.insertEmploye(name, add, age, dob, gender, sal);
	}
	@Override
	public int UpdateEmploye(Integer id,String name, String add, Integer age, Date dob, Character gen, Double sal) {
		return repo.UpdateEmploye(id,name, add, age, dob, gen, sal);
	}
	
		
}
