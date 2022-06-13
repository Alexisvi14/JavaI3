package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise2.class);
    public static void main(String[] args) throws IOException {

        LOGGER.info("Ingrese 2 numeros enteros separados por espacio: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        //reading
        String entry = reader.readLine();
        //splitting
        String[] separado = entry.split(" ") ;
        LOGGER.info("Los numeros ingresados son: ");
        for (String x : separado ){
            LOGGER.info(": "+ x);
        } ;
        int a = Integer.parseInt(separado[0]);
        int b = Integer.parseInt(separado[1]);
        LOGGER.info("El resultado de la suma es: " +(a+b));
        LOGGER.info("El resultado de la resta es: " +(a-b));
        LOGGER.info("El resultado de la multiplicacion es: " +(a*b));
        LOGGER.info("El resultado de la division es: " +(a/b));
        LOGGER.info("El resultado del modulo es: " +(a % b));

    }
}
