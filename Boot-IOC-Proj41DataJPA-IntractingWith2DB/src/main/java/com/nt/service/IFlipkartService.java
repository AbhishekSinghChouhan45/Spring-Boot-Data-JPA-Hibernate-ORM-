package com.nt.service;

import java.util.List;

import com.nt.entity.offr.OffersDetails;
import com.nt.entity.prod.ProductsInformation;

public interface IFlipkartService {
		public String saveProducts(List<ProductsInformation> prod)throws Exception;
		public String saveOffer(List<OffersDetails> offer)throws Exception;
}
