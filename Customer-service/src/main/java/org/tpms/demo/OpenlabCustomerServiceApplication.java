package org.tpms.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tpms.demo.dto.CustomerRequestDto;
import org.tpms.demo.services.CustomerService;

@SpringBootApplication
public class OpenlabCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenlabCustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerService customerService){
        return args -> {
          customerService.save(new CustomerRequestDto("C01","adria","adria@gmail.com"));
          customerService.save(new CustomerRequestDto("C02","openLab","openLab@gmail.com"));
          customerService.save(new CustomerRequestDto("C03","Nimblways","Nimblways@gmail.com"));
        };
    }
}
