package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Doctor;

public interface IDoctorsRepository extends CrudRepository<Doctor, Integer> {

}
