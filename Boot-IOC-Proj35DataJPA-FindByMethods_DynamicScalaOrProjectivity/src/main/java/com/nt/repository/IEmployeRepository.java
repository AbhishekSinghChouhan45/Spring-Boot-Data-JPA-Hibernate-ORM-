package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Employe;
import com.nt.type.IProjectionOperations;

public interface IEmployeRepository extends JpaRepository<Employe, Integer>{
//		public List<IProjectionOperations> getByeSalaryGreaterThanEqualAndeSalaryLessThanEqual(Double maxSalary,Double minSalary)throws Exception;
		public <T extends IProjectionOperations> List<T> getByeSalaryBetween(Double maxSalary,Double minSalary,Class<T> clazz);
		public <T extends IProjectionOperations> List<T> getByeName(String name,Class<T> clazz);
		
		
}
