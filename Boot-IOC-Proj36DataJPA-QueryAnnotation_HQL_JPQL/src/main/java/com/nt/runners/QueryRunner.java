package com.nt.runners;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employe;
import com.nt.service.IEmployeService;

@Component
public class QueryRunner implements CommandLineRunner {
	@Autowired
	private IEmployeService ser;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("QueryRunner.run()");
		/*  // getAllDoctors Operation of IEmployeRepository	
				try {
					ser.getAllDoctors().forEach(System.out::println);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
		*/
		/*		// getAllDoctorsByNameAndAddress Operation of IEmployeRepository	
				try {
						List<Employe> list = ser.getAllDoctorsByNameAndAddress("Riyaaa","Delhi");
						System.out.println(list.isEmpty()?"No Employe Found":list.toString());
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
		*/
		/*		// getAllDoctorsByName List<Object[]> return type  Operation of IEmployeRepository
				try {
					List<Object[]> list = ser.getAllDoctorsExtra();
					list.forEach(t->{
						for(Object obj:t) {
							System.out.println(obj);
						}
					});
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
		*/
		/*  // getAllDoctorsByName Object return type Operation of IEmployeRepository		
				try {
		//			Object obj = ser.getAllDoctorsExtrabyName("Riya");
					Object[] objj = (Object[]) ser.getAllDoctorsExtrabyName("Riya");
					for(Object obj:objj) {
						System.out.println(obj);
					}
					for(int i=0;i<objj.length;i++) {
						System.out.println(objj[i]);
					}
					System.out.println(objj[0]);
					System.out.println(objj[1]);
					System.out.println(objj[2]);
					System.out.println(objj[3]);
					System.out.println(objj[4]);
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
			*/
		/*			
				try {
						System.out.println(ser.updateName("Deepraj",5) < 0?"Employe Name Not Updated":"Employe Name Updated");
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
		*/		
		
		try {
//			Date date = Date.valueOf(21-09-1977);
			String str="1996-03-24";  
		    Date date=Date.valueOf(str);
//			System.out.println(ser.insertEmploye("Jaywardhan","Chn",42,date,"M",8999.90) < 0?"Employe Not Inserted":"Employe Inserted Successfully");
		    System.out.println(ser.UpdateEmploye(19,"Dharemdra","Indore",36,date.valueOf("2000-03-4"),'M',40000.00) < 0 ?"Employe Not Updated":"Employe Updated");
		    ser.getAllDoctors().forEach(System.out::println);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
