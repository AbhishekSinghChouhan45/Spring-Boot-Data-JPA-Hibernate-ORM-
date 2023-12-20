package com.nt.repo.prod;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.prod.ProductsInformation;

public interface IProductRepositor extends JpaRepository<ProductsInformation, Integer> {

}
