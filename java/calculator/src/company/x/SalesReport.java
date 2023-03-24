package company.x;

import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) {
        int cantVent;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de venta");
        cantVent = scanner.nextInt();
        scanner.close();

        if (cantVent >= 5){
            System.out.println("Felicidades cumplio su venta semanal");
        } else{
            int faltante = 5 - cantVent ;
            System.out.println("le faltaron " +faltante);
        }
    }
}
