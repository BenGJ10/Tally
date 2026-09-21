package com.bengj.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImplementation")
public class AccountsApp {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApp.class, args);
	}

}
