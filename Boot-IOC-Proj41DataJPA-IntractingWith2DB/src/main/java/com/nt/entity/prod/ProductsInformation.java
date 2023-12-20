package com.nt.entity.prod;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Products")
@Data
@RequiredArgsConstructor
public class ProductsInformation {
	@Id
	@SequenceGenerator(name = "seq",sequenceName = "product_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
	@Column(name = "ID")
	private Integer pId;
	@NonNull
	@Column(name = "NAME",length = 25)
	private String pName;
	@NonNull
	@Column(name = "AVABLITY")
	private Boolean pAvl;
	@NonNull
	@Column(name = "PRICE")
	private Float pPrice;
	@NonNull
	@Column(name = "WARRANTY")
	private String pWarranty;
	public ProductsInformation(){
		System.out.println("----------------------ProductsInformation()-------------------");
	}
}
