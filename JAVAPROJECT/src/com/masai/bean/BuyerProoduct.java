package com.masai.bean;

import java.sql.Date;

@SuppressWarnings("unused")
public class BuyerProoduct {
	private int bpno;
	private String bpname;
	private int bpprice;
	private String bpcategory;
	private int bpquentity;
	private int sellerid;
	private int spno;
	
	public BuyerProoduct(){
		
	}

	public BuyerProoduct(int bpno, String bpname, int bpprice, String bpcategory, int bpquentity, int sellerid,
			int spno) {
		super();
		this.bpno = bpno;
		this.bpname = bpname;
		this.bpprice = bpprice;
		this.bpcategory = bpcategory;
		this.bpquentity = bpquentity;
		this.sellerid = sellerid;
		this.spno = spno;
	}

	public int getBpno() {
		return bpno;
	}

	public void setBpno(int bpno) {
		this.bpno = bpno;
	}

	public String getBpname() {
		return bpname;
	}

	public void setBpname(String bpname) {
		this.bpname = bpname;
	}

	public int getBpprice() {
		return bpprice;
	}

	public void setBpprice(int bpprice) {
		this.bpprice = bpprice;
	}

	public String getBpcategory() {
		return bpcategory;
	}

	public void setBpcategory(String bpcategory) {
		this.bpcategory = bpcategory;
	}

	public int getBpquentity() {
		return bpquentity;
	}

	public void setBpquentity(int bpquentity) {
		this.bpquentity = bpquentity;
	}

	public int getSellerid() {
		return sellerid;
	}

	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}

	public int getSpno() {
		return spno;
	}

	public void setSpno(int spno) {
		this.spno = spno;
	}

	@Override
	public String toString() {
		return "BuyerProduct [bpno=" + bpno + ", bpname=" + bpname + ", bpprice=" + bpprice + ", bpcategory="
				+ bpcategory + ", bpquentity=" + bpquentity + ", sellerid=" + sellerid + ", spno=" + spno + "]";
	}

	public Date getBuydate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMinprice(int bpprice2) {
		// TODO Auto-generated method stub
		
	}

	
	

	
	
	
	

}

