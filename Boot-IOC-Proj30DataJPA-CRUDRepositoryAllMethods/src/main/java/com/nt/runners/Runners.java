package com.nt.runners;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employe;
import com.nt.service.IEmployeService;

import jakarta.persistence.criteria.CriteriaBuilder.In;
@Component
public class Runners implements CommandLineRunner {
	@Autowired
	private IEmployeService ser;
	@Override
	public void run(String... args) throws Exception {
/*	  ------------------------------------------------- Save Operation of CRUDRepository--------------------------------------------
  		try {
					Employe emp = new Employe("Tony", "Delhi", 36,new java.sql.Date(2020,12,12), 'M', 45000.98);
					String msg = ser.SaveEmploye(emp);
					System.out.println(msg);
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			} 
*/
/*	 ---------------------------------------------SaveALL Operation of CRUD Repository--------------------------------
    	try {
			List<Employe> emp = new ArrayList<Employe>();
			Employe	emp1 = new Employe("Ravi", "Hyd", 46, new java.sql.Date(1977,06, 28), 'M', 87000.40);
			Employe	emp2 = new Employe("Ravina", "Chn", 37, new java.sql.Date(1989, 02, 16), 'F', 46000.660);
			Employe	emp3 = new Employe("Chetan", "Benglurur", 36, new java.sql.Date(1997, 11, 04), 'M', 45000.40);
			emp.add(emp1);
			emp.add(emp2);
			emp.add(emp3);
			String msg = ser.SaveAllEmploye(emp);
			System.out.println(msg);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
*/		
/* -----------------------Count Operation of CRUD Repository------------------------------
 	try {
				System.out.println(ser.countEmploye());
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
*/	
/* ----------------------FindAll Operation of CRUD Repository---------------------
  	try {
		Iterable<Employe>emp =ser.findAllEmploye();
		emp.forEach(i->
			System.out.println(i)
		);
		
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
*/	
/* --------------------------------Find All By Id Operation of CRUD Repository--------------------------
   try {
//			List<Integer> ids = new ArrayList<Integer>();
//			ids.add(3);
//			ids.add(6);
//			ids.add(1);
//			ids.add(312);
			Iterable<Employe> emp = ser.findAllByIdEmploye(List.of(3,6,7,4,12));
			emp.forEach(System.out::println);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
*/
/* --------------------------Find By Id Operation of CRUD Repository-----------------------------		
  try {
				Optional<Employe> emp = ser.findByIdEmploye(14);
				if(emp.isEmpty())
					System.out.println("No Employe Found");
				else
				System.out.println(emp.get());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
/*------------------------------Exist By Id Operation of CRUD Repository------------------------------------
 	try {
			System.out.println(ser.existByIdEmploye(89));
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
*/	
/* ------------------------Delete Employe Operation of CRUD Repository-----------------------------------
 * 	Here Definately we can set more details of the object using setter methods but the only used property is ID which will be used to Delete the data. 
 * 	If we dont pass the id then we will get Exception (The given id must not be null)
   try {
		Employe emp = new Employe();
//		emp.setEId(9);
		emp.setEName("Dheeraj");
		System.out.println(ser.deleteEmploye(emp));
}catch (Exception e) {
	System.out.println(e.getLocalizedMessage());
}
 */
/* -----------------------------------------------Delete By Id Operation of CRUD Repository---------------------------------------	
   try {
			System.out.println(ser.deleteById(8));
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
*/
		
		
		
		
		
		
		
		
		
		
	}

}
