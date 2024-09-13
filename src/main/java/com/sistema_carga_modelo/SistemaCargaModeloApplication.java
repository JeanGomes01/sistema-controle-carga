package com.sistema_carga_modelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaCargaModeloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaCargaModeloApplication.class, args);
		System.out.println("Server is running on Port 8080!");
	}
}
