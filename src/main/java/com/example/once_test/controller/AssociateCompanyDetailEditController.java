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

//K2029 �s�W��� + �ק��� 
@CrossOrigin
@RestController
public class AssociateCompanyDetailEditController {

	@Autowired
	private AssociateCompanyDetailEditService associateCompanyDetailEditService;

	@PostMapping(value = "/api/createAndUpdateCompanyDetailEdit")
	public AssociateCompanyRes createAndUpdateCompanyDetailEdit(@RequestBody AssociateCompanyReq associateCompanyReq) {
		AssociateCompanyDetailEdit associateCompanyDetailEdit = associateCompanyDetailEditService
				.createAndUpdateCompanyDetailEdit(
						associateCompanyReq.getCompanyAiid(),
						associateCompanyReq.getCompanyNameEN(),
						associateCompanyReq.isShowCompanyNameEN(),
						associateCompanyReq.getCompanyNameJP(),
						associateCompanyReq.isShowCompanyNameJP(), 
						associateCompanyReq.getCompanyNameCN(),
						associateCompanyReq.isShowCompanyNameCN(),
						associateCompanyReq.getEstablishmentDateYear(),
						associateCompanyReq.getEstablishmentDateMonth(),
						associateCompanyReq.getEstablishmentDateDate(),
						associateCompanyReq.getCapital(), 
						associateCompanyReq.getWebsite(),
						associateCompanyReq.getDirector(),
						associateCompanyReq.getJobDescription(),
						associateCompanyReq.getInquiryEmail(), 
						associateCompanyReq.getCarrierEmail(),
						associateCompanyReq.getInvoiceEmail(), 
						associateCompanyReq.getRemarks());

		// �^�Ǩ�"���\"�e�����, �p�G����A�令 null
		return new AssociateCompanyRes(associateCompanyDetailEdit, "���\");
	}
	// �إ߸�ƪ��e�� K2029
	@PostMapping(value = "/api/createAssociateCompanyDetailEditTest")
	public AssociateCompanyRes createAssociateCompany(@RequestBody AssociateCompanyReq associateCompanyReq) {

		AssociateCompanyDetailEdit associateCompanyDetailEdit = associateCompanyDetailEditService
				.createAssociateCompanyDetailEdit(
						associateCompanyReq.isDeleteCompany(),
						associateCompanyReq.getCompanyNameEN(), 
						associateCompanyReq.isShowCompanyNameEN(),
						associateCompanyReq.getCompanyNameJP(), 
						associateCompanyReq.isShowCompanyNameJP(),
						associateCompanyReq.getCompanyNameCN(), 
						associateCompanyReq.isShowCompanyNameCN(),
						associateCompanyReq.getEstablishmentDateYear(), 
						associateCompanyReq.getEstablishmentDateMonth(),
						associateCompanyReq.getEstablishmentDateDate(),
						associateCompanyReq.getCapital(),
						associateCompanyReq.getWebsite(), 
						associateCompanyReq.getDirector(),
						associateCompanyReq.getJobDescription(), 
						associateCompanyReq.getInquiryEmail(),
						associateCompanyReq.getCarrierEmail(),
						associateCompanyReq.getInvoiceEmail(),
						associateCompanyReq.getRemarks());

		// �^�Ǩ�"���\"�e�����, �p�G����A�令 null
		return new AssociateCompanyRes("���\");

	}

	// �R����� K2028
	@PostMapping(value = "/api/deleteAssociateCompanyDetailEditTest")
	public AssociateCompanyRes deleteAssociateCompany(@RequestBody AssociateCompanyReq associateCompanyReq) {

		AssociateCompanyDetailEdit associateCompanyDetailEdit = associateCompanyDetailEditService
				.deleteAssociateCompanyList(associateCompanyReq.getCompanyAiid());

		// �^�Ǩ�"���\"�e�����, �p�G����A�令 null
		return new AssociateCompanyRes(associateCompanyDetailEdit, "���\");

	}

	// ��s��ƪ��e�� �ק���K2029
	@PostMapping(value = "/api/updateAssociateCompanyDetailEditTest")
	public AssociateCompanyRes updateAssociateCompany(@RequestBody AssociateCompanyReq associateCompanyReq) {

		AssociateCompanyDetailEdit associateCompanyDetailEdit = associateCompanyDetailEditService
				.updateAssociateCompany(
						associateCompanyReq.getCompanyAiid(), 
						associateCompanyReq.getCompanyNameEN(),
						associateCompanyReq.isShowCompanyNameEN(), 
						associateCompanyReq.getCompanyNameJP(),
						associateCompanyReq.isShowCompanyNameJP(),
						associateCompanyReq.getCompanyNameCN(),
						associateCompanyReq.isShowCompanyNameCN(), 
						associateCompanyReq.getEstablishmentDateYear(),
						associateCompanyReq.getEstablishmentDateMonth(),
						associateCompanyReq.getEstablishmentDateDate(),
						associateCompanyReq.getCapital(), 
						associateCompanyReq.getWebsite(),
						associateCompanyReq.getDirector(), 
						associateCompanyReq.getJobDescription(),
						associateCompanyReq.getInquiryEmail(),
						associateCompanyReq.getCarrierEmail(),
						associateCompanyReq.getInvoiceEmail(), 
						associateCompanyReq.getRemarks());

		// �^�Ǩ�"���\"�e�����, �p�G����A�令 null
		return new AssociateCompanyRes(associateCompanyDetailEdit, "���\");
	}

	// ��ܬd�ߪ����qinfo K2030 ��ܭӧO����

	@PostMapping(value = "/api/associateCompanyDetailPreview")
	public AssociateCompanyRes associateCompanyDetailPreview(@RequestBody AssociateCompanyReq associateCompanyReq) {

		return associateCompanyDetailEditService.associateCompanyDetailPreview(associateCompanyReq.getCompanyAiid());
	}

	// ��s��ƪ��e�� �ק���K2029
	@PostMapping(value = "/api/getAssociateCompanyListByReq")
	public AssociateCompanyRes getAssociateCompanyListByReq(@RequestBody AssociateCompanyReq associateCompanyReq) {
		return associateCompanyDetailEditService.getAssociateCompanyListByReq(associateCompanyReq.getJoindateYear(),
				associateCompanyReq.getJoindateMonth(), associateCompanyReq.getAssociateCompanyName());
	}

	// ��ܩҦ��X�@���q K2028 �j�M���
	@PostMapping(value = "/api/getAllAssociateCompanyListByReq")
	public AssociateCompanyRes getAllAssociateCompanyListByReq() {
		return associateCompanyDetailEditService.getAllAssociateCompanyListByReq();
	}

}
