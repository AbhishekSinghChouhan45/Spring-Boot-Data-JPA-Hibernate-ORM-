package com.nt.service;

import com.nt.model.Bank;

public interface IBankService {
	public String createAccount(Bank customer)throws Exception;
	public String update(Integer operation,String data,Integer id)throws Exception;
	public String deposite(Integer id,Double depositeAmount)throws Exception;
	public String withdraw(Integer id,Double withdrawalAmount)throws Exception;
	public String transfer(Integer id,Integer receiverId,Double transferAmount)throws Exception;
}
