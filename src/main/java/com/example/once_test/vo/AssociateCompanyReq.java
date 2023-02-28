package com.example.once_test.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AssociateCompanyReq {

	private Integer companyAiid;

	private boolean deleteCompany;

	private String companyNameEN;

	private boolean showCompanyNameEN;

	private String companyNameJP;

	private boolean showCompanyNameJP;

	private String companyNameCN;

	private boolean showCompanyNameCN;

	private String establishmentDateYear;

	private String establishmentDateMonth;

	private String establishmentDateDate;

	private String capital;

	private String website;

	private String director;

	private String jobDescription;

	private String inquiryEmail;

	private String carrierEmail;

	private String invoiceEmail;

	private String remarks;

	private String associateCompanyCreatTime;

	private String AssociateCompanyName;

	private Integer joindateYear;
	
	private Integer joindateMonth;

	public AssociateCompanyReq() {

	}

	public boolean isDeleteCompany() {
		return deleteCompany;
	}

	public void setDeleteCompany(boolean deleteCompany) {
		this.deleteCompany = deleteCompany;
	}

	public Integer getCompanyAiid() {
		return companyAiid;
	}

	public void setCompanyAiid(Integer companyAiid) {
		this.companyAiid = companyAiid;
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

	public String getAssociateCompanyName() {
		return AssociateCompanyName;
	}

	public void setAssociateCompanyName(String associateCompanyName) {
		AssociateCompanyName = associateCompanyName;
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
