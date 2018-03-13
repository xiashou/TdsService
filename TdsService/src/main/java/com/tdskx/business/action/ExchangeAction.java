package com.tdskx.business.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.tdskx.business.model.Exchange;
import com.tdskx.business.service.ExchangeService;
import com.tdskx.common.action.BaseAction;
import com.tdskx.core.util.Utils;


@Scope("prototype")
@Component("exchangeAction")
public class ExchangeAction extends BaseAction {

	private static final long serialVersionUID = 1550600015317263432L;
	private static Logger log = Logger.getLogger("SLog");
	
	@Autowired
	private ExchangeService exchangeService;
	
	private Exchange exchange;
	
	public String insertExchange() {
		try {
			if(!Utils.isEmpty(exchange)){
				exchange.setCreateDate(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
				exchangeService.insert(exchange);
				this.setResult(true, "添加成功！");
			}
		} catch(Exception e) {
			log.error(Utils.getErrorMessage(e));
		}
		return SUCCESS;
	}

	public Exchange getExchange() {
		return exchange;
	}
	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

}
