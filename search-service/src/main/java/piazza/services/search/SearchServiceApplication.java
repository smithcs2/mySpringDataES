package piazza.services.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@EnableAutoConfiguration 
public class SearchServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SearchServiceApplication.class, args);
	}
}
