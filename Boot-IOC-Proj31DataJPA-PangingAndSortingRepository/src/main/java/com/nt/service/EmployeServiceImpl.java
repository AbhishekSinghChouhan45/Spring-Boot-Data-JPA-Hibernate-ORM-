package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.model.Employe;
import com.nt.repository.IEmployeRepository;
@Service
public class EmployeServiceImpl implements IEmployeService {
	@Autowired
	private IEmployeRepository repo;
	
	@Override
	public Iterable<Employe> findAllBySorting(Boolean des, String... properties) throws Exception {
			Sort sort = Sort.by(des?Direction.ASC:Direction.DESC, properties);
		return repo.findAll(sort);
	}

	@Override
	public Page<Employe> findAllByPaging(int pageNo, int pageSize,Boolean des, String... properties) throws Exception {
			Sort sort = Sort.by(des?Direction.ASC:Direction.DESC,properties);
			Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
			return repo.findAll(pageable);
	}

	@Override
	public void showEmployesPagebyPage(int Size) throws Exception {
			Long count = repo.count();
			Long count1 = count / Size;
			if(count1 % Size != 0)
				count1++;
			for(int i = 0;i<count1;i++) {
			Pageable pageable = PageRequest.of(i, Size);
			Page<Employe> emp = repo.findAll(pageable);
			System.out.println("----------------Page "+(emp.getNumber()+1)+"/"+emp.getTotalPages()+"------------------");
			emp.forEach(System.out::println);
		}
	}

	
}
