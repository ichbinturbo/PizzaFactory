package com.ntt.util;

import java.util.UUID;

import com.ntt.model.domain.Base;
import com.ntt.model.domain.BaseList;
import com.ntt.model.domain.CanonicalModelWithBase;




public class CanonicalModelWithBaseUtil {
	
	public static CanonicalModelWithBase setBaseListPayloadDetailsByName(String BaseName) {
		CanonicalModelWithBase CanonicalModelWithBase = new CanonicalModelWithBase();
		CanonicalModelWithBase.setCorrelationId(UUID.randomUUID());
		CanonicalModelWithBase.setSessionId(UUID.randomUUID());
		BaseList payload = setBaseListDetailsByName(BaseName);
		CanonicalModelWithBase.setPayload(payload);

		return CanonicalModelWithBase;

	}
	
	public static BaseList setBaseListDetailsByName(String BaseName) {
		BaseList BaseList = new BaseList();
		Base myBase = setBaseDetailsByName(BaseName);
		BaseList.add(myBase);
		return BaseList;
		
	}
	
	private static Base setBaseDetailsByName(String BaseName) {
		Base myBase = new Base();
		myBase.setName(BaseName);
		myBase.setCookingTime(100);
		myBase.setPrice(100);
	
		
		return myBase;
	}

}
