package com.nt.service;

public interface INaukriService {
	public String registerSeeker(String name,String Address,Long number,String resume,String image)throws Exception;
	public String findJobSeeker(Integer id)throws Exception;
}
