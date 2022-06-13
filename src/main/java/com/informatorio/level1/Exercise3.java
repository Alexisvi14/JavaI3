package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise3.class);
    public static void main(String[] args) throws IOException {
        LOGGER.info("Ingrese un solo numero entero para iterar: ");
        // before reading
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        //reading
        String entry = reader.readLine();
        int entryNumber = Integer.parseInt(entry) + 1;
        String out = "";
        for (int i = 1; i < entryNumber; i++){
            out = out +" "+ i;
            LOGGER.info(out);
        }

    }
}
