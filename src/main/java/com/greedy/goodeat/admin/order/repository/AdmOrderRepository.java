package com.greedy.goodeat.admin.order.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greedy.goodeat.common.entity.Order;


public interface AdmOrderRepository extends JpaRepository<Order, Integer>{

	@EntityGraph(attributePaths = {"orderProduct"})
	@Query("SELECT o " +
			"FROM Order o " + 
			"WHERE o.orderNo LIKE '%' || :searchValue || '%'")
	Page<Order> finBySearchValue(String searchValue, Pageable pageable);



}
