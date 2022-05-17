package com.dxc.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
@Path("/fahrenheittocelsius")
public class FahrenheitToCelsius {
	@GET
	@Produces("app/json")
	public Response convertFtoC() throws JSONException {
 
		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24;
		Double celsius;
		celsius = (fahrenheit - 32) * (5 / 9);
		jsonObject.put("Fahrenheit Value", fahrenheit);
		jsonObject.put("Celsius Value", celsius);
 
		String result = "@Produces(\"app/json\") \n\nFahreinheit to Celsius\n\n" + jsonObject;
		return Response.status(200).entity(result).build();
}}
