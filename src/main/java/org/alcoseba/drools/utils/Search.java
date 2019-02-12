package org.alcoseba.drools.utils;

import org.alcoseba.drools.model.Account;

public class Search {
	public static Account search(String name) {
		System.out.println("SEARCH");
		Account account = null;

		if ("test".equals(name)) {
			account = new Account(0);
		}

		return account;
	}
}
