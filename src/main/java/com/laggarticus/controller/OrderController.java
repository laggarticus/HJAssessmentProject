package com.laggarticus.controller;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laggarticus.data.OrderRec;
import com.laggarticus.service.OrderRecService;

@RestController
public class OrderController {

	@Autowired
	OrderRecService orderService;

	@PostMapping("/saveOrder")
	public ResponseEntity<?> saveOrder(@RequestBody OrderRec newOrder) throws Exception {
		try {
			return ResponseEntity.ok(orderService.saveOrderRec(newOrder));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}

	@GetMapping("/retrieveOrder")
	public ResponseEntity<?> retrieveOrder(@RequestParam String lastName, @RequestParam Long orderNumber) throws Exception {
		try {
			Set<OrderRec> orders = orderService.findOrderRecsByLastName(lastName);

			Iterator it = orders.iterator();

			while (it.hasNext()) {
				OrderRec order = (OrderRec) it.next();
				if (order.getOrdr_id() == orderNumber)
					return ResponseEntity.ok(order);
			}

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Order Not Found");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
