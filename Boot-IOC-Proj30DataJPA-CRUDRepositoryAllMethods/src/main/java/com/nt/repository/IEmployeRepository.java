package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Employe;

public interface IEmployeRepository extends CrudRepository<Employe, Integer> {

}
