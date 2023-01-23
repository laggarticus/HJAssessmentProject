package com.laggarticus.service;

import java.util.LinkedHashSet;

import org.springframework.stereotype.Service;

import com.laggarticus.data.OrderRec;

@Service
public interface OrderRecService {
	public LinkedHashSet<OrderRec> findOrderRecsByLastName(String lastName);
	public Long saveOrderRec(OrderRec newOrder);
}
