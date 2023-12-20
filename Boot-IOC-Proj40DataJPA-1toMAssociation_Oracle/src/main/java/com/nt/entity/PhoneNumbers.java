package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "JPA_PHONENUMBER")
//@Setter
@Getter
@RequiredArgsConstructor
public class PhoneNumbers implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "number_seq",sequenceName = "JPA_Numbers_seq",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "number_seq",strategy = GenerationType.SEQUENCE)
	private Integer nid;
	@NonNull
	private Long phonenumber;
	@NonNull
	@Column(length = 20)
	private String providername;
	@NonNull
	@Column(length = 20)
	private String numbertype;
	//Creating HAS-A property
	@ManyToOne(targetEntity = Person.class,cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name = "PERSON_ID",referencedColumnName = "PID")
	private Person personinfo;
	@Override
	public String toString() {
		return "PhoneNumbers [NID=" + nid + ", NUMBER=" + phonenumber + ", PROVIDERNAME=" + providername + ", NUMBERTYPE="
				+ numbertype + "]";
	}
	public PhoneNumbers() {
		System.out.println("-----------PhoneNumbers-----------");
	}
	public void setNid(Integer nid) {
		System.out.println("----------setNid()---------");
		this.nid = nid;
	}
	public void setNumber(Long number) {
		System.out.println("----------setNumber()---------");
		this.phonenumber = number;
	}
	public void setProvidername(String providername) {
		System.out.println("----------setProviderName()---------");
		this.providername = providername;
	}
	public void setNumbertype(String numbertype) {
		System.out.println("----------setNumbertype()---------");
		this.numbertype = numbertype;
	}
	public void setPersoninfo(Person personinfo) {
		System.out.println("----------setPersonInfo()---------");
		this.personinfo = personinfo;
	}
}
