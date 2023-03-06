package com.example.once_test.ifs;

import com.example.once_test.entity.AssociateCompanyDetailEdit;
import com.example.once_test.vo.AssociateCompanyRes;

//K2029 新增資料 + 修改資料 
public interface AssociateCompanyDetailEditService {

	// 建立& 新增資料 合併
	public AssociateCompanyDetailEdit createAndUpdateCompanyDetailEdit(Integer companyAiid, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks);

	// 建立合作公司資料 K2029 建立資料
	public AssociateCompanyDetailEdit createAssociateCompanyDetailEdit(boolean deleteCompany, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks);

	// 修改合作公司資料 K2029 修改資料
	public AssociateCompanyDetailEdit updateAssociateCompany(Integer companyAiid, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks);

	// 刪除合作公司資料 指輸入id是因為前端會綁 取得的名字的id 2028 刪除資料
	public AssociateCompanyDetailEdit deleteAssociateCompanyList(Integer companyAiid);

	// 查詢符合 條件合作公司的資料 K2028 搜尋資料
	public AssociateCompanyRes getAssociateCompanyListByReq(Integer joindateYear, Integer joindateMonth,
			String associateCompanyName);

	// 顯示所有合作公司 K2028 搜尋資料
	public AssociateCompanyRes getAllAssociateCompanyListByReq();

	public AssociateCompanyRes getAllAssociateCompanyListByReqByPage(int page);

	// 顯示查詢的公司info K2030 顯示個別明細
	public AssociateCompanyRes associateCompanyDetailPreview(Integer companyAiid);

}
