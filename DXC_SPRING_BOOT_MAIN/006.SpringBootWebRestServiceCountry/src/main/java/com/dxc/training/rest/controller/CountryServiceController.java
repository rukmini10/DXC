package com.dxc.training.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.training.rest.bean.Country;
import com.dxc.training.rest.service.CountryService;

@RestController
public class CountryServiceController {
	@Autowired
	private CountryService countryService;
	
	@RequestMapping(value="/countries",method=RequestMethod.GET)
	public List<Country> getCountries(){
		List<Country> list=countryService.getAllCountries();
		return list;
	}
	@RequestMapping(value="/country/{id}", method=RequestMethod.GET)
	public Country getCountryById(@PathVariable int id){
		Country country=countryService.getCountryById(id);
		return country;
	}


	@RequestMapping(value="/countries", method=RequestMethod.POST)
	public Country addCountries(@RequestBody Country country){
		return countryService.addCountryById(country);
	}

	@RequestMapping(value="/countries", method=RequestMethod.PUT)
	public Country updateCountries(@RequestBody Country country){
		return countryService.updateCountry(country);
	}

	@RequestMapping(value="/country/{id}", method=RequestMethod.DELETE)
	public String deleteCountryById(@PathVariable int id){
		countryService.deleteCountryById(id);
		return "Record with country code:"+id+" has been deleted.."; 
	}

	@RequestMapping(value="/countries", method=RequestMethod.DELETE)
	public String deleteAllCountries(){
		countryService.deleteAllCountries();
		return "All Record has been deleted..";
	}
	
}
