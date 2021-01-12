package com.ntt.util;

import java.util.UUID;

import com.ntt.model.domain.CanonicalModelWithOrderWithTime;
import com.ntt.model.domain.OrderItem;





public class CanonicalModelWithOrderWithTimeUtil {

	public static CanonicalModelWithOrderWithTime setOrderListPayloadDetailsByOrderId(Integer orderId) {
		CanonicalModelWithOrderWithTime canonicalModelWithOrdrWithTime = new CanonicalModelWithOrderWithTime();
		canonicalModelWithOrdrWithTime.setCorrelationId(UUID.randomUUID());
		canonicalModelWithOrdrWithTime.setSessionId(UUID.randomUUID());

	    OrderItem payload = setOrderDetails(orderId);
	    canonicalModelWithOrdrWithTime.setPayload(payload);

		return canonicalModelWithOrdrWithTime;

	}

public static OrderItem setOrderDetails(Integer orderId) {
		OrderItem item = new OrderItem();
		item.setOrderId(orderId);
		item.setTime(100);
		
		return item;
	}

}
