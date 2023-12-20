package com.nt.entity.offr;

import java.time.LocalDateTime;

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
@Data
//@Table(name = "Offers")
@RequiredArgsConstructor
public class OffersDetails {
	@Id
	@SequenceGenerator(name = "seq",sequenceName = "offerseq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer oId;
	@NonNull
	@Column(name = "OFFERNAME",length = 25)
	private String oName;
	@NonNull
	@Column(name = "STARTTIME")
	private LocalDateTime oStart;
	@NonNull
	@Column(name = "ENDTIME")
	private LocalDateTime oEnd;
	
	public OffersDetails(){
		System.out.println("---------------------OffersDetails()---------------------");
	}
}
