package com.example.once_test.ifs;

import com.example.once_test.entity.AssociateCompanyDetailEdit;

//K2029 �s�W��� + �ק��� 
public interface AssociateCompanyDetailEditService {

//	�إߦX�@���q���
	public AssociateCompanyDetailEdit createAssociateCompanyDetailEdit(boolean deleteCompany, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks);

}
