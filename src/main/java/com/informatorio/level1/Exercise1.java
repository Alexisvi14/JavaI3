package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise1.class);

    public static void main(String[] args) throws IOException {

        LOGGER.info("Escriba su nombre: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        String entry = reader.readLine();
        String out = String.format("Hola %s!!!", entry);
        LOGGER.info(out);
    }
}
