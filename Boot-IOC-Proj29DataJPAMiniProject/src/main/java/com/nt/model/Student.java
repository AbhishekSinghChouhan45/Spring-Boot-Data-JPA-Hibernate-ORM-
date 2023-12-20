package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.transaction.Synchronization;
import lombok.Data;

@Entity
@Table(name = "Students_info")
@Data
public class Student implements Synchronization{
		@Id
		@SequenceGenerator(name = "seq1",sequenceName = "stud_seq",initialValue = 1,allocationSize = 1)
		@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
		@Column(name = "ID")
		private Integer sId;
		@Column(name = "Name",length = 20)
		private String sName;
		@Column(name = "Address",length = 30)
		private String sAddress;
		@Column(name = "Class")
		private Integer sClass;
		@Column(name = "Percentage")
		private Float sPercentage;
		@Column(name = "Result",length = 30)
		private String sResult;
		@Override
		public void beforeCompletion() {
			System.out.println("Student.before");
			
		}
		@Override
		public void afterCompletion(int status) {
			System.out.println("Student.after");
		}
		public Student(String name,String add,Integer classs,Float Percentage,String Result) {
			System.out.println("Student:: 5-param constructor");
			setSName(name);
			setSAddress(add);
			setSClass(classs);
			setSPercentage(Percentage);
			setSResult(Result);
		}
		public Student() {
			System.out.println("Student.Student()");
		}
		public void setSName(String name) {
			System.out.println("Student.setSName()");
			this.sName = name;
		}
		
}
