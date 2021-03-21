package com.parihara.PariharaBackend.service;

import java.util.List;

import com.parihara.PariharaBackend.dto.CorporatorDetailsDto;
import com.parihara.PariharaBackend.exception.CorporatorException;

public interface CorporatorService {

	void registerCorporator(CorporatorDetailsDto corporatorDto) throws CorporatorException;

	List<CorporatorDetailsDto> getAllCorporatorDetails() throws CorporatorException;

}
