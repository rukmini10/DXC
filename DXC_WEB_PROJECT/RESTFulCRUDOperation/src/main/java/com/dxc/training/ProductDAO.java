package com.dxc.training;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	private static ProductDAO dao;
	private static List<Product> products=new ArrayList<>();
	
	static {
		products.add(new Product(1,"Mouse",2,450.50f));
		products.add(new Product(2,"KeyBoard",2,750.50f));
		products.add(new Product(3,"CPU",2,1450.50f));
		products.add(new Product(4,"Monitor",2,5450.50f));
	}
	
	public ProductDAO() {
		
	}

	public static ProductDAO getDao() {
		if(dao==null) {
			dao=new ProductDAO();
		}
		return dao;
	}
	public List<Product> getProducts(){
		return products;
	}
	public int addProduct(Product product) {
		int newId=products.size()+1;
		product.setProductId(newId);
		int index=products.indexOf(product);
		if(index>=0) {
			return products.get(index);
		}
		else {
			return null;
		}
	}
	public Product getProductById(int id) {
		Product product=new Product(id);
	}
}
