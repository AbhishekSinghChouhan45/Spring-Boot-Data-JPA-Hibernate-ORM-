package com.nt.service;

import java.sql.Date;
import java.util.List;

import com.nt.model.Employe;

public interface IEmployeService {
		public List<Employe> getAllDoctors()throws Exception;
		public List<Employe> getAllDoctorsByNameAndAddress(String name1,String address)throws Exception;
		public List<Object[]> getAllDoctorsExtra()throws Exception;
		public Object getAllDoctorsExtrabyName(String name)throws Exception;
		public int updateName(String name,Integer id)throws Exception;
		public int insertEmploye(String name,String add,Integer age,Date dob,String gender, Double sal)throws Exception;
		public int UpdateEmploye(Integer id,String name,String add,Integer age,Date dob,Character gen,Double sal);
}
