package com.parihara.PariharaBackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

/**
 * @author koustubha
 */

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parihara.PariharaBackend.dto.CorporatorDetailsDto;
import com.parihara.PariharaBackend.exception.CorporatorException;
import com.parihara.PariharaBackend.service.CorporatorService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/corporator")
public class CorporatorMgmtController {

	@Autowired
	private CorporatorService corporatorService;
	
	@GetMapping("/allCorporators")
	public ResponseEntity<String> getAllCorporatorDetails() throws Exception {
		
		JSONObject responseJson = new JSONObject();
		HttpStatus httpStatus = HttpStatus.OK;
		
		try {
			List<CorporatorDetailsDto> corporatorList = corporatorService.getAllCorporatorDetails();
			responseJson.put("data", corporatorList);
		} catch(Exception e) {
			responseJson.put("data", e.getMessage());
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<String>(responseJson.toString(), httpStatus);
	}
	
	@PostMapping("/registerCorporator")
	public ResponseEntity<String> registerCorporator(@RequestBody CorporatorDetailsDto corporatorDetailsDto) throws CorporatorException {
		
		JSONObject responseJson = new JSONObject();
		HttpStatus httpStatus = HttpStatus.CREATED;
		
		try {
			corporatorService.registerCorporator(corporatorDetailsDto);
			responseJson.put("data", "Corporator registered successfully");
		} catch(Exception e) {
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			responseJson.put("data", e.getMessage());
		}
		return new ResponseEntity<String>(responseJson.toString(), httpStatus);
	}
}
