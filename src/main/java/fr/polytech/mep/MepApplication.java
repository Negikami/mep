package fr.polytech.mep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MepApplication {

	public static void main(String[] args) {
		SpringApplication.run(MepApplication.class, args);
	}
}
