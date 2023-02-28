package com.example.once_test.vo;

import java.util.List;

import com.example.once_test.entity.AssociateCompanyDetailEdit;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssociateCompanyRes {

	private AssociateCompanyDetailEdit associateCompanyDetailEdit;

	private String message;

	private List<AssociateCompanyList> associateCompanyList;

	public AssociateCompanyRes() {

	}

	public AssociateCompanyRes(List<AssociateCompanyList> associateCompanyList) {

		this.associateCompanyList = associateCompanyList;
	}

	public AssociateCompanyRes(String message) {
		this.message = message;
	}

	public AssociateCompanyRes(AssociateCompanyDetailEdit associateCompanyDetailEdit, String message) {

		this.associateCompanyDetailEdit = associateCompanyDetailEdit;
		this.message = message;
	}

	public AssociateCompanyRes(AssociateCompanyDetailEdit associateCompanyDetailEdit) {
		this.associateCompanyDetailEdit = associateCompanyDetailEdit;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AssociateCompanyDetailEdit getAssociateCompanyDetailEdit() {
		return associateCompanyDetailEdit;
	}

	public void setAssociateCompanyDetailEdit(AssociateCompanyDetailEdit associateCompanyDetailEdit) {
		this.associateCompanyDetailEdit = associateCompanyDetailEdit;
	}

	public List<AssociateCompanyList> getAssociateCompanyList() {
		return associateCompanyList;
	}

	public void setAssociateCompanyList(List<AssociateCompanyList> associateCompanyList) {
		this.associateCompanyList = associateCompanyList;
	}

}
