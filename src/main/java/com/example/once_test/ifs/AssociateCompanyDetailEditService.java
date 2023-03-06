package com.example.once_test.ifs;

import com.example.once_test.entity.AssociateCompanyDetailEdit;
import com.example.once_test.vo.AssociateCompanyRes;

//K2029 �s�W��� + �ק��� 
public interface AssociateCompanyDetailEditService {

	// �إ�& �s�W��� �X��
	public AssociateCompanyDetailEdit createAndUpdateCompanyDetailEdit(Integer companyAiid, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks);

	// �إߦX�@���q��� K2029 �إ߸��
	public AssociateCompanyDetailEdit createAssociateCompanyDetailEdit(boolean deleteCompany, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks);

	// �ק�X�@���q��� K2029 �ק���
	public AssociateCompanyDetailEdit updateAssociateCompany(Integer companyAiid, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks);

	// �R���X�@���q��� ����Jid�O�]���e�ݷ|�j ���o���W�r��id 2028 �R�����
	public AssociateCompanyDetailEdit deleteAssociateCompanyList(Integer companyAiid);

	// �d�߲ŦX ����X�@���q����� K2028 �j�M���
	public AssociateCompanyRes getAssociateCompanyListByReq(Integer joindateYear, Integer joindateMonth,
			String associateCompanyName);

	// ��ܩҦ��X�@���q K2028 �j�M���
	public AssociateCompanyRes getAllAssociateCompanyListByReq();

	public AssociateCompanyRes getAllAssociateCompanyListByReqByPage(int page);

	// ��ܬd�ߪ����qinfo K2030 ��ܭӧO����
	public AssociateCompanyRes associateCompanyDetailPreview(Integer companyAiid);

}
