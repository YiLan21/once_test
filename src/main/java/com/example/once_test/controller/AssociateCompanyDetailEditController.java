package com.example.once_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.once_test.entity.AssociateCompanyDetailEdit;
import com.example.once_test.ifs.AssociateCompanyDetailEditService;
import com.example.once_test.vo.AssociateCompanyReq;
import com.example.once_test.vo.AssociateCompanyRes;

//K2029 新增資料 + 修改資料 
@CrossOrigin
@RestController
public class AssociateCompanyDetailEditController {

	@Autowired
	private AssociateCompanyDetailEditService associateCompanyDetailEditService;

	@PostMapping(value = "/api/createAssociateCompanyDetailEditTest")
	public AssociateCompanyRes createAssociateCompany(@RequestBody AssociateCompanyReq associateCompanyReq) {

		AssociateCompanyDetailEdit associateCompanyDetailEdit = associateCompanyDetailEditService
				.createAssociateCompanyDetailEdit(associateCompanyReq.isDeleteCompany(),
						associateCompanyReq.getCompanyNameEN(), associateCompanyReq.isShowCompanyNameEN(),
						associateCompanyReq.getCompanyNameJP(), associateCompanyReq.isShowCompanyNameJP(),
						associateCompanyReq.getCompanyNameCN(), associateCompanyReq.isShowCompanyNameCN(),
						associateCompanyReq.getEstablishmentDateYear(), associateCompanyReq.getEstablishmentDateMonth(),
						associateCompanyReq.getEstablishmentDateDate(), associateCompanyReq.getCapital(),
						associateCompanyReq.getWebsite(), associateCompanyReq.getDirector(),
						associateCompanyReq.getJobDescription(), associateCompanyReq.getInquiryEmail(),
						associateCompanyReq.getCarrierEmail(), associateCompanyReq.getInvoiceEmail(),
						associateCompanyReq.getRemarks());

		return new AssociateCompanyRes(associateCompanyDetailEdit, "成功");

	}

}
