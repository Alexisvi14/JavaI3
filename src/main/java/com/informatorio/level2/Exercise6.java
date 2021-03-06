package com.informatorio.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise6 {

    public static void main(String[] args) {
        //Inicializo el hashset
        Set<Empleado> empleados = new HashSet();
        //Inicializar HashMap
        Map<Integer, Integer> sueldos = new HashMap();
        //Cargo Empleados de prueba
        empleados.add(new Empleado(12345678, "Marco Crazy", 6, 200));
        empleados.add(new Empleado(39318541, "Alexis Villamayor", 8, 300));
        //Cargo sueldos
        for (Empleado i : empleados) {
            sueldos.put(i.dni, (i.horasTrabajadas*i.valorPorHora));
        }

        System.out.println("Sueldo para dni 39318541: "+sueldos.get(39318541));
    }
}
