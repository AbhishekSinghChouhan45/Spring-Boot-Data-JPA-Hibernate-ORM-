package com.nt.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.crossstore.ChangeSetBackedTransactionSynchronization;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "JPA_PERSON")
//@Setter
@Getter
@RequiredArgsConstructor
public class Person implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@SequenceGenerator(name = "person_seq",sequenceName = "JPA_Person_seq",allocationSize = 1,initialValue = 1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "person_seq")
		private Integer pid;
		@NonNull
		@Column(length = 20)
		private String pname;
		@NonNull
		@Column(length = 30)
		private String paddress;
//		Creating a collection of HAS-A property 
		@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = PhoneNumbers.class,mappedBy = "personinfo")
//		@JoinColumn(name = "PERSON_ID",referencedColumnName = "PID")
		private List<PhoneNumbers> contactdetails;
		
		//toString()
		@Override
		public String toString() {
			return "Person [PID=" + pid + ", PNAME=" + pname + ", PADDRESS=" + paddress + "]";
		}
		//constructor
		public Person() {
			System.out.println("--------------------Person-----------");
		}
		//setter method
		public void setPid(Integer pid) {
			System.out.println("---------------Person.setPid()-------------");
			this.pid = pid;
		}
		public void setPname(String pname) {
			System.out.println("---------------Person.setPname()---------------");
			this.pname = pname;
		}
		public void setPaddress(String paddress) {
			System.out.println("---------------Person.setPaddress()---------------");
			this.paddress = paddress;
			
		}
		public void setContactdetails(List<PhoneNumbers> contactdetails) {
			System.out.println("---------------Person.setContactdetails()---------------");
			this.contactdetails = contactdetails;
		}
}
