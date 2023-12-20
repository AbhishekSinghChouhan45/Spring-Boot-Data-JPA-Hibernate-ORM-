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
//
//		@Override
//		public List<Employe> showDoctorsBySalaryFilter(Double maxSalary, Double minSalary) throws Exception {
//			return repo.getByeSalary(maxSalary);
//		}

		@Override
		public List<IProjectionOperations> showDoctorsBySalaryFilter(Double maxSalary, Double minSalary)throws Exception {
			return repo.getByeSalaryBetween(maxSalary, minSalary);
			
		}

		

}
