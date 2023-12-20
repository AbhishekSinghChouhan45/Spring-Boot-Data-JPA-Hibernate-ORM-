package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeService;
@Component
public class PLSQLRunners implements CommandLineRunner {
	@Autowired
	private IEmployeService ser;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("PLSQLRunners.run()");
		try {		
		ser.getEmployesBySalary(50000.0f, 90000.0f).forEach(System.out::println);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
