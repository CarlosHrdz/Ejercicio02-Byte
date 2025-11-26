package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio02Application {

	public static void main(String[] args) throws NumeroNegativoException {
		Conversor miConversor = new Conversor();

        // Prueba 1: Positivo
        try {
            System.out.println("Intentando convertir 50...");
            int n = miConversor.convertir("50");
            System.out.println("Éxito: " + n);
        } catch (NumeroNegativoException e) {
            System.out.println("Capturamos la excepción esperada: " + e.getMessage());
        }

        // Prueba 2: Negativo
        try {
            System.out.println("\nIntentando convertir -20...");
            int n = miConversor.convertir("-20");
            System.out.println("Éxito: " + n);
        } catch (NumeroNegativoException e) {
            System.out.println("Capturamos la excepción esperada: " + e.getMessage());
        }

		// Prueba 3: No numérico
		try {
			System.out.println("\nIntentando convertir 'abc'...");
            int n = miConversor.convertir("abc");
			System.out.println("Éxito: " + n);
		} catch (IllegalArgumentException e) {
			System.out.println("Capturamos la excepción esperada: " + e.getMessage());
		}
	}

}
