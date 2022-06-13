package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise8 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise8.class);
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        LOGGER.info("Escriba su nombre y apellido: ");
        String nya = reader.readLine();

        LOGGER.info("Escriba su edad: ");
        String edad = reader.readLine();

        LOGGER.info("Escriba su direccion :");
        String direccion = reader.readLine();

        LOGGER.info("Escriba su ciudad :");
        String ciudad = reader.readLine();


        String out = String.format("%s - %s - %s - %s",ciudad, direccion, edad, nya);
        LOGGER.info(out);

    }
}
