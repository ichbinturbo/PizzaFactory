package com.ntt.mapper;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.ntt.model.domain.CanonicalModelWithOrderWithTime;
import com.ntt.model.domain.OrderItem;

@Component
public class PostResponseMapper {

	private CanonicalModelWithOrderWithTime canonicalModelWithOrderWithTimePostResponse=new CanonicalModelWithOrderWithTime();
	
	
	//success
	public  CanonicalModelWithOrderWithTime setCanonicalModelWithProfilePostResponse() {
		canonicalModelWithOrderWithTimePostResponse.setPayload(setPayload());
		canonicalModelWithOrderWithTimePostResponse.setCorrelationId(UUID.fromString("9cebc3dc-b5dc-4131-8a41-c6699e8ae56b"));
		canonicalModelWithOrderWithTimePostResponse.setSessionId(UUID.randomUUID());		
		
		return canonicalModelWithOrderWithTimePostResponse;
	}
	
	private OrderItem setPayload() {
		OrderItem payload = new OrderItem();
		payload.setOrderId(123);
		payload.setTime(5000);
		return payload;
	}
}
