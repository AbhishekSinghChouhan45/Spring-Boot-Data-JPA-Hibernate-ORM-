package com.nt.service;

import java.util.List;

import com.nt.model.Employe;

public interface IEmployeService {
		public List<Employe> showDoctorsByName(String name)throws Exception;
		public List<Employe> showDoctorsByNameIgnoreCase(String name)throws Exception;
		public List<Employe> showDoctorsByNameStartingWith(String name)throws Exception;
		public List<Employe> showDoctorsByNameEndingWith(String name)throws Exception;
		public List<Employe> showDoctorsByNameContaining(String name)throws Exception;
		public List<Employe> showDoctorsBySalaryGreaterThan(Double salary)throws Exception;
		public List<Employe> showDoctorsBySalaryLessThan(Double salary)throws Exception;
		public List<Employe> showDoctorsBySalaryBetween(Double maxSalary,Double minSalary)throws Exception;
		public List<Employe> showDoctorsByAge(int age)throws Exception;
		public List<Employe> showDoctorsByAgeGreaterThan(int age)throws Exception;
		public List<Employe> showDoctorsByAgeLessThan(int age)throws Exception;
		public List<Employe> showDoctorsByAgeBetween(int max,int min)throws Exception;
		
}
