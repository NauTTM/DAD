package com.example.HolaalumnosDAD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculadoraRestServidor {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraRestServidor.class, args);
	}
	
	@GetMapping("/suma")
	public String suma(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
	 System.out.println("SERVIDOR: El servidor realiza la suma de "+a+" mas: "+b);
	 return String.format("El resultado de la suma de "+a+" mas "+b+" es "+ (a+b));
	}
	
	@GetMapping("/resta")
	public String resta(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
	 System.out.println("SERVIDOR: El servidor realiza la resta de "+a+" mas: "+b);
	 return String.format("El resultado de la resta de "+a+" mas "+b+" es "+ (a-b));
	}
	
	@GetMapping("/division")
	public String division(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
	 if(b == 0) {
		 return String.format("SYNTAX ERROR");
	 }
	 System.out.println("SERVIDOR: El servidor realiza la division de "+a+" mas: "+b);
	 return String.format("El resultado de la division de "+a+" mas "+b+" es "+ (a/b));
	}
	
	@GetMapping("/multiplicacion")
	public String multiplicacion(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
	 System.out.println("SERVIDOR: El servidor realiza la multiplicación de "+a+" mas: "+b);
	 return String.format("El resultado de la multiplicación de "+a+" mas "+b+" es "+ (a*b));
	}

}
