package com.nt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.model.Employe;
import com.nt.repository.IEmployeRepository;
@Service
public class EmployeServiceImpl implements IEmployeService {
		@Autowired
		private IEmployeRepository repo;

		@Override
		public List<Employe> showDoctorsByName(String name) throws Exception {
			return repo.findByeNameEquals(name);
		}

		@Override
		public List<Employe> showDoctorsByNameIgnoreCase(String name) throws Exception {
			return repo.findByeNameIgnoreCase(name);
		}

		@Override
		public List<Employe> showDoctorsByNameStartingWith(String name) throws Exception {
			return repo.findByeNameStartingWith(name);
		}

		@Override
		public List<Employe> showDoctorsByNameEndingWith(String name) throws Exception {
			return repo.findByeNameEndingWith(name);
		}

		@Override
		public List<Employe> showDoctorsByNameContaining(String name) throws Exception {
			return repo.findByeNameContains(name);
		}

		@Override
		public List<Employe> showDoctorsBySalaryGreaterThan(Double salary) throws Exception {
			return repo.findByeSalaryGreaterThan(salary);
		}

		@Override
		public List<Employe> showDoctorsBySalaryLessThan(Double salary) throws Exception {
			return repo.findByeSalaryLessThan(salary);
		}

		@Override
		public List<Employe> showDoctorsBySalaryBetween(Double maxSalary, Double minSalary) throws Exception {
			return repo.findByeSalaryBetween(maxSalary, minSalary);
		}
		@Override
		public List<Employe> showDoctorsByAge(int age) throws Exception {
			return repo.findByeAge(age);
		}

		@Override
		public List<Employe> showDoctorsByAgeGreaterThan(int age) throws Exception {
			return repo.findByeAgeGreaterThan(age);
		}

		@Override
		public List<Employe> showDoctorsByAgeLessThan(int age) throws Exception {
			return repo.findByeAgeLessThanEqual(age);
		}

		@Override
		public List<Employe> showDoctorsByAgeBetween(int max, int min) throws Exception {
			return repo.findByeAgeBetween(max, min);
		}


		
		
	

}
