package com.troubleland.bank.model;

public class Account {
	public Account() {
	
	}
	public Account(int id, String number, String type) {
		this.id = id;
		this.number = number;
		this.type = type;
	
	}
	
	private int id;
	private String number;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override 
	public String toString (){
		return "Id: " + id + "\n Number: " + number + "\n Type: "+ type;
	}
	
}
