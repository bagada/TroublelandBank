package com.troubleland.bank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.troubleland.bank.model.Account;
import com.troubleland.bank.model.User;


public class Test {

	public static void main(String[] args) {
	Account account1 = new Account(1,"111","Cheques");
	Account account2 = new Account(2,"222","maestra");
	Account account3 = new Account(3,"333","Credito");
	Account account4 = new Account(4,"444","Debito");
		
		List<Account> listAccount = new ArrayList<Account>();
		listAccount.add(0, account1);
		listAccount.add(1, account2);
		listAccount.add(2, account3);
		listAccount.add(3, account4);
		
		for(Account cuentita : listAccount ){
			System.out.println(cuentita);
		}
//		
//		User user = new User(1,"Juanito",listAccount);
//		//System.out.println(user);
//		
//		List<Account> lista = user.getAccounts();
//		
//		System.out.println(lista.get(3));
//		
//		
	
		
		
		
	}
}
