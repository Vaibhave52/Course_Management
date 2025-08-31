package com.app.service;

import java.util.List;

import com.app.dto.InfrastructureDto;

public interface InfrastructureService {

	public InfrastructureDto createInfrastructure(InfrastructureDto infrastructureDto);

	public InfrastructureDto updateInfrastructure(InfrastructureDto infrastructureDto, Long id);

	public InfrastructureDto getInfrastructureById(Long id);

	public List<InfrastructureDto> getAllInfrastructure();

	public void deleteInfrastructureById(Long id);

}
