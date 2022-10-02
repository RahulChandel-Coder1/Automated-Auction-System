package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;

public class RegisterAdmincase {
	public static void registerAdmin() {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the email");
		String email=sc.next();
		
		System.out.println("Enter the mobile");
		String mobile=sc.next();
		
		System.out.println("Enter the password");
		String password=sc.next();
		
		
		AdminDao admin=new AdminDaoImpl();
		
		Admin a=new Admin();
		
		a.setAname(name);
		a.setAmail(email);
		a.setAmobile(mobile);
		a.setApassword(password);
		
		String message=admin.registerAdmin(a);

		System.out.println(message);
	}


}
