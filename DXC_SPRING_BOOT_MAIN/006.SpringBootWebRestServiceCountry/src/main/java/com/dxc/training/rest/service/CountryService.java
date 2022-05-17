package com.dxc.training.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dxc.training.rest.bean.Country;

@Service
public class CountryService {
	private HashMap<Integer,Country> countryMap;

	public CountryService() {
		countryMap = new HashMap<Integer,Country>();
		Country country=new Country(1,"India","Delhi",140,"Hindi");
		countryMap.put(1, country);
		country=new Country(2,"Nepal","Kathmandu",78,"Hindi");
		countryMap.put(2, country);
		country=new Country(3,"Pakistan","Islamabad",70,"Urdu");
		countryMap.put(3, country);
		country=new Country(4,"Bangladesh","Dhaka",60,"Urdu");
		countryMap.put(4, country);
		country=new Country(5,"China","Shaighai",120,"Chinies");
		countryMap.put(5, country);
	}
	
	//1.get all countries
	public List<Country> getAllCountries(){
		List<Country> countries=new ArrayList<Country>(countryMap.values());
		return countries;
	}
	
	//2.get country details by passing country Id
	public Country getCountryById(int id) {
		Country country=countryMap.get(id);
		return country;
	}
	
	//3.adding new country's details into the collection
		public Country addCountryById(Country country) {
			country.setCountryId(getMaxId()+1);
			countryMap.put(country.getCountryId(), country);
			return country;
		}

		//4.updating country's details from collection
		public Country updateCountry(Country country) {
			if(country.getCountryId()<=0) {
				return null;
			}else {
				countryMap.put(country.getCountryId(), country);
				return country;
			}
		}

		//5.delete particular country details by passing country id.
		public void deleteCountryById(int id) {
			countryMap.remove(id);
		}

		//6.Remove all countries details from collection
		public void deleteAllCountries() {
			countryMap.clear();
		}


		//7. Utility method to get max id
		public int getMaxId()
		{ int max=0;
		for (int id:countryMap.keySet()) {
			if(max<id)
				max=id;
		}
		return max;
		}
	
}
