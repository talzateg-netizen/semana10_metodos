package com.example;

import java.util.Scanner;

public class Ejercicio4 {
    public static void ejercicio4() {

        System.out.println("Ejercicio 4");

        Scanner sc = new Scanner(System.in);

        int tiempoBus = 20;
        int tiempoMetro = 15;
        int tiempoCaminar = 10;

        System.out.print("¿Hay tráfico pesado? (si/no): ");
        String trafico = sc.next();

        System.out.print("¿Está lloviendo? (si/no): ");
        String lluvia = sc.next();

        if (trafico.equalsIgnoreCase("si")) {
            tiempoBus += tiempoBus * 0.5;
        }

        if (lluvia.equalsIgnoreCase("si")) {
            tiempoCaminar += tiempoCaminar;
        }

        int tiempoTotal = tiempoBus + tiempoMetro + tiempoCaminar;

        System.out.println("El tiempo total de viaje es: " + tiempoTotal + " minutos");

        
    }
}