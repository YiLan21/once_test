package com.example.once_test.resository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.once_test.entity.AssociateCompanyDetailEdit;

//K2029 �s�W��� + �ק��� 
@Repository
public interface AssociateCompanyDetailEditDao extends JpaRepository<AssociateCompanyDetailEdit, Integer> {
	// �p�G�ݭn�Ƨ� �i�H�令�γo��
	public List<AssociateCompanyDetailEdit> findAllByOrderByAssociateCompanyCreatTimeAsc();

	
	
	public Page<AssociateCompanyDetailEdit> findAll(Pageable pageable);
}
