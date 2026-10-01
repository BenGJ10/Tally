package com.bengj.accounts;

import com.bengj.accounts.dto.AccountsContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImplementation")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
public class AccountsApp {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApp.class, args);
	}
}
