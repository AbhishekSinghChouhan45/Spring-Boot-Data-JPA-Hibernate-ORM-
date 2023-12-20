package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Employe;

public interface IEmployeRepository extends JpaRepository<Employe, Integer>{
		public List<Employe> findByeName(String name);
		public List<Employe> findByeNameIs(String name);	
		public List<Employe> findByeNameEquals(String name);	//here this 3 methods are using = operator eName = (no condition after property name is = default condition)
		public List<Employe> findByeNameIgnoreCase(String name);
		public List<Employe> findByeNameStartingWith(String name);
		public List<Employe> findByeNameEndingWith(String name);
		public List<Employe> findByeNameContains(String name);
		//We can give more property names and more conditions like age,address,salary,id etc
		public List<Employe> findByeSalaryGreaterThan(Double salary);
		public List<Employe> findByeSalaryLessThan(Double salary);
		public List<Employe> findByeSalaryBetween(Double maxSalary,Double minSalary);
		public List<Employe> findByeAge(int Max);
		public List<Employe> findByeAgeGreaterThan(int Max);
		public List<Employe> findByeAgeLessThanEqual(int Max);
		public List<Employe> findByeAgeBetween(int Max,int min);
		
		
		
}
