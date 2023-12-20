package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.offr.OffersDetails;
import com.nt.entity.prod.ProductsInformation;
import com.nt.repo.offr.IOfferRepository;
import com.nt.repo.prod.IProductRepositor;
@Service
public class FlipkartServiceImpl implements IFlipkartService {
	@Autowired
	private IProductRepositor pRepo;
	@Autowired
	private IOfferRepository  oRepo; 
	@Override
	public String saveProducts(List<ProductsInformation> prod) throws Exception {
		System.out.println("----------saveProducts()------------");
		pRepo.saveAll(prod);
		return prod.size()+" Product are saved successfull";
	}

	@Override
	public String saveOffer(List<OffersDetails> offer) throws Exception {
		System.out.println("--------------saveOffer()------------");
		oRepo.saveAll(offer);
		return offer.size()+" Offers Are Available";
	}

}
