package com.laggarticus.repository;

import java.util.LinkedHashSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laggarticus.data.OrderRec;

@Repository
public interface OrderRecRepository extends JpaRepository<OrderRec, Integer> {
	public LinkedHashSet<OrderRec> findOrderRecsByLastName(String lastName);
}
