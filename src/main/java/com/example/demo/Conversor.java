package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Conversor {

    private static final Logger log = LoggerFactory.getLogger(Conversor.class);

    public int convertir(String cadenaNumerica) throws NumeroNegativoException {

        log.info("Intentando convertir la cadena: '{}'", cadenaNumerica);

        int numero;

        try {
            numero = Integer.parseInt(cadenaNumerica);
            log.debug("Conversión exitosa, valor entero: {}", numero);
        } catch (NumberFormatException e) {
            log.error("Error al convertir la cadena '{}' a entero", cadenaNumerica, e);
            throw new IllegalArgumentException("El valor ingresado no es un número válido.");
        }

        if (numero < 0) {
            log.warn("Se detectó un número negativo: {}", numero);
            throw new NumeroNegativoException("Error: El número " + numero + " es negativo y no está permitido.");
        }

        log.info("Conversión completada correctamente. Resultado: {}", numero);
        return numero;
    }
}