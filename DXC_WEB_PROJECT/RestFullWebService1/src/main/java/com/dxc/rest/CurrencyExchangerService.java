package com.dxc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("CurrencyService")
public class CurrencyExchangerService {
	  @javax.ws.rs.GET
	@Path("/rupeeToDollar/{rupee}")
	  @javax.ws.rs.Produces(javax.ws.rs.core.MediaType.TEXT_XML)
 public double rupeeToDollar(@PathParam("rupee")double rupee) {
		double dollar=rupee/65.50;
		return dollar;
}
	  @javax.ws.rs.GET
	@Path("/dollarToRupee/{dollar}")
	  @javax.ws.rs.Produces(javax.ws.rs.core.MediaType.TEXT_XML)
 public double dollarToRupee(@PathParam("dollar")double dollar) {
		double rupee=dollar*65.50;
		return rupee;
}
}