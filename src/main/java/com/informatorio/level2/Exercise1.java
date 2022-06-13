package com.informatorio.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) throws Exception{
        System.out.print("Ingrese sus provincias favoritas separadas por un ¨-¨ : ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;

        String entry = reader.readLine();

        String[] separado = entry.split("-") ;
        ArrayList<String> ciudades= new ArrayList();
        for (String x : separado ){
            ciudades.add(x);
        } ;

        String out = "";
        for (int i = 0 ; i<ciudades.size(); i++){
            out = String.format("#%s - %s",(i+1),ciudades.get(i));
            System.out.println(out);
        }
    }
}