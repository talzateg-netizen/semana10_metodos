package com.example;

import java.util.Scanner;

public class Ejercicio9 {
    public static void ejercicio9() {

        System.out.println("Ejercicio 9");

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEstudiante " + i);

            System.out.print("Ingrese la nota de parciales (0-5): ");
            double parciales = sc.nextDouble();

            System.out.print("Ingrese la nota del proyecto final (0-5): ");
            double proyecto = sc.nextDouble();

            System.out.print("Ingrese la nota de participación (0-5): ");
            double participacion = sc.nextDouble();

            double promedio = (parciales * 0.3) + (proyecto * 0.4) + (participacion * 0.3);
            String resultado;

            if (promedio >= 4.0) {
                resultado = "Aprueba";
            } else if (promedio >= 3.5) {
                resultado = "Va a supletorio";
            } else {
                resultado = "Reprueba";
            }

            System.out.println("Promedio final: " + promedio);
            System.out.println("Resultado: " + resultado);
        }

       
    }
}
