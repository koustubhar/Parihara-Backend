package com.parihara.PariharaBackend.dto;

public class CorporatorDetailsDto {

	private int id;

	private String corporatorFirstName;

	private String corporatorLastName;

	private String contactNumber;

	private int wardNumber;

	private String party;

	public String getCorporatorFirstName() {
		return corporatorFirstName;
	}

	public void setCorporatorFirstName(String corporatorFirstName) {
		this.corporatorFirstName = corporatorFirstName;
	}

	public String getCorporatorLastName() {
		return corporatorLastName;
	}

	public void setCorporatorLastName(String corporatorLastName) {
		this.corporatorLastName = corporatorLastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
