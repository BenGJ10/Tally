package com.bengj.loans;

import com.bengj.loans.dto.LoansContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImplementation")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
public class LoansApp {

    public static void main(String[] args) {
        SpringApplication.run(LoansApp.class, args);
    }

}
