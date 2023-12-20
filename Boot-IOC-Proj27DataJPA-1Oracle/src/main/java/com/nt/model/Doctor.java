package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Doctors_Info")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer dId;
	@Column(name = "Name")
	private String dName;
	@Column(name = "Specialization")
	private String dSpecialization;
	@Column(name = "Income")
	private Double dIncome;
}
