package com.ntt.controller;

import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.domain.OrderDomain;
import com.ntt.domain.OrdersDomain;
import com.ntt.model.domain.CanonicalModelWithBase;

@RestController
public class OrdersController implements IOrdersApi {

	@Autowired
	private HttpServletRequest httpServletRequest;
	
	@Autowired
	private OrdersDomain ordersDomain;
	
	@Override
	public  CompletableFuture<ResponseEntity<CanonicalModelWithBase>> getAllBases() {
		CanonicalModelWithBase getResponse = ordersDomain;
		log.info(getResponse.toString());
		return CompletableFuture
				.completedFuture(new ResponseEntity<CanonicalModelWithBase>(getResponse, HttpStatus.OK));

}
