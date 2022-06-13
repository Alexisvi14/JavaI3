package com.informatorio.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;

        //aca leo horas trabajadas
        System.out.print("Ingrese sus horas trabajadas separadas por un ¨-¨: ");
        String entry = reader.readLine();
        //aca separo horas trabajadas
        ArrayList<Integer> hours= new ArrayList<Integer>();
        for (String x : entry.split("-") ){
            hours.add(Integer.valueOf(x));
        } ;
        //aca leo valor de horas trabajadas
        System.out.print("Ingrese valor por horas trabajadas separadas por un ¨-¨: ");
        entry = reader.readLine();
        //aca separo valor de horas trabajadas
        ArrayList<Integer> value= new ArrayList<Integer>();
        for (String x : entry.split("-") ){
            value.add(Integer.valueOf(x));
        } ;
        if (hours.size() != value.size()){
            System.out.print("Tamaño de listas no iguales!!");
            return ;
        }
        //aca preparo salida
        ArrayList<Integer> out = new ArrayList<Integer>();
        for (int i=0 ; i<hours.size();i++){
            out.add((hours.get(i)*value.get(i)));
        }
        System.out.println(hours);
        System.out.println(value);
        System.out.println(out);
    }
}
