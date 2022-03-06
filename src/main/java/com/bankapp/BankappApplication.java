package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.model.persitance.Account;
import com.bankapp.model.persitance.User;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.UserService;

@SpringBootApplication
public class BankappApplication implements CommandLineRunner{

//	@Autowired
//	private AccountService accountService;
	
	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userService.AddUser(new User("tara", "pqr", "ROLE_MGR", "joe@gmail.com"));

		
//		accountService.addAccount(new Account("Chesta", 42000.00, "9877553145", "Haryana", "chesta412@gmail.com"));
//		accountService.addAccount(new Account("Sethi", 64000.00, "8711459035", "Punjab", "shruti18@gmail.com"));

		
	}

}
