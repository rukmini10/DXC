package com.dxc.training.rest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.training.rest.service.MoneyExchanger;
@RestController

public class MoneyExchangerController {
	@Autowired
	private MoneyExchanger moneyExchanger;
	
	@RequestMapping(value="/moneyExchanger",method=RequestMethod.GET)
	public String init() {
		return "welcome to MoneyExchanger";
	}
	@RequestMapping(value="/moneyExchanger/{money}",method=RequestMethod.GET)
	public String convertingRuppieToDollar(@PathVariable double money) {
		return moneyExchanger.ruppieToDollar(money);		
	}
	
	@RequestMapping(value="/moneyExchanger/{money}",method=RequestMethod.POST)
	public String convertingDollarToRuppie(@PathVariable double money) {
		return moneyExchanger.dollarToRuppie(money);		
	}
}
