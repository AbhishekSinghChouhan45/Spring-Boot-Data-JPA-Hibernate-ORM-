package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employe;
import com.nt.service.IEmployeService;
@Component
public class Runners implements CommandLineRunner {
		@Autowired
		private IEmployeService ser;
	@Override
	public void run(String... args) throws Exception {
		// System.out.println(ser.deleteAllbyBatchID(List.of(6,10)));
		
		/*		// Find All method of JPA Repository with sort object
				try {
						Employe emp = new Employe();
						emp.setEName("Abhishek");
						emp.setEAge(21);
						ser.findAll(emp, true, "eName").forEach(System.out::println);
					}catch (Exception e) {
						System.out.println(e.getMessage());
					}
		*/
		/*	  // Find All method of JPA Repository without sort object
			try {
					Employe emp = new Employe();
					emp.setEName("Riya");
					ser.findAll(emp).forEach(System.out::println);
		      	}catch (Exception e) {
					System.out.println(e.getMessage());
				}
		*/	
		/*	 // The Main Diff b/w CRUD findByID() and JPA getByID() is untill we call do not call or return the any method of Entity class on the entity object till that the
		 *  // jpa will not send any query to db and it is possible because of proxy class extending Entity class and it is created during the calling getByID() and this method just return that proxy object 
		 *   // we get real object when we call any method of entity class on entity obj than the query will sended to db. 
			try {
					System.out.println(ser.getByID(6));
			    }catch (Exception e) {
					System.out.println(e.getMessage());
				}
		 */
		
			try {
					System.out.println(ser.getRefByID(6));
			}catch (Exception e) {
				System.out.println("sdf "+e.getMessage());
			}
		
		
		
		
		
		
		
		
		
		
		}
}
