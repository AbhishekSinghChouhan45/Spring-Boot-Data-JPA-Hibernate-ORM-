package com.nt.service;

import java.util.List;


import com.nt.model.Employe;

public interface IEmployeService {
	public List<Employe> getEmployesBySalary(Float startSalary,Float endSalary)throws Exception;
}
