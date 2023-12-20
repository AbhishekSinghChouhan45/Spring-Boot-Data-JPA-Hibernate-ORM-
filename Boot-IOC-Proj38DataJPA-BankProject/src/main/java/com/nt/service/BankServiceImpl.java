package com.nt.service;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Bank;
import com.nt.repository.IBankRepository;
@Service
public class BankServiceImpl implements IBankService {
	@Autowired
	private IBankRepository bankRepo;
	// For creating Account in Bank 
	@Override
	public String createAccount(Bank customer) throws Exception {
		Bank bank  = bankRepo.save(customer);
		return bank!=null?"Account Created Successfully":"Account can not created try again.....";
	}
	// For updating operation in Bank
	@Override
	public String update(Integer operation,String data,Integer id) throws Exception {
		System.out.println("BankServiceImpl.update()");
		Optional<Bank> customer = bankRepo.findById(id);
		String msg = null;
		if(customer.isEmpty())
			return "Can not update cutomer with id not found";
		else {
			if(operation==1) {
				Bank c = customer.get();
				c.setCName(data);
				bankRepo.save(c);
				msg = "Name Updated Successfull on id: "+c.getCId();
			}
			else if(operation == 2) {
				Bank c = customer.get();
				c.setCAddress(data);
				bankRepo.save(c);
				msg = "Address Updated Successfull on id: "+c.getCId();
			}
			else if(operation == 3) {
				Bank c = customer.get();
				c.setCNumber(Long.parseLong(data));
				bankRepo.save(c);
				msg = "Number Updated Successfull on id: "+c.getCId();
			}
			else if(operation == 4) {
				Bank c = customer.get();
				c.setCDob(Date.valueOf(data));
				bankRepo.save(c);
				msg = "DOB Updated Successfull on id: "+c.getCId();
			}else {
				msg = "Choose Correct Operation";
			}
		}
		return msg;
	}
	// For deposite operation in Bank
	@Override
	public String deposite(Integer id, Double depositeAmount) throws Exception {
		Optional<Bank> customer = bankRepo.findById(id);
		if(customer.isEmpty())
			return "Customer with id "+id+" not found";
		else {
			Bank b = customer.get();
			b.setCBalance(b.getCBalance()+depositeAmount);
			bankRepo.save(b);
			return "Amount deposited to bank id: "+id+"\nYour total balance is: "+customer.get().getCBalance();
		}
	}
	@Override
	public String withdraw(Integer id, Double withdrawalAmount) throws Exception {
		Optional<Bank> customer = bankRepo.findById(id);
		if(customer.isEmpty())
			return "Customer with id "+id+" not found";
		else {
			Bank b = customer.get();
			if(b.getCBalance()<withdrawalAmount)
				return "Insufficient Balance in id: "+b.getCId();
			b.setCBalance(b.getCBalance()-withdrawalAmount);
			bankRepo.save(b);
			return "Amount withdrawan from bank id: "+id+"\nYour total balance is: "+customer.get().getCBalance();
		}
	}
	@Override
	public String transfer(Integer id, Integer receiverId, Double transferAmount) throws Exception {
		Optional<Bank> acc1 = bankRepo.findById(id);
		Optional<Bank> acc2 = bankRepo.findById(receiverId);
			if(acc1.isPresent() && acc2.isPresent()) {
				Bank b = acc1.get();
				if(b.getCBalance()<transferAmount)
					return "Insufficient Balance in id: "+b.getCId();
				b.setCBalance(b.getCBalance()-transferAmount);
				List<Bank> list = new ArrayList<>();
				list.add(b);
				b = acc2.get();
				b.setCBalance(b.getCBalance()+transferAmount);
				list.add(b);
				bankRepo.saveAll(list);
				return "Amount transferd on bank id: "+acc1.get().getCId()+"\nTotal Balance is: "+acc1.get().getCBalance();
			}
			return acc1.isEmpty()?"Sender Account not found":acc2.isEmpty()?"Receiver Accoun not found":"";
	}

}
