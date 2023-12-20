package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPersonService;
@Component
public class OneToManyRunners implements CommandLineRunner{
	@Autowired
	private IPersonService ser;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("OneToManyRunners.run()");
		try {
			/* 
			        //	Here we are saving the details using parent obj
			ser.saveDataUsingParentObj();
			 */
//				ser.saveDataUsingChildObj();
				//ser.getAllData();
			ser.deleteChild(3);
			ser.saveOnlyChilds(3);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
