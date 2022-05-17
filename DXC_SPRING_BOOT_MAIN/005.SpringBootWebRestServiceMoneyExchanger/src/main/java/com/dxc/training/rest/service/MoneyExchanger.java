package com.dxc.training.rest.service;

import org.springframework.stereotype.Service;

@Service
public class MoneyExchanger {
	private double ruppie;
	private double dollar;
	public double getRuppie() {
		return ruppie;
	}
	public void setRuppie(double ruppie) {
		this.ruppie = ruppie;
	}
	public double getDollar() {
		return dollar;
	}
	public void setDollar(double dollar) {
		this.dollar = dollar;
	}
	public MoneyExchanger() {
		this.setDollar(0);
		this.setRuppie(0);
	}
	public String ruppieToDollar(double ruppie) {
		this.setRuppie(ruppie);
		this.setDollar(ruppie/76.44);
		return String.format("%s", this.getDollar());
	}
	public String dollarToRuppie(double dollar) {
		this.setDollar(dollar);
		this.setRuppie(dollar*76.44);
		return String.format("%s", this.getRuppie());
	}
	@Override
	public String toString() {
		return "MoneyExchanger =>ruppie=" + ruppie + ", dollar=" + dollar;
	}
	
}
