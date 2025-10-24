package com.example;

import java.util.Scanner;

public class Ejercicio3 {
    public static void ejercicio3() {

        System.out.println("Ejercicio 3");

        Scanner sc = new Scanner(System.in);
        String[] frutas = {"Manzanas", "Bananas", "Naranjas"};
        int[] inventario = new int[3];

        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingrese el inventario inicial de " + frutas[i] + ": ");
            inventario[i] = sc.nextInt();
        }

        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("\nDía " + dia);

            for (int i = 0; i < frutas.length; i++) {
                System.out.print("Ingrese la cantidad vendida de " + frutas[i] + ": ");
                int vendidas = sc.nextInt();
                inventario[i] -= vendidas;

                if (inventario[i] < 10) {
                    inventario[i] += 50;
                    System.out.println("Se realizó un pedido de 50 unidades de " + frutas[i]);
                }
            }
        }

        System.out.println("\nInventario final de la semana:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i] + ": " + inventario[i] + " unidades");
        }

        
    }
}
