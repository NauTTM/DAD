package com.example.HolaalumnosDAD;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class CalculadoraRestClienteMain {

	public static void main(String[] args) {
		VentanaCalculadora ventana=new VentanaCalculadora();
		ventana.configuracionVentana();
		Scanner scanner = new Scanner(System.in);
		RestTemplate restTemplate = new RestTemplate();
		while (true) {

            // Limpiar el buffer del scanner
            scanner.nextLine();

            // Construir la URL según la operación y parámetros
            String url = "http://localhost:8080/" + operacion +"?a=" + numero1 +"&b=" + numero2;
            System.out.println(url);

            // Realizar la petición HTTP tipo GET al servicio web Rest
            String resultado = restTemplate.getForObject(url, String.class);
            System.out.println(url);
            // Presentar por consola el resultado que devuelve el servicio web
            System.out.println("Resultado de la operación: " + resultado);
        }
	}
	
}
