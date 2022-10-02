package com.masai.usecases;
import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AdminException;

public class LoginAdmincase {

	public static Admin admin=null;

	public static void login() throws AdminException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the username");

		String username=sc.next();
		
		System.out.println("Enter the password");
		
		String password=sc.next();
		
		AdminDao ad=new AdminDaoImpl();
		
		admin=((AdminDao) ad).loginAdmin(username, password);
		
		System.out.println("Successfully login "+admin.getAname());
	}
}
