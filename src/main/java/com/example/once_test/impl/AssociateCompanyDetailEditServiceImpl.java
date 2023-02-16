package com.example.once_test.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.once_test.entity.AssociateCompanyDetailEdit;
import com.example.once_test.ifs.AssociateCompanyDetailEditService;
import com.example.once_test.resository.AssociateCompanyDetailEditDao;

//K2029 新增資料 + 修改資料 
@Service
public class AssociateCompanyDetailEditServiceImpl implements AssociateCompanyDetailEditService {

	@Autowired
	private AssociateCompanyDetailEditDao associateCompanyDetailEditDao;

	// 新增資料 :
	@Override
	public AssociateCompanyDetailEdit createAssociateCompanyDetailEdit(boolean deleteCompany, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks) {
		
		
		AssociateCompanyDetailEdit associateCompanyDetailEdit = new AssociateCompanyDetailEdit(deleteCompany,
				companyNameEN, showCompanyNameEN, companyNameJP, showCompanyNameJP, companyNameCN, showCompanyNameCN,
				establishmentDateYear, establishmentDateMonth, establishmentDateDate, capital, website, director,
				jobDescription, inquiryEmail, carrierEmail, invoiceEmail, remarks, LocalDate.now().toString());

		return associateCompanyDetailEditDao.save(associateCompanyDetailEdit);
	}

	//

}
