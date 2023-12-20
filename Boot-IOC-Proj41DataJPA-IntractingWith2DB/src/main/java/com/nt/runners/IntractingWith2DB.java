package com.nt.runners;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.offr.OffersDetails;
import com.nt.entity.prod.ProductsInformation;
import com.nt.service.IFlipkartService;
@Component
public class IntractingWith2DB implements CommandLineRunner {
	@Autowired
	IFlipkartService ser;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----------run()---------");
		
		String msg1 = ser.saveOffer(List.of(new OffersDetails("B-1 G-1",LocalDateTime.of(2023,12,15,12,00,00),LocalDateTime.of(2023,12,15,6,00,00)),
																 new OffersDetails("B-1 G-50%",LocalDateTime.of(2023,12,15,12,30,00),LocalDateTime.of(2023,12,15,6,30,00)),
																 new OffersDetails("B-2 G-1",LocalDateTime.of(2023,12,15,11,59,00),LocalDateTime.of(2023,12,15,4,59,00)),
														 		 new OffersDetails("B-3 G-80%",LocalDateTime.of(2023,12,15,3,00,10),LocalDateTime.of(2023,12,15,7,00,10))));
		String msg2 = ser.saveProducts(List.of(new ProductsInformation("Chair",true,760.90f,"1Year"),
																	   new ProductsInformation("Table",true,1250.00f,"2Year"),
																	   new ProductsInformation("Lamp",true,640.90f,"1Year 2Months"),
																	   new ProductsInformation("Table Cover",true,249.90f,"No Warranty")));
		System.out.println(msg1);
		System.out.println(msg2);
	}

}
