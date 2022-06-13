package com.informatorio.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja = new ArrayList();
        for (int i= 1; i<53; i++) baraja.add(i);
        System.out.println("Before: ");
        System.out.println(baraja);
        System.out.println("Reverse: ");
        Collections.reverse(baraja);
        System.out.println(baraja);
        Collections.shuffle(baraja, new Random());
        System.out.println("After shuffling: ");
        System.out.println(baraja);
    }
}
