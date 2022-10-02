package com.masai.usecases;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.BuyerException;

public class ViewRegisterBuyerList {
	
	public static void listBuyer() throws BuyerException {
		// TODO Auto-generated method stub

		AdminDao admin=new AdminDaoImpl();
		
		List<Buyer>list=admin.viewBuyerList();
		System.out.println("***List of Buyer***");
		list.forEach(s->System.out.println(s));
		
	}

}
