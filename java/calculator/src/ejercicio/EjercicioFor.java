package ejercicio;

/*
Escribir un programa para un cajero que escanee un número dado de productos y calcule el costo total.

* */

import java.util.Scanner;

public class EjercicioFor {
    public static void main(String[] args) {
        System.out.println("Entre la cantidad de productos");
        Scanner scanner = new Scanner (System.in);
        int cantProductos = scanner.nextInt();

        double totalPrice = 0;
        for (int i =0; i < cantProductos; i++){
            System.out.println("Ingrese el precio del producto" +i);
            double price = scanner.nextDouble();
            totalPrice = totalPrice + price;
        }
          scanner.close();
        System.out.println("El precio total es de: "+totalPrice);
    }
}
