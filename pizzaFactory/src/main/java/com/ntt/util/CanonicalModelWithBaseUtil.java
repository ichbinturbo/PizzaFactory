package com.ntt.util;

import java.util.UUID;

import com.ntt.model.domain.Base;
import com.ntt.model.domain.BaseList;
import com.ntt.model.domain.CanonicalModelWithBase;




public class CanonicalModelWithBaseUtil {
	
	public static CanonicalModelWithBase setBaseListPayloadDetails() {
		CanonicalModelWithBase CanonicalModelWithBase = new CanonicalModelWithBase();
		CanonicalModelWithBase.setCorrelationId(UUID.randomUUID());
		CanonicalModelWithBase.setSessionId(UUID.randomUUID());
		BaseList payload = setBaseListDetails();
		CanonicalModelWithBase.setPayload(payload);

		return CanonicalModelWithBase;

	}
	
//	public static BaseList setBaseListDetailsByName(String BaseName) {
//		BaseList BaseList = new BaseList();
//		Base myBase = setBaseDetailsByName(BaseName);
//		BaseList.add(myBase);
//		return BaseList;
//		
//	}
	public static BaseList setBaseListDetails() {
		BaseList BaseList = new BaseList();
		Base myBase = setBaseDetails1();
		BaseList.add(myBase);
        Base myBase2 = setBaseDetails2();
		BaseList.add(myBase2);
		Base myBase3 = setBaseDetails3();
		BaseList.add(myBase3);
		return BaseList;
		
	}
	private static Base setBaseDetails1() {
		Base myBase = new Base();
		myBase.setName("Thick");
		myBase.setCookingTime(150);
		myBase.setPrice(50);
		return myBase;
	}
	private static Base setBaseDetails2() {
		Base myBase = new Base();
		myBase.setName("Thin");
		myBase.setCookingTime(100);
		myBase.setPrice(25);
		return myBase;
	}
	private static Base setBaseDetails3() {
		Base myBase = new Base();
		myBase.setName("cheeseCrust");
		myBase.setCookingTime(120);
		myBase.setPrice(75);
		return myBase;
	}
}
