package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ConversorTest {

    @Test
    void convertir_deberiaRetornarEnteroCuandoNumeroEsPositivo() throws NumeroNegativoException {
        Conversor conversor = new Conversor();

        int resultado = conversor.convertir("123");

        assertEquals(123, resultado);
    }

    @Test
    void convertir_deberiaLanzarNumeroNegativoExceptionCuandoNumeroEsNegativo() {
        Conversor conversor = new Conversor();

        assertThrows(NumeroNegativoException.class, () -> conversor.convertir("-5"));
    }

    @Test
    void convertir_deberiaLanzarIllegalArgumentExceptionCuandoCadenaNoEsNumeroValido() {
        Conversor conversor = new Conversor();

        assertThrows(IllegalArgumentException.class, () -> conversor.convertir("abc"));
    }
}


