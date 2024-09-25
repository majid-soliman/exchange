package com.java.exchange.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.exchange.service.CurrenciesService;

@RestController
@RequestMapping("/currencyAPI")
@CrossOrigin("*")
public class CurrenciesController {

	
	@Autowired
	CurrenciesService service;
	
	@PostMapping("/getCurrencyPrice")
	public Map<String,Object> getCurrencyPrice(@RequestBody Map<String, Object> reqMap, 
	@RequestHeader(name="OK-ACCESS-KEY",required = false) String apiKey) {
		return service.getCurrencyPrice(reqMap);
	}
	
}
