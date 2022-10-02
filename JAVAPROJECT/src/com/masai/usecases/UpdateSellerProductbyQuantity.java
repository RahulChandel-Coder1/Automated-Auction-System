package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.SellerProductException;

public class UpdateSellerProductbyQuantity {

	public static int sellerid;
	public static void updateSellerqunatity() throws SellerProductException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product number");
		int spno=sc.nextInt();
		
		System.out.println("Enter the Product quantity");
		int quantity=sc.nextInt();
		
		SellerDao seller=new SellerDaoImpl();
		
		String message=seller.updateQuantity(quantity, spno,sellerid);
		System.out.println(message);
	}

}
