package com.example;

import java.util.Scanner;

public class Ejercicio8 {
    public static void ejercicio8() {

        System.out.println("Ejercicio 8");

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nPaciente " + i);

            System.out.print("Ingrese la temperatura (°C): ");
            double temperatura = sc.nextDouble();

            System.out.print("Ingrese la presión sistólica: ");
            int sistolica = sc.nextInt();

            System.out.print("Ingrese la presión diastólica: ");
            int diastolica = sc.nextInt();

            System.out.print("Ingrese nivel de dolor (1 a 10): ");
            int dolor = sc.nextInt();

            String clasificacion;

            if (temperatura > 38.5 || sistolica > 140 || diastolica > 90 || dolor >= 8) {
                clasificacion = "Urgente";
            } else if (temperatura >= 37.5 || dolor >= 5) {
                clasificacion = "Prioritario";
            } else {
                clasificacion = "Normal";
            }

            System.out.println("Clasificación del paciente: " + clasificacion);
        }

    
    }
}
