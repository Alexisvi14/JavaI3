package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise4 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise4.class);

    public static int Factorial(int argument){
        if (argument <= 1){
            return 1;
        }
        else {
            int carry=argument-1;
            return argument * Factorial(carry);
        }
    }
    public static void main(String[] args) throws Exception {
        LOGGER.info("Ingrese un solo numero entero del cual obtener factorial: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        String entry = reader.readLine();

        int entryNumber = Integer.parseInt(entry);

        int b = Exercise4.Factorial(entryNumber) ;
        LOGGER.info(String.format("El factorial de %s es: %d", entry, b));

    }
}
