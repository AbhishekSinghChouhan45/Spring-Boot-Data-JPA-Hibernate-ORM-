package com.nt.runners;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeService;
@Component
public class Runners implements CommandLineRunner {
		@Autowired
		private IEmployeService ser;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runners.run()");
		/*  
			try {
						List<Employe> list = ser.showDoctorsByName("tony");
						if(list.isEmpty())
							System.out.println("Employe Not Found");
						else
							list.forEach(System.out::println);
			}catch (Exception e) {
					System.out.println("sdf "+e.getMessage());
				}
		*/	
	/*	 //findByeNameIgnoreCase method of IEmployeRepoitory (findByMethods)
			try {
				ser.showDoctorsByNameIgnoreCase("riya").forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	*/		
	/*		//findByeNameStartingWith method of IEmployeRepoitory (findByMethods)
			try {
				ser.showDoctorsByNameStartingWith("r").forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}		
	*/	
	/*		 //findByeNameEndingWith method of IEmployeRepoitory (findByMethods)
			try {
				ser.showDoctorsByNameEndingWith("a").forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	*/		
	/*		//findByeNameContains method of IEmployeRepoitory (findByMethods)
			try {
				ser.showDoctorsByNameContaining("i").forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	*/		
	/*		//findByeSalaeyGreaterThan method of IEmployeRepoitory (findByMethods)
		try {
			ser.showDoctorsBySalaryGreaterThan(290999.0).forEach(System.out::println);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	*/		

	/*		//findByeSalaryLessThan method of IEmployeRepoitory (findByMethods)
			try {
				ser.showDoctorsBySalaryLessThan(1000.0).forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	*/		
		
	/*		//findByeSalaryBetween method of IEmployeRepoitory (findByMethods)
		   try {
				ser.showDoctorsBySalaryBetween(10000.0,50000.0).forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	*/
	/*		//findByeAge method of IEmployeRepoitory (findByMethods)
			try {
				ser.showDoctorsByAge(38).forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	*/		
	/*		//findByeAgeGreaterThan method of IEmployeRepoitory (findByMethods)
			try {
				ser.showDoctorsByAgeGreaterThan(35).forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	*/	
	/*		//findByeAgeLessThanEqual method of IEmployeRepoitory (findByMethods)
			try {
				ser.showDoctorsByAgeLessThan(35).forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	*/		
	/*		//findByeAgeBetween method of IEmployeRepoitory (findByMethods)	
			try {
				ser.showDoctorsByAgeBetween(30,35).forEach(System.out::println);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	*/		
		
		try {
			ser.showDoctorsByAgeBetween(30,35).forEach(System.out::println);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		}
}
