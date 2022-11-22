package com.imran.jpa;
import com.imran.jpa.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hi");
	}
}
