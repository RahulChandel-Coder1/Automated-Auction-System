package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.SellerProductException;

public class RemoveItemfromList {
	public static int sellerid;
	public static void removeItem() throws SellerProductException {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Sell product number");
		int spno=sc.nextInt();
		
		SellerDao seller=new SellerDaoImpl();
		
		String message=seller.deleteItem(spno, sellerid);
		System.out.println(message);
	}


}
