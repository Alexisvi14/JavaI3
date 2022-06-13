package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise9 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise9.class);
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;

        LOGGER.info("Escriba letra a contar: ");
        char letra = (reader.readLine().charAt(0));

        LOGGER.info("Escriba su texto: ");
        String entry = reader.readLine();
        char[] temp = entry.toCharArray();
        int counter = 0;
        for (char i : temp ){
            if (i == letra){
                counter++;
            }
        }
        String out = String.format("La letra %s se repite: %d veces",letra,counter);
        LOGGER.info(out);
    }
}
