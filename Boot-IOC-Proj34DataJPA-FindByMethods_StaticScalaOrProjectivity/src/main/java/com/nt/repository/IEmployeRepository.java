package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Employe;
import com.nt.type.IProjectionOperations;

public interface IEmployeRepository extends JpaRepository<Employe, Integer>{
//		public List<IProjectionOperations> getByeSalaryGreaterThanEqualAndeSalaryLessThanEqual(Double maxSalary,Double minSalary)throws Exception;
		public List<IProjectionOperations> getByeSalaryBetween(Double maxSalary,Double minSalary);
//		public List<Employe> getByeSalary(Double maxSalary);
		
		
}
