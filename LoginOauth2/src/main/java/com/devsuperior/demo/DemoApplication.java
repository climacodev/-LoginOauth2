package com.devsuperior.demo;

import java.net.PasswordAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passawordEnconder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enconde = " + passawordEnconder.encode("123456"));

		// faz a comparação para ver se a senha digitada é igual a criptografia do hash
		boolean result = passawordEnconder.matches("123456",
				"$2a$10$im/cAH50/9vJepApECQsHuRyl6hb5H.9dKqWQErxFF1PSgEP2x3Ua");
		
		System.out.println("RESULTADO = " + result);
	}

}
