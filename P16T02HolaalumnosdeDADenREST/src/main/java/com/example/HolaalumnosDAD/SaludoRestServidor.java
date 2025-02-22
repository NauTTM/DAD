package com.example.HolaalumnosDAD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SaludoRestServidor {

	public static void main(String[] args) {
		SpringApplication.run(SaludoRestServidor.class, args);
	}
	
	@GetMapping("/saludoDAD")
	public String saludoDAD() {
	System.out.println("SERVIDOR: El servidor ha atendido una peticion de saludo con ruta /saludoDAD");
	return String.format("Hola alumnos de DAD");
	}

}
