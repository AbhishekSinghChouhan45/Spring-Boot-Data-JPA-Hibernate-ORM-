package com.nt.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name="JOB_SEEKER")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Naukri implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "seq",sequenceName = "Naukri_seq",allocationSize = 1,initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	private Integer JSId;
	@NonNull
	private String JSName;
	@NonNull
	private String JSAddress;
	@NonNull
	private Long JSNumber;
	@NonNull
	@Lob
	private char[] JSResume;
	@NonNull
	@Lob
	private byte[] JSImage;
	
}
