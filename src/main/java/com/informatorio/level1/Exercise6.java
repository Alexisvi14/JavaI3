package com.informatorio.level1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {
    private static final Logger LOGGER = LogManager.getLogger(Exercise6.class);
    public static int Multiplication(int argumento,int argumento2) {
        int a = argumento;
        int b = argumento2;
        int result = a;
        //sumo a si mismo hasta que i sea mayor o igual a b
        for (int i = 1; i < b; i++) {
            result += a;
        }
        return result;
    }

        public static void main (String[]args) throws IOException {
            LOGGER.info("Ingrese 2 numeros enteros separados por espacio, segundo siendo potencia:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String entry = reader.readLine();
            //aca separo
            String[] separado = entry.split(" ");
            LOGGER.info("Los numeros ingresados son: ");

            for (String x : separado) {
                System.out.println(": " + x);
            }
            ;
            int a = Integer.parseInt(separado[0]);
            int b = Integer.parseInt(separado[1]);
            int save = a;
            if (b == 0) {
                save = 1;
            }
            for (int i = 1; i < b; i++) {
                save = Multiplication(save, a);
            }
            String write = "El resultado de la potencia es: ";
            String textResult = String.valueOf(save);
            if (a == 0 && b == 0) {
                textResult = "Indefinido!";
            }
            LOGGER.info(write + textResult);
        }
    }
