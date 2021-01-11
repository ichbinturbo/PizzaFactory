package com.ntt.domain;

import com.ntt.model.domain.CanonicalModelWithBase;
import com.ntt.repository.OrdersRepository;


public class OrdersDomain {
	
	private final OrdersRepository ordersRepository;


	public OrdersDomain(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}

	public CanonicalModelWithBase setBaseListPayloadDetailsByName(String BaseName) {
		return ordersRepository.setBaseListPayloadDetailsByNameGetResponse(BaseName);
	}
}
