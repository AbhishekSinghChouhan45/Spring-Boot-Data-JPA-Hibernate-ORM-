package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nt.model.Employe;

public interface IEmployeRepository extends JpaRepository<Employe, Integer>,CrudRepository<Employe, Integer>{
		
}
