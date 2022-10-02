package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.SellProductDTO;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exception.SellerProductException;

public class SearchAndViewSellProduct {
	public static void searchAndViewProduct() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the category");
		String cat=sc.next();
		
		BuyerDao buyer=new BuyerDaoImpl();
		try {
			List<SellProductDTO> list=buyer.showProductbyCategory(cat);
			list.forEach(s->System.out.println(s));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
