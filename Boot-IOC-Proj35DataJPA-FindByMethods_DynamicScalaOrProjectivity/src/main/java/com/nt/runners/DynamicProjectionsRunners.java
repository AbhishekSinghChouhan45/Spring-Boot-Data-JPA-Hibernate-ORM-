package com.nt.runners;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeService;
import com.nt.type.Projection1;
import com.nt.type.Projection2;
import com.nt.type.Projection3;
@Component
public class DynamicProjectionsRunners implements CommandLineRunner {
		@Autowired
		private IEmployeService ser;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runners.run()");
		
		try {
					List<Projection1> e = ser.showDoctorsBySalaryFilter(30000.0, 50000.0,Projection1.class);
					e.forEach(t->{
						System.out.println(t.geteId()+" "+t.geteName()+"\t\t"+t.getClass());
					});
					System.out.println("-------------------------------------------------------");
					List<Projection2> e2 = ser.showDoctorsBySalaryFilter(30000.0, 50000.0,Projection2.class);
					e2.forEach(tt->{
						System.out.println(tt.geteName()+" "+tt.geteSalary()+"\t\t"+tt.getClass());
					});
					System.out.println("-------------------------------------------------------");
					List<Projection3> e3 = ser.showDoctorsBySalaryFilter(30000.0, 50000.0,Projection3.class);
					e3.forEach(ttt->{
						System.out.println(ttt.geteGender()+" "+ttt.geteSalary()+"\t\t"+ttt.getClass());
					});
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		}
}
