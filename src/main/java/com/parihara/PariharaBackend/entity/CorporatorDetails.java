package com.parihara.PariharaBackend.entity;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author koustubha
 * 
 * This is the model class that holds the Data of the Registered Corporator.
 *
 */

@Entity
@NoArgsConstructor
@Data
public class CorporatorDetails {
	
	private int id;
	
	private String corporatorFirstName;
	
	private String corporatorLastName;
	
	private String contactNumber;
	
	private int wardNumber;
	
	private String party;
	
}
