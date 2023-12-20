package com.nt.service;

import java.util.Optional;

import com.nt.model.Employe;

public interface IEmployeService {
		public String SaveEmploye(Employe employe) throws Exception;
		public String SaveAllEmploye(Iterable<Employe> employe)throws Exception;
		public Long countEmploye()throws Exception;
		public Iterable<Employe> findAllEmploye()throws Exception;
		public Iterable<Employe> findAllByIdEmploye(Iterable<Integer> id)throws Exception;
		public Optional<Employe> findByIdEmploye(Integer id)throws Exception;
		public Boolean existByIdEmploye(Integer id)throws Exception;
		public String deleteEmploye(Employe employe)throws Exception;
//		public String deleteAllEmploye()throws Exception;
//		public String deleteAllEmploye(Iterable<Employe> employe)throws Exception;
//		public String deleteAllByIdEmploye(Iterable<Integer> ids)throws Exception;
		public String deleteById(Integer id)throws Exception;
		
}
