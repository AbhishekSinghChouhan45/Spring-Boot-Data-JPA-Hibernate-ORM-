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
	public String deleteAllbyBatchID(List<Integer> ids) throws Exception {
				Long count = repo.count();
				repo.deleteAllByIdInBatch(ids);
				count = count - repo.count();
		return count+" ids Deleted Successfully and there ids are: ";
	}
	@Override
	public List<Employe> findAll(Employe emp, Boolean des, String... properties) throws Exception {
		Sort sort = Sort.by(des?Direction.ASC:Direction.DESC,properties);
		Example<Employe> ex = Example.of(emp);
		return repo.findAll(ex, sort);
	}
	@Override
	public List<Employe> findAll(Employe emp) throws Exception {
		Example<Employe> ex = Example.of(emp);
		return repo.findAll(ex);
	}
	@Override
	public String getByID(Integer id) throws Exception {
		Employe e = repo.getById(id);
		if(e!=null)
			return e.toString();
		else 
			return "Employe Not Found of id: "+id;
	}
	@Override
	public String getOne(Integer id) throws Exception {
		return repo.getOne(id) != null?repo.getOne(id).toString():" Employe Not Found of id: "+id;
	}
	@Override
	public String getRefByID(Integer id) throws Exception {
		Employe e = null;	
		try {
				e = repo.getReferenceById(id);
			}catch (Exception ee) {
				System.out.println("Get "+ee.getMessage());
			}
			System.out.println("Data of e: "+e);
			return e!=null?e.toString():"Employe Not Found of id: "+id;
	}

}
