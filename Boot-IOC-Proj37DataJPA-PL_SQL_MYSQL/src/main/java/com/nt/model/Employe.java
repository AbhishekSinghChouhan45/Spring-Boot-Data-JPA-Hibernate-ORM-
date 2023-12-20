package com.nt.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Employe_data")
@Data
@RequiredArgsConstructor
public class Employe {
	@Id
	@SequenceGenerator(name = "seq1",sequenceName = "emp_seq"	,initialValue = 10,allocationSize = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	@Column(name = "EMPLOYEId")
	private int eId;
	@Column(name = "EMPLOYENAME")
	private String eName;
	@NonNull
	@Column(name="EMPLOYEAdd")
	private String eAdd;
	@NonNull
	@Column(name = "EMPLOYENumber")
	private Long eNumber;
	@NonNull
	@Column(name = "EMPLOYEDesignation")
	private String eDesignation;
	@NonNull
	@Column(name="EMPLOYESalary")
	private Double eSalary;
	
	public Employe() {
		System.out.println("Employe.Employe()------------------------------------");
	}
	
}
