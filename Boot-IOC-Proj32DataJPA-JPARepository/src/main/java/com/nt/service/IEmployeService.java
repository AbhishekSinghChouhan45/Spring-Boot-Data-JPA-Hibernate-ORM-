package com.nt.service;

import java.util.List;

import com.nt.model.Employe;

public interface IEmployeService {
		public String deleteAllbyBatchID(List<Integer> ids)throws Exception;
		public List<Employe> findAll(Employe emp,Boolean des,String ...properties)throws Exception;
		public List<Employe>findAll(Employe emp)throws Exception;
		public String getByID(Integer id)throws Exception;
		public String getOne(Integer id)throws Exception;
		public String getRefByID(Integer id)throws Exception;
		
}
