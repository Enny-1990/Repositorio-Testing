package company.x;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        double salario = 1000;
        double cantVentas;
        double bono = 150;
        double salarioMens =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de ventas realizadas");
        cantVentas = scanner.nextInt();

        if(cantVentas > 10){
            salario = salario + bono;
        }

        System.out.println("El salario del empleado es de " + salario);
    }
}
