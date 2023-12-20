package com.nt.runners;

import java.sql.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Bank;
import com.nt.service.IBankService;
@Component
public class BankRunners implements CommandLineRunner {
	@Autowired
	private IBankService bankService;
	private Integer id;
	private String name;
	private String address;
	private String type;
	private Double balance;
	private Long number;
	private String dob;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("BankRunners.run()");
				try(Scanner sc = new Scanner(System.in);) {
					System.out.print("Which operation do you want to perform: \n\t 1.Open Account\n\t 2.Update\n\t3.Deposite\n\t4.Withdraw\n\t5.Transfer");
					int operation = sc.nextInt();
					switch (operation) {
					case 1: {
						sc.nextLine();
							System.out.print("Enter Name: ");
							name = sc.nextLine();
							System.out.print("Enter Address: ");
							address = sc.nextLine();
							System.out.print("Enter Account type: ");
							type = sc.nextLine();
							System.out.print("Enter opening balance: ");
							balance = sc.nextDouble();
							System.out.print("Enter number: ");
							number = sc.nextLong(); sc.nextLine();
							System.out.print("Enter Date yyyy-mm-dd : ");
							dob = sc.nextLine();
						System.out.println(bankService.createAccount(new Bank(name, address, type, balance, number,Date.valueOf(dob))));
						break;
					}case 2:{
							System.out.print("Enter Update Operation: \n\t1.Name\n\t2.Address\n\t3.Number\n\t4.DOB");
							int uOperation = sc.nextInt(); sc.nextLine();
							System.out.print("Enter customer id: ");
							id = sc.nextInt(); sc.nextLine();
							System.out.print("Enter Data: ");
							String Data = sc.nextLine();
							System.out.println(bankService.update(uOperation, Data, id));
							break;
					}case 3:{
						System.out.print("Enter customer id: ");
						id = sc.nextInt(); sc.nextLine();
						System.out.print("Enter Deposite Amount: ");
						balance = sc.nextDouble();
						System.out.println(bankService.deposite(id, balance));
						break;
					}case 4:{
						System.out.print("Enter customer id: ");
						id = sc.nextInt(); sc.nextLine();
						System.out.print("Enter Withdrawal Amount: ");
						balance = sc.nextDouble();
						System.out.println(bankService.withdraw(id, balance));
						break;
					}case 5:{
						System.out.print("Enter customer id: ");
						id = sc.nextInt(); sc.nextLine();
						System.out.print("Enter receiver customer id: ");
						Integer id2 = sc.nextInt(); sc.nextLine();
						System.out.print("Enter Withdrawal Amount: ");
						balance = sc.nextDouble();
						System.out.println(bankService.transfer(id,id2,balance));
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + operation);
					}
					
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}

}
