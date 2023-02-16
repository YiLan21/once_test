package com.example.once_test.resository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.once_test.entity.AssociateCompanyDetailEdit;

//K2029 新增資料 + 修改資料 
@Repository
public interface AssociateCompanyDetailEditDao extends JpaRepository<AssociateCompanyDetailEdit, Integer> {

	public Optional<AssociateCompanyDetailEdit> findByCompanyNameJP(String companyNameJP);

	public List<AssociateCompanyDetailEdit> findAllByCompanyNameJP(String companyNameJP);

	public List<AssociateCompanyDetailEdit> findAll();
}
