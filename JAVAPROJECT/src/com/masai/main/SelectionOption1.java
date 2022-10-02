package com.masai.main;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AdminException;
import com.masai.exception.BuyerException;
import com.masai.exception.SellerException;
import com.masai.exception.SellerProductException;
import com.masai.usecases.InsertSellproduct;
import com.masai.usecases.Insertbuyerproduct;
import com.masai.usecases.LoginAdmincase;
import com.masai.usecases.LoginBuyercase;
import com.masai.usecases.LoginSellercase;
import com.masai.usecases.RegisterAdmincase;
import com.masai.usecases.RegisterBuyercase;
import com.masai.usecases.RegisterSellercase;
import com.masai.usecases.RemoveItemfromList;
import com.masai.usecases.SearchAndViewProductAndSellerbyCategory;
import com.masai.usecases.SearchAndViewSellProduct;
import com.masai.usecases.UpdateSellerProductbyPrice;
import com.masai.usecases.UpdateSellerProductbyQuantity;
import com.masai.usecases.ViewRegisterBuyerList;
import com.masai.usecases.ViewRegisterSellerList;

public class SelectionOption1 {
	
	Admin admin;
	Seller seller;
	Buyer buyer;
	public static Scanner sc=new Scanner(System.in);
	
	public static void selectionchoice() {
		System.out.println("Select the User"+"\n"+"1.Admin"+"\n"+"2.Seller"+"\n"+"3.Buyer"+"\n"+"4.Exit");
	
		
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			SelectionOption1 a=new SelectionOption1();
			a.selectionChoiceadmin();
			break;
		case 2:
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceseller();
			break;
		case 3:
			SelectionOption1 b=new SelectionOption1();
			b.selectionChoiceBuyer();
			break;
		case 4:
			System.out.println("Thank you");
			sc.close();
			break;
		}
	}
	public void selectionChoiceadmin() {
		
		System.out.println("Select the option"+"\n"+"1.Admin Login"+"\n"+"2.Register Admin");
	
		int n=sc.nextInt();
		
		switch(n) {
			
		case 1:
			try {
				LoginAdmincase.login();
			} catch (AdminException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			admin=LoginAdmincase.admin;
			if(admin!=null) {
				selectionChoiceAfterAdmin();
			}else {
				selectionChoiceadmin();
			}
			break;
			
		case 2:
			RegisterAdmincase.registerAdmin();
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceadmin();
			break;
			
		
			
		}	
	}
	public void selectionChoiceseller() {
		
		System.out.println("Select the option"+"\n"+"1.Seller Login"+"\n"+"2.Register Seller");
		
		int n=sc.nextInt();
		
		switch(n) {
			
		case 1:
			try {
				LoginSellercase.loginSeller();
			} catch (SellerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			seller=LoginSellercase.seller;
			if(seller!=null) {
				selectionChoiceAfterSeller();
			}else {
				selectionChoiceseller();
			}
			break;
			
		case 2:
			RegisterSellercase.registerSeller();;
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceseller();
			break;
		
	}
	
	}
	
public void selectionChoiceBuyer() {
		
		System.out.println("Select the option"+"\n"+"1.Buyer Login"+"\n"+"2.Register Buyer");
		
		int n=sc.nextInt();
		
		switch(n) {
			
		case 1:
			LoginBuyercase.loginBuyer();
			buyer=LoginBuyercase.buyer;
			if(buyer!=null) {
				selectionChoiceAfterBuyerLogin();
			}else {
				selectionChoiceBuyer();
			}
			break;
			
		case 2:
			RegisterBuyercase.registerBuyer();
			SelectionOption1 s=new SelectionOption1();
			s.selectionChoiceBuyer();
			break;
		
	}
	}

	public void selectionChoiceAfterAdmin() {
		
		
		System.out.println("Select the option"+"\n"+"1.List of Buyer"+"\n"+"2.List of Seller"+"\n"+"3.Exit");
		int x=sc.nextInt();
		switch(x) {
		
		case 1:
			try {
				ViewRegisterBuyerList.listBuyer();
			} catch (BuyerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			selectionChoiceAfterAdmin();
			break;
		case 2: 
			ViewRegisterSellerList.viewSellerList();
			selectionChoiceAfterAdmin();
			break;
		case 3:
			selectionchoice();
			break;
		}
	}
	
	public void selectionChoiceAfterSeller() {
		
		System.out.println("Select the option"+"\n"+"1.Add item to sell"+"\n"+"2.Update Item price "+"\n"+"3.Update Item qunatity"+"\n"+"4.Delete items from list"+"\n"+"5.exit");
		
		int y=sc.nextInt();
		switch(y) {
		case 1:
			InsertSellproduct.sellerid=seller.getSid();
			InsertSellproduct.InsertItemtoSell();
			System.out.println("********");
			selectionChoiceAfterSeller();
			break;
		case 2:
			UpdateSellerProductbyPrice.sellerid=seller.getSid();
			UpdateSellerProductbyPrice.updateSellerprice();
			selectionChoiceAfterSeller();
			break;
		case 3:
			UpdateSellerProductbyPrice.sellerid=seller.getSid();
			try {
				UpdateSellerProductbyQuantity.updateSellerqunatity();
			} catch (SellerProductException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			selectionChoiceAfterSeller();
			break;
		case 4:
			RemoveItemfromList.sellerid=seller.getSid();
			try {
				RemoveItemfromList.removeItem();
			} catch (SellerProductException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			selectionChoiceAfterSeller();
			break;
		case 5:
			selectionchoice();
			break;
		
		}
		
	}
	public void selectionChoiceAfterBuyerLogin() {
		System.out.println("Select the option"+"\n"+"1.Search by category"+"\n"+"2.Search by category with seller "+"\n"+"3.Buy the product"+"\n"+"4.exit");
	
		int b=sc.nextInt();
		
		switch(b) {
		
		case 1:
			SearchAndViewSellProduct.searchAndViewProduct();
			selectionChoiceAfterBuyerLogin();
			break;
		case 2:
			SearchAndViewProductAndSellerbyCategory.searchAndViewANDSell();;
			selectionChoiceAfterBuyerLogin();
			break;
			
		case 3:
			Insertbuyerproduct.bid=buyer.getBid();
			Insertbuyerproduct.insertBuyerProduct();
			selectionChoiceAfterBuyerLogin();
			break;
			
		case 4:
			selectionchoice();
			break;
		
		
		}
	
	
	}

}
