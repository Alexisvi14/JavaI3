package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise5.class);

    public static int Multiplication(int argument, int argument2){
        if (argument2 == 0){
            return 0;
        }
        int a = argument;
        int b = argument2;
        int result = a;

        for (int i=1; i<b;i++ ){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        LOGGER.info("Ingrese 2 numeros enteros separados por espacio :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        String entry = reader.readLine();
        String[] separado = entry.split(" ") ;
        LOGGER.info("Los numeros ingresados son: ");
        for (String x : separado ){
            LOGGER.info(": "+x);
        } ;
        int a = Integer.parseInt(separado[0]);
        int b = Integer.parseInt(separado[1]);
        int save = Multiplication(a, b);

        LOGGER.info("El resultado de la multiplicacion es: " + save);
    }

}
