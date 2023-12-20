package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity 
@Data
@Table(name = "Doctors_info")
public class Doctor {
	@Id
	@SequenceGenerator(name = "seq1",sequenceName = "Doc_seq1",initialValue = 3,allocationSize = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer dId;
	@Column(name = "Name")
	private String dName;
	@Column(name = "Specialization")
	private String dSpecialization;
	@Column(name = "Income")
	private Double dIncome;
	
}
