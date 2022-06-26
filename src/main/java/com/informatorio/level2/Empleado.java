package com.informatorio.level2;

public class Empleado {
    public String nya;
        public int dni;
        public int horasTrabajadas;
        public int valorPorHora;

        public Empleado(int dni, String nya, int horasTrabajadas, int valorPorHora){
            this.nya = nya;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }

        @Override
        public String toString() {
            return String.valueOf(this.dni)+
                    " - "+this.nya;
        }
    }
