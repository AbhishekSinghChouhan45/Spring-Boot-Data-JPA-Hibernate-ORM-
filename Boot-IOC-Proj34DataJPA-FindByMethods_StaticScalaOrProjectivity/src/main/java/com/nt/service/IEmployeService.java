package com.nt.service;

import java.util.List;

import com.nt.model.Employe;
import com.nt.type.IProjectionOperations;

public interface IEmployeService {
		public List<IProjectionOperations> showDoctorsBySalaryFilter(Double maxSalary,Double minSalary)throws Exception;
//		public List<Employe> showDoctorsBySalaryFilter(Double maxSalary,Double minSalary)throws Exception;
		
}
