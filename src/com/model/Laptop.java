package com.model;

public class Laptop {
	
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", price=" + price + "]";
	}
	private String company;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
	

}
