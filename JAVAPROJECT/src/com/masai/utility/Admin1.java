package com.masai.utility;

import java.sql.Connection;

public class Admin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn=DUtil.provideConnection();
		
		System.out.println(conn);

	}

}
