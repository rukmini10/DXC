package com.dxc.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/celsiustofahrenheit")
public class CelsiusToFahrenheit 
{
	@GET
	@Produces("app/xml")
	public String convertingCelsiusToFahrenheit() {
		double f;
		double c=36.8;
		f = ((9/5)*c + 32);
		 
		String result = "@Produces(\"app/xml\") \nCelsius To Fahrenheit\n" + f;
		return "<celsiustofahrenheit>" + "<celsius>" + c + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</celsiustofahrenhei>";
	}
   
}
