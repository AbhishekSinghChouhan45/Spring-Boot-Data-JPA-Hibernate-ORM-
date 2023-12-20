package com.nt.runners;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeService;
@Component
public class ProjectionsRunners implements CommandLineRunner {
		@Autowired
		private IEmployeService ser;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runners.run()");
		
		try {
			ser.showDoctorsBySalaryFilter(20000.0,50000.0).forEach(t->{
				System.out.println(t.geteName());
				System.out.println(t.geteAddress());
				System.out.println(t.geteSalary());
			});
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		}
}
