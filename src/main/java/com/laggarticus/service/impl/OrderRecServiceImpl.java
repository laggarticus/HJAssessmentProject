package com.laggarticus.service.impl;

import java.util.LinkedHashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laggarticus.data.OrderRec;
import com.laggarticus.repository.OrderRecRepository;
import com.laggarticus.service.OrderRecService;

@Service
public class OrderRecServiceImpl implements OrderRecService {
	
	@Autowired OrderRecRepository service;

	@Override
	public LinkedHashSet<OrderRec> findOrderRecsByLastName(String lastName) {
		return service.findOrderRecsByLastName(lastName);
	}

	@Override
	public Long saveOrderRec(OrderRec newOrder) {
		return service.save(newOrder).getOrdr_id();
	}

	
}
