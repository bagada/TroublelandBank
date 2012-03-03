package com.troubleland.bank.model;

import java.util.List;

public class User {

	public User() {
	}
	
	public User(int id, String name, List<Account> accounts) {
		this.id = id;
		this.name = name;
		this.accounts = accounts;
	}
	
	private int id;
	private String name;
	private List<Account> accounts;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	@Override
	public String toString(){
		return "Name: " + name + "\nId: "+ id+ "\n"+ getAccounts();
	}
}
