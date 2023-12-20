package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Employe;

public interface IEmployeRepository extends PagingAndSortingRepository<Employe, Integer>,CrudRepository<Employe, Integer>{
		
}
