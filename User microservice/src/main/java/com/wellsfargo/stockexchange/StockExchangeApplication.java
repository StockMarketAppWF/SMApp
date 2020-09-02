package com.wellsfargo.stockexchange;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.wellsfargo.stockexchange.entity.User;
import com.wellsfargo.stockexchange.repository.UserRepository;

@SpringBootApplication
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
