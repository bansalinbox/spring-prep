package com.spring_prep;

import com.github.javafaker.Faker;
import com.spring_prep.learning.jpa_bouali_long.models.Author;
import com.spring_prep.learning.jpa_bouali_long.models.Lecture;
import com.spring_prep.learning.jpa_bouali_long.models.Text;
import com.spring_prep.learning.jpa_bouali_long.models.Vedio;
import com.spring_prep.learning.jpa_bouali_long.repositories.AuthorRepository;
import com.spring_prep.learning.jpa_bouali_long.repositories.TextRepository;
import com.spring_prep.learning.jpa_bouali_long.repositories.VedioRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.spring_prep.learning"})
@EnableTransactionManagement
public class SpringPrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrepApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository,
											   VedioRespository vedioRespository,
											   TextRepository textRepository){
		return args -> {
//			for (int i = 0; i < 50; i++) {
//				Faker faker = new Faker();
//				Author author = Author.builder()
//					.firstName(faker.name().firstName())
//					.lastName(faker.name().lastName())
//					.age(faker.number().numberBetween(19, 50))
//					.email("bansalinbox" + i + "@gmail.com")
//					.build();
//				authorRepository.save(author);
//			}
//			Author author = Author.builder()
//					.id(1)
//					.firstName("gourav")
//					.lastName("bansal")
//					.age(35)
//					.email("bansalinbox@gmail.com")
//					.build();
//			authorRepository.save(author);

			authorRepository.updateAuthor(43, 1);
//			Vedio vedio = Vedio.builder()
//					.name("abc")
//					.length(20)
//					.build();
//			Vedio vedio2 = Vedio.builder()
//					.name("abc2")
//					.length(202)
//					.build();
//			vedioRespository.save(vedio);
//			vedioRespository.save(vedio2);
//
//			Text text = Text.builder()
//					.content("text content")
//					.build();
//			textRepository.save(text);

		};
	}

}
