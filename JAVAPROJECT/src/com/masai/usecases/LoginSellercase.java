package com.masai.usecases;
import java.util.Scanner;

import com.masai.bean.Seller;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.BuyerException;
import com.masai.exception.SellerException;

public class LoginSellercase {
	public static Seller seller=null;
	public static void loginSeller() throws SellerException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the username");

		String username=sc.next();
		
		System.out.println("Enter the password");
		
		String password=sc.next();
		
		SellerDao se=new SellerDaoImpl();
		
		seller=((SellerDao) se).loginSeller(username, password);
		System.out.println("Login successfully "+seller.getSname());
	}

}
