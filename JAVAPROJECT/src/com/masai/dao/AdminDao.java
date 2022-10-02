package com.masai.dao;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Buyer;
import com.masai.exception.AdminException;
import com.masai.exception.BuyerException;

public interface AdminDao {
public String registerAdmin(String aname, String amail, String amobile, String apassword);
	
	public String registerAdmin(Admin admin);

	public List<Buyer> viewBuyerList() throws BuyerException;

	public Admin loginAdmin(String username, String password) throws AdminException;


	

}
