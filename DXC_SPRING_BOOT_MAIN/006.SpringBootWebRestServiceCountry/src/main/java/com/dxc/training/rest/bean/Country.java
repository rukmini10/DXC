package com.dxc.training.rest.bean;

public class Country {
private int countryId;
private String countryName;
private String countryCapital;
private long countryPopulation;
private String countryMotherTounge;
public int getCountryId() {
	return countryId;
}
public void setCountryId(int countryId) {
	this.countryId = countryId;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getCountryCapital() {
	return countryCapital;
}
public void setCountryCapital(String countryCapital) {
	this.countryCapital = countryCapital;
}
public long getCountryPopulation() {
	return countryPopulation;
}
public void setCountryPopulation(long countryPopulation) {
	this.countryPopulation = countryPopulation;
}
public String getCountryMotherTounge() {
	return countryMotherTounge;
}
public void setCountryMotherTounge(String countryMotherTounge) {
	this.countryMotherTounge = countryMotherTounge;
}
public Country() {
	super();
	// TODO Auto-generated constructor stub
}
public Country(int countryId, String countryName, String countryCapital, long countryPopulation,
		String countryMotherTounge) {
	super();
	this.countryId = countryId;
	this.countryName = countryName;
	this.countryCapital = countryCapital;
	this.countryPopulation = countryPopulation;
	this.countryMotherTounge = countryMotherTounge;
}
@Override
public String toString() {
	return "Country => countryId=" + countryId + ", countryName=" + countryName + ", countryCapital=" + countryCapital
			+ ", countryPopulation=" + countryPopulation + ", countryMotherTounge=" + countryMotherTounge ;
	
}


}
