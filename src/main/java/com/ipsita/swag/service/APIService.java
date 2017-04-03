package com.ipsita.swag.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APIService {

	public String sayHello() {
		return "Hello, World!";
	}

	public List<Map<String, String>> getResult(int id){
		List resultList = new ArrayList();


		Map<String, String > result1 = new HashMap();
		result1.put("id", String.valueOf(id));
		result1.put("AccountCategory", "PAID");
		result1.put("UserTypeField", "ENTERPRISE");
		result1.put("Product", "SPECIAL");
		result1.put("BillingStatus","INACTIVE");

		Map<String, String > result2 = new HashMap();
		result2.put("id", String.valueOf(id));
		result2.put("AccountCategory", "FREE_TIAL");
		result2.put("BJNUserTypeField", "INDIVIDUAL");
		result2.put("Product", "PREMIUM");
		result2.put("BillingStatus","ACTIVE");

		resultList.add(result1);
		resultList.add(result2);

		return resultList;
	}

}
