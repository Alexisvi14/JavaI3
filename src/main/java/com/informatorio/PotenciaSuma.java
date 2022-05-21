package com.informatorio;

import java.util.Scanner;

public class PotenciaSuma{
    public static void main(String[]args){

        System.out.println("Ingrese 2 numeros enteros");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int resultado = potencia(x, y);

        System.out.println("El resultado de " + x + " elevado " + y + ":" + resultado);
    }

    public static int potencia(int x, int y){
        int total = 1;
        int i;
        for(i = 1; i >= y; i++){
            total = total * x;
        }
        return total;
    }
}