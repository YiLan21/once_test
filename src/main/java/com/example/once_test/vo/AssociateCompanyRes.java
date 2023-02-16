package com.example.once_test.vo;

import com.example.once_test.entity.AssociateCompanyDetailEdit;

public class AssociateCompanyRes {

	private AssociateCompanyDetailEdit associateCompanyDetailEdit;

	private String message;

	public AssociateCompanyRes() {

	}

	public AssociateCompanyRes(AssociateCompanyDetailEdit associateCompanyDetailEdit, String message) {

		this.associateCompanyDetailEdit = associateCompanyDetailEdit;
		this.message = message;
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

}
