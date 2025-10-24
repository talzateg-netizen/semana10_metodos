package com.example;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ejercicio5() {

        System.out.println("Ejercicio 5");

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Hay mal clima? (si/no): ");
        String clima = sc.next();
        boolean malClima = clima.equalsIgnoreCase("si");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nVuelo " + i);
            System.out.print("Ingrese el estado base del vuelo (1=A tiempo, 2=Retrasado, 3=Cancelado): ");
            int estado = sc.nextInt();
            int retraso = 0;

            if (estado == 2) {
                System.out.print("Ingrese minutos de retraso: ");
                retraso = sc.nextInt();
            }

            if (malClima && estado != 3) {
                retraso += 30;
            }

            if (estado == 3) {
                System.out.println("El vuelo está CANCELADO.");
            } else if (retraso > 15) {
                System.out.println("El vuelo está RETRASADO (" + retraso + " minutos).");
            } else {
                System.out.println("El vuelo está A TIEMPO.");
            }
        }

        
    }
}