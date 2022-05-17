package com.dxc.rs;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/product")

public class ProductService {
	@POST
	@Path("/add")
	public Response addProduct(@FormParam("productId") int productId,
			@FormParam("productName") String productName,
			@FormParam("productQty") int productQty,
			@FormParam("productPrice") int productPrice) {
		return Response.status(200)
				.entity("Product Added Successfully!!!productId: "+productId
						+"<br>productName: "+productName
						+"<br>productQty: "+productQty
						+"<br>productPrice: "+productPrice)
				.build();
						
	}
}
