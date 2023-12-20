package com.nt.model;

import java.sql.Date;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Bank_Data")
@Data
@RequiredArgsConstructor
public class Bank {
	@Id
	@SequenceGenerator(name = "seq1",sequenceName = "bank_seq",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	@Column(name = "CUSTOMERID")
	private Integer cId;
	@NonNull
	@Column(name = "CUSTOMERName",length = 25)
	private String cName;
	@NonNull
	@Column(name = "CUSTOMERAddress",length = 35)
	private String cAddress;
	@NonNull
	@Column(name = "CUSTOMERType",length = 15)
	private String cType;
	@NonNull
	@Column(name = "CUSTOMERBalance")
	private Double cBalance;
	@NonNull
	@Column(name = "CUSTOMERNumber")
	private Long cNumber;
	@Version
	@Column(name = "CUSTOMERModified")
	private Integer countModified;
	@NonNull
	@Column(name = "CUSTOMERDob")
	private Date cDob;
	@Column(name = "CREATIONDate")
	@CreationTimestamp
	private Timestamp creationTime;
	@Column(name = "UPDATEDate")
	@UpdateTimestamp
	private Timestamp updateTime;
	
	// 0-param Constructor
	public Bank() {
		System.out.println("----------Bank--------");
	}
}
