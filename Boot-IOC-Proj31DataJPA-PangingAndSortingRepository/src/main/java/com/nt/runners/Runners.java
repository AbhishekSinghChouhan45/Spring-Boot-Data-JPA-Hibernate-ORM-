package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.model.Employe;
import com.nt.service.IEmployeService;
@Component
public class Runners implements CommandLineRunner {
		@Autowired
		private IEmployeService ser;
	@Override
	public void run(String... args) throws Exception {
		try {
				// ser.findAllBySorting(true,"eName","eId").forEach(System.out::println);
			/*
				Page<Employe> page = 	ser.findAllByPaging(5, 5, true, "eId");
				page.forEach(System.out::println);
				System.out.println("Total No of Pages: "+(page.getNumber()+1) +"/"+page.getTotalPages());
				System.out.println("Total Number of Employes: "+page.getNumberOfElements());
				System.out.println("Total Size: "+page.getSize());
				System.out.println("Is First: "+page.isFirst());
				System.out.println("Is Last: "+page.isLast());
				System.out.println("Is Empty: "+page.isEmpty());
			*/
			ser.showEmployesPagebyPage(4);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
