package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employe;
import com.nt.repository.IEmployeRepository;

@Service
public class EmployeSservice implements IEmployeService{
	@Autowired
	private IEmployeRepository repo;
	@Override
	public String SaveEmploye(Employe employe) throws Exception {
			repo.save(employe);
		return "Employe Registered Successfully and Employe Id is: "+employe.getEId();
	}
	@Override
	public String SaveAllEmploye(Iterable<Employe> employe) throws Exception {
		Iterable<Employe> ids = repo.saveAll(employe);
		List<Integer> id= new ArrayList<Integer>();
		ids.forEach(i ->{
			id.add(i.getEId());
		});
		return "ALL Employes Registered Successfully and there Id's are: "+id;
	}
	@Override
	public Long countEmploye() throws Exception {
		return repo.count();
	}
	@Override
	public Iterable<Employe> findAllEmploye() throws Exception {
		return repo.findAll();
	}
	@Override
	public Iterable<Employe> findAllByIdEmploye(Iterable<Integer> id) throws Exception {
		return repo.findAllById(id);
		
	}
	@Override
	public Optional<Employe> findByIdEmploye(Integer id) throws Exception {
		return repo.findById(id);
	}
	@Override
	public Boolean existByIdEmploye(Integer id) throws Exception {
		return repo.existsById(id);
	}
	@Override
	public String deleteEmploye(Employe employe) throws Exception {
				 Optional<Employe> emp = repo.findById(employe.getEId());
				 if(emp.isEmpty())
					 return "No Employe Found of id: "+employe.getEId();
				 else {
					 	repo.delete(employe);
					 	return "Employe Found and Deleted of Id: "+employe.getEId();
				 }
	}
	@Override
	public String deleteById(Integer id) throws Exception {
			Optional<Employe> emp = repo.findById(id);
			if(emp.isEmpty()) {
				return "No Employe Found of Id: "+id;
			}else {
					repo.deleteById(id);
				return "Employe Found and Deleted of Id: "+id;
			}
	}
	
	
	
}
