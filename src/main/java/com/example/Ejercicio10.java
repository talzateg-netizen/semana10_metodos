package com.example;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejercicio10() {

        System.out.println("Ejercicio 10");

        Scanner sc = new Scanner(System.in);

        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("\nDía " + dia);

            System.out.print("Ingrese la humedad del suelo (%): ");
            double humedad = sc.nextDouble();

            System.out.print("Ingrese la temperatura (°C): ");
            double temperatura = sc.nextDouble();

            System.out.print("¿Llovió en las últimas 24 horas? (si/no): ");
            String lluvia = sc.next();

            if (lluvia.equalsIgnoreCase("si")) {
                System.out.println("No se activa el riego (ha llovido).");
            } else if (humedad < 30) {
                System.out.println("Riego activado por 60 minutos.");
            } else if (temperatura > 25 && humedad < 50) {
                System.out.println("Riego activado por 30 minutos.");
            } else {
                System.out.println("No se requiere riego.");
            }
        }

        
    }
}