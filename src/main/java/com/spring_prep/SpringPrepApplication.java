package com.spring_prep;

import com.spring_prep.learning.jpa_bouali_long.models.Author;
import com.spring_prep.learning.jpa_bouali_long.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.spring_prep.learning"})
public class SpringPrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrepApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository){
		return args -> {
			Author author = Author.builder()
					.firstName("gourav")
					.lastName("bansal")
					.age(35)
					.email("bansalinbox@gmail.com")
					.build();
			authorRepository.save(author);
		};
	}

}
