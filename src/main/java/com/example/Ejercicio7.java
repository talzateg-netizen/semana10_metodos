package com.example;

import java.util.Scanner;

public class Ejercicio7 {
    public static void ejercicio7() {

        System.out.println("Ejercicio 7");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los minutos de cardio: ");
        int cardio = sc.nextInt();

        System.out.print("Ingrese los minutos de pesas: ");
        int pesas = sc.nextInt();

        System.out.print("Ingrese los minutos de yoga: ");
        int yoga = sc.nextInt();

        int calorias = (cardio * 10) + (pesas * 8) + (yoga * 5);
        int puntos = 0;

        if (calorias > 500) {
            puntos = 50;
        }

        System.out.println("Calorías totales quemadas: " + calorias);
        System.out.println("Puntos ganados: " + puntos);

        
    }
}
