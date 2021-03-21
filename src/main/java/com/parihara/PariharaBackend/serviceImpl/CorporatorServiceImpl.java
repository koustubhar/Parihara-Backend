package com.parihara.PariharaBackend.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parihara.PariharaBackend.dto.CorporatorDetailsDto;
import com.parihara.PariharaBackend.entity.CorporatorDetails;
import com.parihara.PariharaBackend.exception.CorporatorException;
import com.parihara.PariharaBackend.repository.CorporatorRepo;
import com.parihara.PariharaBackend.service.CorporatorService;

@Service
public class CorporatorServiceImpl implements CorporatorService {

	@Autowired
	private CorporatorRepo corporatorRepo;

	@Override
	public void registerCorporator(CorporatorDetailsDto corporatorDto) throws CorporatorException {

		CorporatorDetails corporatorDetails = convertCoporatorDtoToEntity(corporatorDto);
		corporatorRepo.save(corporatorDetails);

	}

	@Override
	public List<CorporatorDetailsDto> getAllCorporatorDetails() throws CorporatorException {

		List<CorporatorDetails> corporatorDetailsList = corporatorRepo.findAll();
		List<CorporatorDetailsDto> corporatorDetailsDtoList = convertCoporatorEntityToDto(corporatorDetailsList);
		return corporatorDetailsDtoList;

	}

	private CorporatorDetails convertCoporatorDtoToEntity(CorporatorDetailsDto corporatorDto)
			throws CorporatorException {

		if (corporatorDto == null) {

			throw new CorporatorException("Corporator DTO object is null");

		} else {

			CorporatorDetails corporatorDetails = new CorporatorDetails();
			corporatorDetails.setCorporatorFirstName(corporatorDto.getCorporatorFirstName());
			corporatorDetails.setCorporatorLastName(corporatorDto.getCorporatorLastName());
			corporatorDetails.setContactNumber(corporatorDto.getContactNumber());
			corporatorDetails.setParty(corporatorDto.getParty());
			corporatorDetails.setWardNumber(corporatorDto.getWardNumber());

			return corporatorDetails;
		}

	}

	private List<CorporatorDetailsDto> convertCoporatorEntityToDto(List<CorporatorDetails> corporatorDetails)
			throws CorporatorException {

		List<CorporatorDetailsDto> coporatorDtoList = new ArrayList<CorporatorDetailsDto>();
		if (corporatorDetails == null) {

			throw new CorporatorException("Corporator List is null");

		} else {
			for (CorporatorDetails corpDetail : corporatorDetails) {
				CorporatorDetailsDto corporatorDetailsDto = new CorporatorDetailsDto();
				corporatorDetailsDto.setCorporatorFirstName(corpDetail.getCorporatorFirstName());
				corporatorDetailsDto.setCorporatorLastName(corpDetail.getCorporatorLastName());
				corporatorDetailsDto.setContactNumber(corpDetail.getContactNumber());
				corporatorDetailsDto.setParty(corpDetail.getParty());
				corporatorDetailsDto.setWardNumber(corpDetail.getWardNumber());
				corporatorDetailsDto.setId(corpDetail.getId());
				coporatorDtoList.add(corporatorDetailsDto);
			}

			return coporatorDtoList;
		}

	}
}
