package com.example.demo;

public class Conversor {

    public int convertir(String cadenaNumerica) throws NumeroNegativoException {
        
        int numero;

        try {
            numero = Integer.parseInt(cadenaNumerica);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El valor ingresado no es un número válido.");
        }

        if (numero < 0) {
            throw new NumeroNegativoException("Error: El número " + numero + " es negativo y no está permitido.");
        }

        return numero;
    }
}