package com.masai.dao;

import com.masai.bean.Seller;
import com.masai.bean.SellerProduct;
import com.masai.exception.SellerProductException;

public interface SellerDao {
public String registerSeller(String sname, String smail, String smobile, String spassword);
	
	public String registerSeller(Seller seller);

	public String addSelling(SellerProduct sellProduct);

	String updatePrice(int price, int spno, int sellerid) throws SellerProductException;

	public Seller loginSeller(String username, String password);

	public String deleteItem(int spno, int sellerid);

	public String updateQuantity(int quantity, int spno, int sellerid);

	

}
