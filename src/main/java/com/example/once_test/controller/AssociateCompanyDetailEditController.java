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

		// 回傳到"成功"前端顯示, 如果不行再改成 null
		return new AssociateCompanyRes(associateCompanyDetailEdit, "成功");
	}
	// 建立資料的畫面 K2029
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

		// 回傳到"成功"前端顯示, 如果不行再改成 null
		return new AssociateCompanyRes("成功");

	}

	// 刪除資料 K2028
	@PostMapping(value = "/api/deleteAssociateCompanyDetailEditTest")
	public AssociateCompanyRes deleteAssociateCompany(@RequestBody AssociateCompanyReq associateCompanyReq) {

		AssociateCompanyDetailEdit associateCompanyDetailEdit = associateCompanyDetailEditService
				.deleteAssociateCompanyList(associateCompanyReq.getCompanyAiid());

		// 回傳到"成功"前端顯示, 如果不行再改成 null
		return new AssociateCompanyRes(associateCompanyDetailEdit, "成功");

	}

	// 更新資料的畫面 修改資料K2029
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

		// 回傳到"成功"前端顯示, 如果不行再改成 null
		return new AssociateCompanyRes(associateCompanyDetailEdit, "成功");
	}

	// 顯示查詢的公司info K2030 顯示個別明細

	@PostMapping(value = "/api/associateCompanyDetailPreview")
	public AssociateCompanyRes associateCompanyDetailPreview(@RequestBody AssociateCompanyReq associateCompanyReq) {

		return associateCompanyDetailEditService.associateCompanyDetailPreview(associateCompanyReq.getCompanyAiid());
	}

	// 更新資料的畫面 修改資料K2029
	@PostMapping(value = "/api/getAssociateCompanyListByReq")
	public AssociateCompanyRes getAssociateCompanyListByReq(@RequestBody AssociateCompanyReq associateCompanyReq) {
		return associateCompanyDetailEditService.getAssociateCompanyListByReq(associateCompanyReq.getJoindateYear(),
				associateCompanyReq.getJoindateMonth(), associateCompanyReq.getAssociateCompanyName());
	}

	// 顯示所有合作公司 K2028 搜尋資料
	@PostMapping(value = "/api/getAllAssociateCompanyListByReq")
	public AssociateCompanyRes getAllAssociateCompanyListByReq() {
		return associateCompanyDetailEditService.getAllAssociateCompanyListByReq();
	}

}
