package com.nt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employe;
import com.nt.repository.IEmployeRepository;
import com.nt.type.IProjectionOperations;
@Service
public class EmployeServiceImpl implements IEmployeService {
		@Autowired
		private IEmployeRepository repo;

		@Override
		public <T extends IProjectionOperations> List<T> showDoctorsBySalaryFilter(Double maxSalary, Double minSalary,Class<T> clazz)throws Exception {
			return repo.getByeSalaryBetween(maxSalary, minSalary,clazz);
			
		}

		@Override
		public <T extends IProjectionOperations> List<T> showDoctorsByNamer(String name,Class<T> clazz) throws Exception {
			return repo.getByeName(name,clazz);
		}

		

}
