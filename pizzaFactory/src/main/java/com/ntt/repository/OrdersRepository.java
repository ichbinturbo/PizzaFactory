package com.ntt.repository;

import org.springframework.stereotype.Repository;

import com.ntt.model.domain.CanonicalModelWithBase;
import com.ntt.util.CanonicalModelWithBaseUtil;

@Repository
public class OrdersRepository {
	
	public CanonicalModelWithBase setBaseListPayloadDetailsByNameGetResponse(String BaseName) {
		return CanonicalModelWithBaseUtil.setBaseListPayloadDetailsByName(BaseName);
	}

}
