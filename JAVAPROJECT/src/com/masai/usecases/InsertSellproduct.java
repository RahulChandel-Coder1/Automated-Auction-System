package com.masai.usecases;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.masai.bean.SellerProduct;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImpl;
import com.masai.exception.SellerException;

public class InsertSellproduct {
	public static int sellerid;
	public static void InsertItemtoSell() {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product name");	
		String spname=sc.next();
		
		System.out.println("Enter the product category");
		String spcategory=sc.next();
		
		System.out.println("Enter the product price");
		int spprice=sc.nextInt();
		
		System.out.println("Enter the product qunatity");
		int spquantity=sc.nextInt();
		
		System.out.println("Enter the availability of product Yes OR No");
		boolean availability;
		String yn=sc.next();
		if(yn.equals("Yes")) {
			availability=true;
		}else {
			availability=false;
		}
		
		System.out.println("Enter the  starting date in yyyy-mm-dd ");
		
		String da=sc.next();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate sdate=LocalDate.parse(da);
		Date spdate = Date.valueOf(sdate);
		System.out.println("Enter the end date in yyyy-mm-dd");
		
		String eda=sc.next();
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDate edate=LocalDate.parse(eda);
		Date epdate = Date.valueOf(edate);
		SellerProduct sellProduct=new SellerProduct();
		sellProduct.setSpname(spname);
		sellProduct.setSllerid(sellerid);
		sellProduct.setSpcategory(spcategory);
		sellProduct.setSpprice(spprice);
		sellProduct.setSpquantity(spquantity);
		sellProduct.setAvailability(availability);
		sellProduct.setStartingdate(spdate);
		sellProduct.setEnddate(epdate);
		
		SellerDao s=new SellerDaoImpl();
		String msg=s.addSelling(sellProduct);
		System.out.println(msg);
		
		} 
}
