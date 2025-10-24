package com.example;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejercicio6() {

        System.out.println("Ejercicio 6");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la zona de trabajo (centro/periferia/rural): ");
        String zona = sc.next();

        int tiempoEntrega = 0;

        if (zona.equalsIgnoreCase("centro")) {
            tiempoEntrega = 30;
        } else if (zona.equalsIgnoreCase("periferia")) {
            tiempoEntrega = 45;
        } else if (zona.equalsIgnoreCase("rural")) {
            tiempoEntrega = 60;
        }

        int horasDia = 8;
        int minutosDia = horasDia * 60;

        int entregas = minutosDia / tiempoEntrega;

        System.out.println("El conductor puede realizar " + entregas + " entregas en un día.");

        
    }
}
