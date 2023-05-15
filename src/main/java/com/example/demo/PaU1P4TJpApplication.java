package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaU1P4TJpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaU1P4TJpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Este proyecto sera clonado y guardado en un nuevo branch");
		/*
		 * modificación para la creación del branch Tarea3
		 */

		System.out.println("este comentario se modifico en el branch tarea3");
	}

}
