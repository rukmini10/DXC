package com.dxc.training;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class ProductService {
	private ProductDAO dao=ProductDAO.getDao();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> Products(){
		return dao.getProducts();
	}
}
