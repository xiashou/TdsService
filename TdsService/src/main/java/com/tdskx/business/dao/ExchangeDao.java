package com.tdskx.business.dao;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.tdskx.business.model.Exchange;
import com.tdskx.common.dao.BaseDao;

@Component("exchangeDao")
public class ExchangeDao extends BaseDao<Exchange, Serializable> {

}
