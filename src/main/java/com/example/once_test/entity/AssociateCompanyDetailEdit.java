package com.example.once_test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

//K2029 新增資料 + 修改資料 
@Entity
@Table(name = "associatecompany")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssociateCompanyDetailEdit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMPANY_AIID")
	private Integer companyAiid;

	@Column(name = "DELETECOMPANY")
	private boolean deleteCompany;

	@Column(name = "COMPANY_NAME_EN")
	private String companyNameEN;

	@Column(name = "SHOW_COMPANYNAME_EN")
	private boolean showCompanyNameEN;

	@Column(name = "COMPANY_NAME_JP")
	private String companyNameJP;

	@Column(name = "SHOW_COMPANY_NAME_JP")
	private boolean showCompanyNameJP;

	@Column(name = "COMPANY_NAME_CN")
	private String companyNameCN;

	@Column(name = "SHOW_COMPANY_NAME_CN")
	private boolean showCompanyNameCN;

	@Column(name = "ESTABLISHMENT_DATE_YEAR")
	private String establishmentDateYear;

	@Column(name = "ESTABLISHMENT_DATE_MONTH")
	private String establishmentDateMonth;

	@Column(name = "ESTABLISHMENT_DATE_DATE")
	private String establishmentDateDate;

	@Column(name = "CAPITAL")
	private String capital;

	@Column(name = "WEBSITE")
	private String website;

	@Column(name = "DIRECTOR")
	private String director;

	@Column(name = "JOB_DESCRIPTION")
	private String jobDescription;

	@Column(name = "INQUIRY_EMAIL")
	private String inquiryEmail;

	@Column(name = "CARRIER_EMAIL")
	private String carrierEmail;

	@Column(name = "INVOICE_EMAIL")
	private String invoiceEmail;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "ASSOCIATECOMPANY_CREAT_TIME")
	private String associateCompanyCreatTime;

	@Column(name = "JOINDATE_YEAR")
	private Integer joindateYear;

	@Column(name = "JOINDATE_MONTH")
	private Integer joindateMonth;

	public AssociateCompanyDetailEdit() {

	}

	// 建立資料的建構方法 ; 還沒加入 PAGE 的部分 ;
	public AssociateCompanyDetailEdit(boolean deleteCompany, String companyNameEN, boolean showCompanyNameEN,
			String companyNameJP, boolean showCompanyNameJP, String companyNameCN, boolean showCompanyNameCN,
			String establishmentDateYear, String establishmentDateMonth, String establishmentDateDate, String capital,
			String website, String director, String jobDescription, String inquiryEmail, String carrierEmail,
			String invoiceEmail, String remarks, String associateCompanyCreatTime, Integer joindateYear,
			Integer joindateMonth) {
		this.deleteCompany = deleteCompany;
		this.companyNameEN = companyNameEN;
		this.showCompanyNameEN = showCompanyNameEN;
		this.companyNameJP = companyNameJP;
		this.showCompanyNameJP = showCompanyNameJP;
		this.companyNameCN = companyNameCN;
		this.showCompanyNameCN = showCompanyNameCN;
		this.establishmentDateYear = establishmentDateYear;
		this.establishmentDateMonth = establishmentDateMonth;
		this.establishmentDateDate = establishmentDateDate;
		this.capital = capital;
		this.website = website;
		this.director = director;
		this.jobDescription = jobDescription;
		this.inquiryEmail = inquiryEmail;
		this.carrierEmail = carrierEmail;
		this.invoiceEmail = invoiceEmail;
		this.remarks = remarks;
		this.associateCompanyCreatTime = associateCompanyCreatTime;
		this.joindateYear = joindateYear;
		this.joindateMonth = joindateMonth;
	}

	// 建立資料的建構方法 ; 還沒加入 PAGE 的部分 ;
	public AssociateCompanyDetailEdit(String companyNameEN, boolean showCompanyNameEN, String companyNameJP,
			boolean showCompanyNameJP, String companyNameCN, boolean showCompanyNameCN, String establishmentDateYear,
			String establishmentDateMonth, String establishmentDateDate, String capital, String website,
			String director, String jobDescription, String inquiryEmail, String carrierEmail, String invoiceEmail,
			String remarks, String associateCompanyCreatTime, Integer joindateYear, Integer joindateMonth) {
		this.companyNameEN = companyNameEN;
		this.showCompanyNameEN = showCompanyNameEN;
		this.companyNameJP = companyNameJP;
		this.showCompanyNameJP = showCompanyNameJP;
		this.companyNameCN = companyNameCN;
		this.showCompanyNameCN = showCompanyNameCN;
		this.establishmentDateYear = establishmentDateYear;
		this.establishmentDateMonth = establishmentDateMonth;
		this.establishmentDateDate = establishmentDateDate;
		this.capital = capital;
		this.website = website;
		this.director = director;
		this.jobDescription = jobDescription;
		this.inquiryEmail = inquiryEmail;
		this.carrierEmail = carrierEmail;
		this.invoiceEmail = invoiceEmail;
		this.remarks = remarks;
		this.associateCompanyCreatTime = associateCompanyCreatTime;
		this.joindateYear = joindateYear;
		this.joindateMonth = joindateMonth;
	}

	// 更新公司資料的方法
	public void updateAssociateCompanyDetailEdit(String companyNameEN, boolean showCompanyNameEN, String companyNameJP,
			boolean showCompanyNameJP, String companyNameCN, boolean showCompanyNameCN, String establishmentDateYear,
			String establishmentDateMonth, String establishmentDateDate, String capital, String website,
			String director, String jobDescription, String inquiryEmail, String carrierEmail, String invoiceEmail,
			String remarks) {
		this.companyNameEN = companyNameEN;
		this.showCompanyNameEN = showCompanyNameEN;
		this.companyNameJP = companyNameJP;
		this.showCompanyNameJP = showCompanyNameJP;
		this.companyNameCN = companyNameCN;
		this.showCompanyNameCN = showCompanyNameCN;
		this.establishmentDateYear = establishmentDateYear;
		this.establishmentDateMonth = establishmentDateMonth;
		this.establishmentDateDate = establishmentDateDate;
		this.capital = capital;
		this.website = website;
		this.director = director;
		this.jobDescription = jobDescription;
		this.inquiryEmail = inquiryEmail;
		this.carrierEmail = carrierEmail;
		this.invoiceEmail = invoiceEmail;
		this.remarks = remarks;
	}

	public Integer getCompanyAiid() {
		return companyAiid;
	}

	public void setCompanyAiid(Integer companyAiid) {
		this.companyAiid = companyAiid;
	}

	public boolean isDeleteCompany() {
		return deleteCompany;
	}

	public void setDeleteCompany(boolean deleteCompany) {
		this.deleteCompany = deleteCompany;
	}

	public String getCompanyNameEN() {
		return companyNameEN;
	}

	public void setCompanyNameEN(String companyNameEN) {
		this.companyNameEN = companyNameEN;
	}

	public boolean isShowCompanyNameEN() {
		return showCompanyNameEN;
	}

	public void setShowCompanyNameEN(boolean showCompanyNameEN) {
		this.showCompanyNameEN = showCompanyNameEN;
	}

	public String getCompanyNameJP() {
		return companyNameJP;
	}

	public void setCompanyNameJP(String companyNameJP) {
		this.companyNameJP = companyNameJP;
	}

	public boolean isShowCompanyNameJP() {
		return showCompanyNameJP;
	}

	public void setShowCompanyNameJP(boolean showCompanyNameJP) {
		this.showCompanyNameJP = showCompanyNameJP;
	}

	public String getCompanyNameCN() {
		return companyNameCN;
	}

	public void setCompanyNameCN(String companyNameCN) {
		this.companyNameCN = companyNameCN;
	}

	public boolean isShowCompanyNameCN() {
		return showCompanyNameCN;
	}

	public void setShowCompanyNameCN(boolean showCompanyNameCN) {
		this.showCompanyNameCN = showCompanyNameCN;
	}

	public String getEstablishmentDateYear() {
		return establishmentDateYear;
	}

	public void setEstablishmentDateYear(String establishmentDateYear) {
		this.establishmentDateYear = establishmentDateYear;
	}

	public String getEstablishmentDateMonth() {
		return establishmentDateMonth;
	}

	public void setEstablishmentDateMonth(String establishmentDateMonth) {
		this.establishmentDateMonth = establishmentDateMonth;
	}

	public String getEstablishmentDateDate() {
		return establishmentDateDate;
	}

	public void setEstablishmentDateDate(String establishmentDateDate) {
		this.establishmentDateDate = establishmentDateDate;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getInquiryEmail() {
		return inquiryEmail;
	}

	public void setInquiryEmail(String inquiryEmail) {
		this.inquiryEmail = inquiryEmail;
	}

	public String getCarrierEmail() {
		return carrierEmail;
	}

	public void setCarrierEmail(String carrierEmail) {
		this.carrierEmail = carrierEmail;
	}

	public String getInvoiceEmail() {
		return invoiceEmail;
	}

	public void setInvoiceEmail(String invoiceEmail) {
		this.invoiceEmail = invoiceEmail;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getAssociateCompanyCreatTime() {
		return associateCompanyCreatTime;
	}

	public void setAssociateCompanyCreatTime(String associateCompanyCreatTime) {
		this.associateCompanyCreatTime = associateCompanyCreatTime;
	}

	public Integer getJoindateYear() {
		return joindateYear;
	}

	public void setJoindateYear(Integer joindateYear) {
		this.joindateYear = joindateYear;
	}

	public Integer getJoindateMonth() {
		return joindateMonth;
	}

	public void setJoindateMonth(Integer joindateMonth) {
		this.joindateMonth = joindateMonth;
	}

}
