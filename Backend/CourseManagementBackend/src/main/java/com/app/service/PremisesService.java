package com.app.service;

import java.util.List;

import com.app.dto.PremisesDto;
import com.app.entity.Premises;

public interface PremisesService {
	
	List<Premises> getAllPremises();

	Premises addPremise(PremisesDto addPremise);

	String deletePremise(Long premisesIdd);
	
	Premises editPremise(PremisesDto addPremise , Long premisesId);

}