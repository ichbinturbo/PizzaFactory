package com.ntt.controller;

import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.domain.OrdersDomain;
import com.ntt.model.domain.CanonicalModelWithBase;
import com.ntt.model.domain.CanonicalModelWithOrderWithTime;
import com.ntt.model.domain.CanonicalModelWithToppings;

import io.swagger.annotations.ApiParam;

@RestController
public class OrdersController implements IOrdersApi {

	@Autowired
	private HttpServletRequest httpServletRequest;

	@Autowired
	private OrdersDomain ordersDomain;

	@Override
	public CompletableFuture<ResponseEntity<CanonicalModelWithBase>> getAllBases() {
		CanonicalModelWithBase getResponse = ordersDomain.setBaseListPayloadDetails();
		log.info(getResponse.toString());
		return CompletableFuture
				.completedFuture(new ResponseEntity<CanonicalModelWithBase>(getResponse, HttpStatus.OK));

	}

	@Override
	public CompletableFuture<ResponseEntity<CanonicalModelWithToppings>> getAllToppings() {
		CanonicalModelWithToppings getResponse = ordersDomain.setToppingsListPayloadDetails();
		log.info(getResponse.toString());
		return CompletableFuture
				.completedFuture(new ResponseEntity<CanonicalModelWithToppings>(getResponse, HttpStatus.OK));
	}

	@Override
	public CompletableFuture<ResponseEntity<CanonicalModelWithOrderWithTime>> getOrderByOrderId(
			@ApiParam(value = "ID of order/s whose order the request will return", required = true) @PathVariable("orderId") Integer orderId) {
		CanonicalModelWithOrderWithTime getResponse = ordersDomain.setOrdersListPayloadDetailsByOrderId(orderId);
		log.info(getResponse.toString());
		return CompletableFuture
				.completedFuture(new ResponseEntity<CanonicalModelWithOrderWithTime>(getResponse, HttpStatus.OK));
	}
	
	
	
}
