package com.ntt.util;

import java.util.UUID;
import com.ntt.model.domain.CanonicalModelWithToppings;
import com.ntt.model.domain.ToppingList;
import com.ntt.model.domain.Toppings;

public class CanonicalModelWithToppingsUtil {

	public static CanonicalModelWithToppings setToppingsListPayloadDetails() {
		CanonicalModelWithToppings CanonicalModelWithToppings = new CanonicalModelWithToppings();
		CanonicalModelWithToppings.setCorrelationId(UUID.randomUUID());
		CanonicalModelWithToppings.setSessionId(UUID.randomUUID());
		ToppingList payload = setToppingListDetails();
		CanonicalModelWithToppings.setPayload(payload);

		return CanonicalModelWithToppings;

	}
	
//	public static BaseList setBaseListDetailsByName(String BaseName) {
//		BaseList BaseList = new BaseList();
//		Base myBase = setBaseDetailsByName(BaseName);
//		BaseList.add(myBase);
//		return BaseList;
//		
//	}
	public static ToppingList setToppingListDetails() {
		ToppingList ToppingList = new ToppingList();
		Toppings myTopping = setToppingDetails1();
		ToppingList.add(myTopping);
		Toppings myTopping2 = setToppingDetails2();
        ToppingList.add(myTopping2);
        Toppings myTopping3 = setToppingDetails3();
		ToppingList.add(myTopping3);
		return ToppingList;
		
	}
	private static Toppings setToppingDetails1() {
		Toppings myTopping = new Toppings();
		myTopping.setName("tomatoes");
		myTopping.setCookingTime(150);
		myTopping.setPrice(50);
		return myTopping;
	}
	private static Toppings setToppingDetails2() {
		Toppings myTopping = new Toppings();
		myTopping.setName("cheese");
		myTopping.setCookingTime(100);
		myTopping.setPrice(25);
		return myTopping;
	}
	private static Toppings setToppingDetails3() {
		Toppings myTopping = new Toppings();
		myTopping.setName("Basil");
		myTopping.setCookingTime(120);
		myTopping.setPrice(15);
		return myTopping;
	}
}

