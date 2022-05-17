package com.dxc.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ConversionService")
public class UnitConversionService {
    @GET  
    @Path("/InchToFeet/{inches}")  
     @Produces(MediaType.TEXT_XML)  
     public String convertInchToFeet(@PathParam("inches") int inches) {    
       double feet = 0;  
       feet =(double) inches/12;  
       
       return "<InchToFeetService>"  
       + "<Inch>" + inches + "</Inch>"  
         + "<Feet>" + feet + "</Feet>"  
        + "</InchToFeetService>";  
     }  
    @Path("/FeetToInch/{feet}")  
    @GET  
    @Produces(MediaType.TEXT_XML)  
    public String convertFeetToInch(@PathParam("feet") int feet) {  
     int inches=12*feet;  
   
        return "<FeetToInchService>"  
          + "<Feet>" + feet + "</Feet>"  
          + "<Inch>" + inches + "</Inch>"  
          + "</FeetToInchService>";  
    }   
}
