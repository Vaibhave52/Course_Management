package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.PremisesDto;
import com.app.entity.Premises;
import com.app.repository.PremisesRepository;

@Service
@Transactional
public class PremisesServiceImpl implements PremisesService {

	@Autowired
	private PremisesRepository premiseRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Premises addPremise(PremisesDto addPremise) {

		Premises map = modelMapper.map(addPremise, Premises.class);

		return premiseRepository.save(map);

	}

	public String deletePremise(Long premisesId) {

		Premises premise = premiseRepository.findById(premisesId)
				.orElseThrow(() -> new RuntimeException("premise not found with id: " + premisesId));

		premiseRepository.delete(premise);

		return "Premises deleted";
	}

	@Override
	public Premises editPremise(PremisesDto addPremise, Long premisesId) {

		Premises premise = premiseRepository.findById(premisesId)
				.orElseThrow(() -> new RuntimeException("premise not found with id: " + premisesId));

		premise.setInstituteNames(addPremise.getInstituteNames());
		premise.setAddresses(addPremise.getAddresses());
		premise.setDescriptions(addPremise.getDescriptions());

		return premiseRepository.save(premise);

	}

	@Override
	public List<Premises> getAllPremises() {
		return premiseRepository.findAll();

	}

}