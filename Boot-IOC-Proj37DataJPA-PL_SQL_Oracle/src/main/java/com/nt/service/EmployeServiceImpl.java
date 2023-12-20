package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employe;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class EmployeServiceImpl implements IEmployeService{
	@Autowired
	private EntityManager manager;
	@Override
	public List<Employe> getEmployesBySalary(Float startSalary, Float endSalary) throws Exception{
		System.out.println("EmployeServiceImpl.getEmployesBySalary()");
			StoredProcedureQuery query = manager.createStoredProcedureQuery("P_EMPLOYE_INCOME",Employe.class);
			System.out.println("EmployeServiceImpl.getEmployesBySalary() 1");
			query.registerStoredProcedureParameter(1, Float.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(2, Float.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
			System.out.println("EmployeServiceImpl.getEmployesBySalary() 2");
			query.setParameter(1, startSalary);
			query.setParameter(2, endSalary);
			System.out.println("EmployeServiceImpl.getEmployesBySalary() 3");
			List<Employe> emp = query.getResultList();
			System.out.println(emp.isEmpty()+" "+emp);
			System.out.println("EmployeServiceImpl.getEmployesBySalary() 4");
			return emp;
	}

}
