package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise7 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise7.class);
    public static String Uppercase(String argument){
        char[] chain = argument.toCharArray();
        String out = "";

        for (char i : chain){
            if ('a' <= i && i <='z'){

                out = out + ((char) ((int) i - 32));
            }else{
                out = out + i;
            }
        }
        return out;
    }
    public static void main(String[] args) throws Exception{
        LOGGER.info("Escriba algo :");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        //aca leo
        String entry = reader.readLine();

        entry = Uppercase(entry);

        String out = String.format("la salida es: %s", entry);

        LOGGER.info(out);
    }
}
