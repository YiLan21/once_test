package com.example.once_test.vo;

public class AssociateCompanyList {

	private Integer companyAiid;

	// AssociateCompanyName
	private String companyNameJP;

	// ªÀªø¦WºÙ
	private String director;

	private String associateCompanyCreatTime;

	public AssociateCompanyList() {

	}

	public AssociateCompanyList(Integer companyAiid, String companyNameJP, String director,
			String associateCompanyCreatTime) {
		this.companyAiid = companyAiid;
		this.companyNameJP = companyNameJP;
		this.director = director;
		this.associateCompanyCreatTime = associateCompanyCreatTime;
	}

	public Integer getCompanyAiid() {
		return companyAiid;
	}

	public void setCompanyAiid(Integer companyAiid) {
		this.companyAiid = companyAiid;
	}

	public String getCompanyNameJP() {
		return companyNameJP;
	}

	public void setCompanyNameJP(String companyNameJP) {
		this.companyNameJP = companyNameJP;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getAssociateCompanyCreatTime() {
		return associateCompanyCreatTime;
	}

	public void setAssociateCompanyCreatTime(String associateCompanyCreatTime) {
		this.associateCompanyCreatTime = associateCompanyCreatTime;
	}

}
