package com.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void ejercicio1() {
        System.out.println("Ejercicio 1");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el precio por producto: ");
        double precio = sc.nextDouble();

        double total = cantidad * precio;
        double descuento = 0;

        if (cantidad > 20) {
            descuento = 0.20;
        } else if (cantidad > 10) {
            descuento = 0.15;
        } else if (cantidad > 5) {
            descuento = 0.10;
        }

        double totalConDescuento = total - (total * descuento);

        if (totalConDescuento > 100000) {
            totalConDescuento -= totalConDescuento * 0.05;
        }

        System.out.println("El precio final a pagar es: $" + totalConDescuento);
        
    }
}