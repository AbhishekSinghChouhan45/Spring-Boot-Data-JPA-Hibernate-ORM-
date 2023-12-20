package com.nt.service;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;

import com.nt.model.Employe;

public interface IEmployeService {
	public Iterable<Employe> findAllBySorting(Boolean des,String ...properties)throws Exception;
	public Page<Employe> findAllByPaging(int pageNo,int pageSize,Boolean des,String ...properties)throws Exception;
	public void showEmployesPagebyPage(int Size)throws Exception;
}
