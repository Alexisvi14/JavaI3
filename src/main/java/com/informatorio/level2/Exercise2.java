package com.informatorio.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        for (int i=1; i<6;i++){
            listaEnteros.add(i);
        }
        System.out.println(listaEnteros);
        // muevo ultimo elemento para dar espacio y añado un "0" a inicio de lista
        listaEnteros.add(listaEnteros.get(listaEnteros.size()-1));
        for (int i = listaEnteros.size()-1; 0<i;i--){
            listaEnteros.set(i, listaEnteros.get(i-1));
        }
        listaEnteros.set(0, 0);
        listaEnteros.add(6);
        System.out.println(listaEnteros);
    }
}
