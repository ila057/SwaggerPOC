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
		result1.put("AccountCategory", "ENTERPRISE");
		result1.put("BJNUserTypeField", "ENTERPRISE_FREETRIAL");
		result1.put("BJNProduct", "MEET_ME");
		result1.put("BillingStatus","INACTIVE");

		Map<String, String > result2 = new HashMap();
		result2.put("id", String.valueOf(id));
		result2.put("AccountCategory", "INDIVIDUAL");
		result2.put("BJNUserTypeField", "INDIVIDUAL_EXPIRED");
		result2.put("BJNProduct", "PRIMETIME");
		result2.put("BillingStatus","ACTIVE");

		resultList.add(result1);
		resultList.add(result2);

		return resultList;
	}

}
