package com.nt.service;

import java.util.List;

import com.nt.model.Employe;
import com.nt.type.IProjectionOperations;

public interface IEmployeService {
		public <T extends IProjectionOperations> List<T> showDoctorsBySalaryFilter(Double maxSalary,Double minSalary,Class<T> clazz)throws Exception;
		public <T extends IProjectionOperations> List<T> showDoctorsByNamer(String name,Class<T> clazz)throws Exception;
		
}
