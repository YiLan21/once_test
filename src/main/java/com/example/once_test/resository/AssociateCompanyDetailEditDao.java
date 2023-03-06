package com.example.once_test.resository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.once_test.entity.AssociateCompanyDetailEdit;

//K2029 新增資料 + 修改資料 
@Repository
public interface AssociateCompanyDetailEditDao extends JpaRepository<AssociateCompanyDetailEdit, Integer> {
	// 如果需要排序 可以改成用這個
	public List<AssociateCompanyDetailEdit> findAllByOrderByAssociateCompanyCreatTimeAsc();

	
	
	public Page<AssociateCompanyDetailEdit> findAll(Pageable pageable);
}
