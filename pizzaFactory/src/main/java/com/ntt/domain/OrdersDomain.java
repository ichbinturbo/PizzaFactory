package com.ntt.domain;

import com.ntt.model.domain.CanonicalModelWithBase;
import com.ntt.model.domain.CanonicalModelWithOrderWithTime;
import com.ntt.model.domain.CanonicalModelWithToppings;
import com.ntt.repository.OrdersRepository;


public class OrdersDomain {
	
	private final OrdersRepository ordersRepository;


	public OrdersDomain(OrdersRepository ordersRepository) {
		this.ordersRepository = ordersRepository;
	}

	public CanonicalModelWithBase setBaseListPayloadDetails() {
		return ordersRepository.setBaseListPayloadDetailsGetResponse();
	}
	public CanonicalModelWithToppings setToppingsListPayloadDetails() {
		return ordersRepository.setToppingsListPayloadDetailsGetResponse();
	}
	public CanonicalModelWithOrderWithTime setOrdersListPayloadDetailsByOrderId(Integer orderId) {
		return ordersRepository.setOrderListPayloadDetailsByOrderIdGetResponse(orderId);
	}
	
}
