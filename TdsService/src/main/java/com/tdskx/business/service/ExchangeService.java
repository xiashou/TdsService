package com.tdskx.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdskx.business.dao.ExchangeDao;
import com.tdskx.business.model.Exchange;

@Service("exchangeService")
public class ExchangeService {

	@Autowired
	private ExchangeDao exchangeDao;
	
	public void insert(Exchange exchange) throws Exception {
		exchangeDao.save(exchange);
	}
	
}
