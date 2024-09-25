package com.java.exchange.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.exchange.ent.CurrenciesEnt;

public interface CurrecnyRepo extends JpaRepository<CurrenciesEnt, Integer> {

	@Query("select new com.java.exchange.ent.CurrenciesEnt(currency,descreption,price) from CurrenciesEnt c where c.currency =:currency")
	public CurrenciesEnt getCurrencyPrice(@Param("currency") String currecny );
	
}
