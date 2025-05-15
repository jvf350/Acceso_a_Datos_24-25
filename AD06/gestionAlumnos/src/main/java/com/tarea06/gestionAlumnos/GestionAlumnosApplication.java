package com.tarea06.gestionAlumnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//Lanza la aplicación
@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.tarea06.gestionAlumnos.repository")
public class GestionAlumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionAlumnosApplication.class, args);
	}

}
