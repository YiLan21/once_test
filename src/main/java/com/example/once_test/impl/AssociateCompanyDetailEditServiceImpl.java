package com.example.once_test.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.once_test.entity.AssociateCompanyDetailEdit;
import com.example.once_test.ifs.AssociateCompanyDetailEditService;
import com.example.once_test.resository.AssociateCompanyDetailEditDao;
import com.example.once_test.vo.AssociateCompanyList;
import com.example.once_test.vo.AssociateCompanyRes;

//K2029 �s�W��� + �ק��� 
@Service
public class AssociateCompanyDetailEditServiceImpl implements AssociateCompanyDetailEditService {

	@Autowired
	private AssociateCompanyDetailEditDao associateCompanyDetailEditDao;

	// �إ�& �s�W��� �X��
	public AssociateCompanyDetailEdit createAndUpdateCompanyDetailEdit(Integer companyAiid, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks) {
		// �p�GcompanyAiid ��J�O
//			if(StringUtils.isEmpty(String.valueOf(companyAiid))) {
		if (companyAiid == null) {
			AssociateCompanyDetailEdit associateCompanyDetailEdit = new AssociateCompanyDetailEdit(companyNameEN,
					showCompanyNameEN, companyNameJP, showCompanyNameJP, companyNameCN, showCompanyNameCN,
					establishmentDateYear, establishmentDateMonth, establishmentDateDate, capital, website, director,
					jobDescription, inquiryEmail, carrierEmail, invoiceEmail, remarks, LocalDate.now().toString(),
					LocalDate.now().getYear(), LocalDate.now().getMonthValue());

			return associateCompanyDetailEditDao.save(associateCompanyDetailEdit);
		} else {
			Optional<AssociateCompanyDetailEdit> companyOp = associateCompanyDetailEditDao.findById(companyAiid);

			AssociateCompanyDetailEdit associateCompanyDetailEdit = companyOp.get();

			associateCompanyDetailEdit.updateAssociateCompanyDetailEdit(companyNameEN, showCompanyNameEN, companyNameJP,
					showCompanyNameJP, companyNameCN, showCompanyNameCN, establishmentDateYear, establishmentDateMonth,
					establishmentDateDate, capital, website, director, jobDescription, inquiryEmail, carrierEmail,
					invoiceEmail, remarks);

			return associateCompanyDetailEditDao.save(associateCompanyDetailEdit);
		}

	}

	// �s�W��� :
	@Override
	public AssociateCompanyDetailEdit createAssociateCompanyDetailEdit(boolean deleteCompany, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks) {

		AssociateCompanyDetailEdit associateCompanyDetailEdit = new AssociateCompanyDetailEdit(deleteCompany,
				companyNameEN, showCompanyNameEN, companyNameJP, showCompanyNameJP, companyNameCN, showCompanyNameCN,
				establishmentDateYear, establishmentDateMonth, establishmentDateDate, capital, website, director,
				jobDescription, inquiryEmail, carrierEmail, invoiceEmail, remarks, LocalDate.now().toString(),
				LocalDate.now().getYear(), LocalDate.now().getMonthValue());

		return associateCompanyDetailEditDao.save(associateCompanyDetailEdit);
	}

	// �ק�X�@���q��� K2029
	@Override
	public AssociateCompanyDetailEdit updateAssociateCompany(Integer companyAiid, String companyNameEN,
			boolean showCompanyNameEN, String companyNameJP, boolean showCompanyNameJP, String companyNameCN,
			boolean showCompanyNameCN, String establishmentDateYear, String establishmentDateMonth,
			String establishmentDateDate, String capital, String website, String director, String jobDescription,
			String inquiryEmail, String carrierEmail, String invoiceEmail, String remarks) {

		Optional<AssociateCompanyDetailEdit> companyOp = associateCompanyDetailEditDao.findById(companyAiid);

		AssociateCompanyDetailEdit associateCompanyDetailEdit = companyOp.get();

		associateCompanyDetailEdit.updateAssociateCompanyDetailEdit(companyNameEN, showCompanyNameEN, companyNameJP,
				showCompanyNameJP, companyNameCN, showCompanyNameCN, establishmentDateYear, establishmentDateMonth,
				establishmentDateDate, capital, website, director, jobDescription, inquiryEmail, carrierEmail,
				invoiceEmail, remarks);

		return associateCompanyDetailEditDao.save(associateCompanyDetailEdit);
	}

	// �R����� K2028
	@Override
	public AssociateCompanyDetailEdit deleteAssociateCompanyList(Integer companyAiid) {

		Optional<AssociateCompanyDetailEdit> companyOp = associateCompanyDetailEditDao.findById(companyAiid);

		AssociateCompanyDetailEdit associateCompanyDetailEdit = companyOp.get();

		associateCompanyDetailEdit.setDeleteCompany(true);

		return associateCompanyDetailEditDao.save(associateCompanyDetailEdit);
	}

	// ��ܬd�ߪ����qinfo K2030 ��ܭӧO����
	@Override
	public AssociateCompanyRes associateCompanyDetailPreview(Integer companyAiid) {
		Optional<AssociateCompanyDetailEdit> companyOp = associateCompanyDetailEditDao.findById(companyAiid);

		AssociateCompanyDetailEdit associateCompanyDetailEdit = companyOp.get();
		return new AssociateCompanyRes(associateCompanyDetailEdit);
	}

	// �d�߲ŦX ����X�@���q����� K2028 �j�M���
	@Override
	public AssociateCompanyRes getAssociateCompanyListByReq(Integer joindateYear, Integer joindateMonth,
			String associateCompanyName) {

		// vo.AssociateCompanyList
		// (companyAiid,companyNameJP,director,associateCompanyCreatTime)
		List<AssociateCompanyList> associateCompanyList = new ArrayList<>();

		List<AssociateCompanyDetailEdit> associateCompanyListAll = associateCompanyDetailEditDao.findAll();

		// �S����J�~
		if (!StringUtils.hasText(associateCompanyName)) {
			// ��J�~ ��
			if (joindateYear != null && joindateMonth != null) {
				for (AssociateCompanyDetailEdit item : associateCompanyListAll) {
					if (item.getJoindateYear().equals(joindateYear) && item.getJoindateMonth().equals(joindateMonth)
							&& item.isDeleteCompany() != true) {

						AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
								item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
						associateCompanyList.add(associateCompany);
					}
				}
				return new AssociateCompanyRes(associateCompanyList);
			}
			// ��J�~
			else if (joindateYear != null && joindateMonth == null) {
				for (AssociateCompanyDetailEdit item : associateCompanyListAll) {

					if (item.getJoindateYear().equals(joindateYear) && item.isDeleteCompany() != true) {

						AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
								item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
						associateCompanyList.add(associateCompany);
					}
				}
				return new AssociateCompanyRes(associateCompanyList);

			}
			// ��J��
			else if (joindateYear == null && joindateMonth != null) {
				for (AssociateCompanyDetailEdit item : associateCompanyListAll) {

					if (item.getJoindateMonth().equals(joindateMonth) && item.isDeleteCompany() != true) {

						AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
								item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
						associateCompanyList.add(associateCompany);
					}
				}
				return new AssociateCompanyRes(associateCompanyList);

			}
			//
			else if (joindateYear == null && joindateMonth == null) {
				for (AssociateCompanyDetailEdit item : associateCompanyListAll) {
					if (item.isDeleteCompany() != true) {
						AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
								item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
						associateCompanyList.add(associateCompany);
					}
				}
				return new AssociateCompanyRes(associateCompanyList);
			}
			// �H�U���� associateCompanyName
		} else if (StringUtils.hasText(associateCompanyName)) {

//			if (item.getJoindateMonth().equals(joindateMonth)
//					 && item.isDeleteCompany() != true

			if (joindateYear != null && joindateMonth != null) {
				for (AssociateCompanyDetailEdit item : associateCompanyListAll) {
					if (item.getJoindateYear().equals(joindateYear) && item.getJoindateMonth().equals(joindateMonth)
							&& item.isDeleteCompany() != true && (item.getCompanyNameJP().contains(associateCompanyName)
									|| item.getDirector().contains(associateCompanyName))) {

						AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
								item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
						associateCompanyList.add(associateCompany);
					}
				}
				return new AssociateCompanyRes(associateCompanyList);
			}
			// ��J�~
			else if (joindateYear != null && joindateMonth == null) {
				for (AssociateCompanyDetailEdit item : associateCompanyListAll) {

					if (item.getJoindateYear().equals(joindateYear) && item.isDeleteCompany() != true
							&& (item.getCompanyNameJP().contains(associateCompanyName)
									|| item.getDirector().contains(associateCompanyName))) {

						AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
								item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
						associateCompanyList.add(associateCompany);
					}
				}
				return new AssociateCompanyRes(associateCompanyList);

			}
			// ��J��
			else if (joindateYear == null && joindateMonth != null) {
				for (AssociateCompanyDetailEdit item : associateCompanyListAll) {

					if (item.getJoindateMonth().equals(joindateMonth) && item.isDeleteCompany() != true
							&& (item.getCompanyNameJP().contains(associateCompanyName)
									|| item.getDirector().contains(associateCompanyName))) {

						AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
								item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
						associateCompanyList.add(associateCompany);
					}
				}
				return new AssociateCompanyRes(associateCompanyList);

			}
			//
			else if (joindateYear == null && joindateMonth == null) {
				for (AssociateCompanyDetailEdit item : associateCompanyListAll) {
					if (item.isDeleteCompany() != true && (item.getCompanyNameJP().contains(associateCompanyName)
							|| item.getDirector().contains(associateCompanyName))) {

						AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
								item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
						associateCompanyList.add(associateCompany);
					}
				}
				return new AssociateCompanyRes(associateCompanyList);
			}

		}
		return null;

	}

	// ��ܩҦ��X�@���q K2028 �j�M���
	@Override
	public AssociateCompanyRes getAllAssociateCompanyListByReq() {

		List<AssociateCompanyDetailEdit> associateCompanyListAll = associateCompanyDetailEditDao
				.findAllByOrderByAssociateCompanyCreatTimeAsc();

		List<AssociateCompanyList> associateCompanyList = new ArrayList<>();
		for (AssociateCompanyDetailEdit item : associateCompanyListAll) {

			if (item.isDeleteCompany() != true) {
				AssociateCompanyList associateCompany = new AssociateCompanyList(item.getCompanyAiid(),
						item.getCompanyNameJP(), item.getDirector(), item.getAssociateCompanyCreatTime());
				associateCompanyList.add(associateCompany);
			}
		}
		return new AssociateCompanyRes(associateCompanyList);
	}

}
