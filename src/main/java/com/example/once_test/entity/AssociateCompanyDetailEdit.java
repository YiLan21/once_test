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
	@Column(name = "Company_Aiid")
	private Integer companyAiid;

	@Column(name = "Delete_Company")
	private boolean deleteCompany;

	@Column(name = "Company_Name_En")
	private String companyNameEN;

	@Column(name = "Show_Company_Name_En")
	private boolean showCompanyNameEN;

	@Column(name = "Company_Name_Jp")
	private String companyNameJP;

	@Column(name = "Show_Company_Name_Jp")
	private boolean showCompanyNameJP;

	@Column(name = "Company_Name_Cn")
	private String companyNameCN;

	@Column(name = "Show_Company_Name_Cn")
	private boolean showCompanyNameCN;

	@Column(name = "Establishment_Date_Year")
	private String establishmentDateYear;

	@Column(name = "Establishment_Date_Month")
	private String establishmentDateMonth;

	@Column(name = "Establishment_Date_Date")
	private String establishmentDateDate;

	@Column(name = "Capital")
	private String capital;

	@Column(name = "Website")
	private String website;

	@Column(name = "Director")
	private String director;

	@Column(name = "Job_Description")
	private String jobDescription;

	@Column(name = "Inquiry_Email")
	private String inquiryEmail;

	@Column(name = "Carrier_Email")
	private String carrierEmail;

	@Column(name = "Invoice_Email")
	private String invoiceEmail;

	@Column(name = "Remarks")
	private String remarks;

	@Column(name = "ASSOCIATE_COMPANY_CREATE_TIME")
	private String associateCompanyCreatTime;

	public AssociateCompanyDetailEdit() {

	}

	public AssociateCompanyDetailEdit(Integer companyAiid, boolean deleteCompany, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks) {

		this.companyAiid = companyAiid;
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
	}

	public AssociateCompanyDetailEdit(boolean deleteCompany, String companyNameEN, boolean showCompanyNameEN,
			String companyNameJP, boolean showCompanyNameJP, String companyNameCN, boolean showCompanyNameCN,
			String establishmentDateYear, String establishmentDateMonth, String establishmentDateDate, String capital,
			String website, String director, String jobDescription, String inquiryEmail, String carrierEmail,
			String invoiceEmail, String remarks, String associateCompanyCreatTime) {
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
	}

	public AssociateCompanyDetailEdit(Integer companyAiid, boolean deleteCompany, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks,
			String associateCompanyCreatTime) {
		this.companyAiid = companyAiid;
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

}
