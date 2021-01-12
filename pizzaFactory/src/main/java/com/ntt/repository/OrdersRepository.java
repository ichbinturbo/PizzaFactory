package com.ntt.repository;

import org.springframework.stereotype.Repository;

import com.ntt.model.domain.CanonicalModelWithBase;
import com.ntt.model.domain.CanonicalModelWithOrderWithTime;
import com.ntt.model.domain.CanonicalModelWithToppings;
import com.ntt.util.CanonicalModelWithBaseUtil;
import com.ntt.util.CanonicalModelWithOrderWithTimeUtil;
import com.ntt.util.CanonicalModelWithToppingsUtil;

@Repository
public class OrdersRepository {
	
	public CanonicalModelWithBase setBaseListPayloadDetailsGetResponse() {
		return CanonicalModelWithBaseUtil.setBaseListPayloadDetails();
	}
	public CanonicalModelWithToppings setToppingsListPayloadDetailsGetResponse() {
		return CanonicalModelWithToppingsUtil.setToppingsListPayloadDetails();
	}
	public CanonicalModelWithOrderWithTime setOrderListPayloadDetailsByOrderIdGetResponse(Integer orderId) {
		return CanonicalModelWithOrderWithTimeUtil.setOrderListPayloadDetailsByOrderId(orderId);
	}
}
