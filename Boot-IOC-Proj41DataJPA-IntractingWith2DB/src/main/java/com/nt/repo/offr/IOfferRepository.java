package com.nt.repo.offr;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.offr.OffersDetails;

public interface IOfferRepository extends JpaRepository<OffersDetails, Integer> {

}
