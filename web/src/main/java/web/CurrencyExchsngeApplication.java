package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"management"})
@EntityScan(basePackages = {"model"})
@ComponentScan(basePackages = {"currency","web"})
public class CurrencyExchsngeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchsngeApplication.class, args);
	}
}
