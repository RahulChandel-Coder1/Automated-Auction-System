package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.SellProductAndSellerDTO;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImpl;
import com.masai.exception.SellerException;
import com.masai.exception.SellerProductException;

public class SearchAndViewProductAndSellerbyCategory {

	public static void searchAndViewANDSell() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the category");
		
		String cat=sc.next();

		BuyerDao buy=new BuyerDaoImpl();
		
		try {
			List<SellProductAndSellerDTO> list= ((BuyerDaoImpl) buy).showProductAndSellerbyCategory(cat);
			list.forEach(s->System.out.println(s));
		} catch (SellerProductException | SellerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
