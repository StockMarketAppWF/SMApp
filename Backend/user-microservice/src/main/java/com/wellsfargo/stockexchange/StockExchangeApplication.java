package com.wellsfargo.stockexchange;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.wellsfargo.stockexchange.entity.User;
import com.wellsfargo.stockexchange.repository.UserRepository;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class StockExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockExchangeApplication.class, args);
	}
	

	@Bean
	CommandLineRunner init(UserRepository userRepository) {

	    return args -> {

	        User adminRole = userRepository.findByRole("ADMIN");
	        if (adminRole == null) {
	            User newAdminRole = new User();
	            newAdminRole.setRole("ADMIN");
	            newAdminRole.setEmail("admin@gmail.com");
	            newAdminRole.setPassword("admin");
	            newAdminRole.setFullname("admin");
	            newAdminRole.setEnabled(true);
	            userRepository.save(newAdminRole);
	        }

	        User userRole = userRepository.findByRole("USER");
	        if (userRole == null) {
	            User newUserRole = new User();
	            newUserRole.setRole("USER");
	            userRepository.save(newUserRole);
	        }
	    };

	}

}
