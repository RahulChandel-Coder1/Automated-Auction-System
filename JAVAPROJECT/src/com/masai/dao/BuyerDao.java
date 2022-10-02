package com.masai.dao;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.BuyerProoduct;
import com.masai.bean.SellProductDTO;
import com.masai.bean.BuyerProoduct;
import com.masai.exception.BuyerException;
import com.masai.exception.SellerException;
import com.masai.exception.SellerProductException;

public interface BuyerDao {
public String registerBuyer(String sname, String smail, String smobile, String spassword);
	
	public String registerBuyer(Buyer buyer);

	public String BuyProduct(BuyerProoduct buyerproduct) throws BuyerException, SellerException;

	//Buyer loginBuyer(String username, String password) throws BuyerException;

	public List<SellProductDTO> showProductbyCategory(String cat) throws SellerProductException;
}


