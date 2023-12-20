package com.nt.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "Employe_info")
@Data
public class Employe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "seq1",sequenceName = "emp_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	@Column(name = "employe_id")
	private Integer eId;
	@Column(name = "employe_name")
	private String eName;
	@Column(name = "employe_address")
	private String eAddress;
	@Column(name = "employe_age")
	private Integer eAge;
	@Column(name = "employe_dob")
	private Date eDob;
	@Column(name = "employe_gender")
	private Character eGender;
	@Column(name = "employe_sal")
	private Double eSalary;

	public Employe(String name,String add,Integer age,Date dob,Character gender,Double salary) {
		setEName(name);
		setEAddress(add);
		setEAge(age);
		setEDob(dob);
		setEGender(gender);
		setESalary(salary);
	}
	public Employe() {
		
	}
}
