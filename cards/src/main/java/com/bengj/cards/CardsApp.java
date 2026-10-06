package com.bengj.cards;

import com.bengj.cards.dto.CardsContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
@EnableJpaAuditing(auditorAwareRef = "auditAwareImplementation")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
public class CardsApp {

    public static void main(String[] args) {
        SpringApplication.run(CardsApp.class, args);
    }

}
