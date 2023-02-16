package com.example.once_test.ifs;

import com.example.once_test.entity.AssociateCompanyDetailEdit;

//K2029 新增資料 + 修改資料 
public interface AssociateCompanyDetailEditService {

//	建立合作公司資料
	public AssociateCompanyDetailEdit createAssociateCompanyDetailEdit(boolean deleteCompany, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks);

}
