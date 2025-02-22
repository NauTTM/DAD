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
public class CalculadoraRestCliente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RestTemplate restTemplate = new RestTemplate();
		while (true) {
            System.out.println("Introduce el tipo de operación (1-Suma, 2-Resta, 3-Multiplicacion, 4-Division) ");
            int opcion = scanner.nextInt();
            String operacion = null;
            
            if (opcion == 0) {
                System.out.println("Saliendo del programa.");
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
                continue;
            }
            
            if(opcion == 1) {
            	 operacion = "suma";
            }
            
            if(opcion == 2) {
            	 operacion = "resta";
            }
            
            if(opcion == 3) {
            	 operacion = "division";
            }
            
            if(opcion == 4) {
            	 operacion = "multiplicacion";
            }

            System.out.println("Introduce el primer número:");
            float numero1 = scanner.nextFloat();

            System.out.println("Introduce el segundo número:");
            float numero2 = scanner.nextFloat();

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
