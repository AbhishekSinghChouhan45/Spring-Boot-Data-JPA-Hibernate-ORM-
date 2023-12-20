package com.nt.runners;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.nt.model.Student;
import com.nt.service.IStudentService;

import lombok.Data;
@Component
@ConfigurationProperties(prefix = "stud")
@Data
public class Runners implements CommandLineRunner {
	@Autowired
	private IStudentService ser;
	String name;
	String add;
	Integer classs;
	Float per;
	String Result;
	@Override
	public void run(String... args) throws Exception {
			System.out.println("IN Runners");
//			Student s = new Student(name, add, classs, per, Result);
//			String msg = ser.saveStudents(s);
//			System.out.println(msg);
			try {
			Optional<Student> st = Optional.empty();	
			st =ser.StudentsByName(3);
			if(st==null) {
				System.out.println("NULL RE BABU");
			}
			System.out.println(st.get());
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
	}

}
