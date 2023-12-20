package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PhoneNumbers;

public interface IPhoneNumbersRepository extends JpaRepository<PhoneNumbers, Integer> {

}
