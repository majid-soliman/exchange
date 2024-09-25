package com.java.exchange.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.exchange.ent.CurrenciesEnt;
import com.java.exchange.repo.CurrecnyRepo;

@Component
public class CurrencyDAO {

	@Autowired
	CurrecnyRepo repo;
	
	
	public CurrenciesEnt getCurrencyPrice(String currency) {
		return repo.getCurrencyPrice(currency);
	}
}
