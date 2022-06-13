package com.informatorio.level2;

import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Luca");
        students.add("Juanca");
        students.add("Conrado");
        students.add("Yanil");
        students.add("Agustin");
        students.add("Gaston");
        students.add("Zacha");
        students.add("Cristian");
        students.add("Gonzalo");
        students.add("Brian");
        students.add("Hugo");
        students.add("Liliana");
        ArrayList<String> class1 = new ArrayList<String>(students.subList(0, 4));
        ArrayList<String> class2 = new ArrayList<String>(students.subList(4, 8));
        ArrayList<String> class3 = new ArrayList<String>(students.subList(8, 12));
        System.out.println("Todos los estudiantes: " + students);
        System.out.println("Clase 1: "+ class1);
        System.out.println("Clase 2: "+ class2);
        System.out.println("Clase 3: "+ class3);
    }
}