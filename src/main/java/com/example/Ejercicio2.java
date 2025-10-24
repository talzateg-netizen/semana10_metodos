package com.example;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejercicio2() {

        System.out.println("Ejercicio 2");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = sc.nextDouble();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese sus gastos mensuales: ");
        double gastos = sc.nextDouble();

        if (ingresos >= 2000000 && edad >= 18 && edad <= 65 && gastos <= ingresos * 0.7) {
            double creditoMaximo = ingresos * 5;
            System.out.println("Crédito aprobado. Monto máximo: $" + creditoMaximo);
        } else {
            System.out.println("No cumple con los requisitos para el crédito.");
        }

    }
}
