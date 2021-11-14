package com.learn.vault;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultApplication.class, args);
	}
	
}
