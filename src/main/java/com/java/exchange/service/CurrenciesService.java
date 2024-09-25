package com.java.exchange.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.exchange.dao.CurrencyDAO;
import com.java.exchange.ent.CurrenciesEnt;

@Component
public class CurrenciesService {

	@Autowired
	public CurrencyDAO dao;
	
	public Map<String, Object> getCurrencyPrice(Map<String, Object> reqMap) {
	Map<String, Object> resMap = new HashMap<String, Object>();
	try {
		CurrenciesEnt ent = dao.getCurrencyPrice(reqMap.get("currency").toString()); 
		
		resMap.put("descreption", ent.getDescreption());
		resMap.put("price", ent.getPrice());
	}catch(Exception e) {
		e.printStackTrace();
		resMap.put("Error",e.getMessage());
	}
	 return resMap;
	}
	
}
