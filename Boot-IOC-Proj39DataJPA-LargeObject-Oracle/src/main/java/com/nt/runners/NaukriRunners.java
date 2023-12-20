package com.nt.runners;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.INaukriService;
@Component

public class NaukriRunners implements CommandLineRunner {
	@Autowired
	private INaukriService ser;
	@Autowired
	Scanner sc;
	@Override
	public void run(String... args) throws Exception {
		try {
			System.out.println("NaukriRunners.run()");
			System.out.println(sc==null);
			System.out.print("Enter Job Seeker Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Job Seeker Address: ");
			String add = sc.nextLine();
			System.out.print("Enter Job Seeker Number: ");
			Long number = sc.nextLong(); sc.nextLine();
			System.out.print("Upload Job Seeker resume: ");
			String reume = sc.nextLine();
			System.out.print("Upload Job Seeker image: ");
			String image = sc.nextLine();
			System.out.println(ser.registerSeeker(name, add, number, reume, image));
			System.out.println(ser.findJobSeeker(1));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		//  C://Users//Jarvis//Desktop//indian-bollywood-actor-salman-khan-has-a-cup-of-coffee-during-a-break-from-shooting-an-action.jpeg
		// C://Users//Jarvis//Desktop//Apna college links.txt
}
