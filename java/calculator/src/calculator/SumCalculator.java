package calculator;

/*
* Sumar dos números..
* */

import java.util.Scanner;

public class SumCalculator {
    public static void main (String arg[]){
        System.out.println ("Entre el número uno");
        Scanner scanner = new Scanner(System.in);

        //Ingresar el número dos
        double number1 = scanner.nextDouble();
        System.out.println ("Entre el número dos");

        double number2 = scanner.nextDouble();

        scanner.close();

        //Sumar los dos números
        double suma = number1 + number2;


        //Resta los dos números
        double subtract = number1 - number2;
        System.out.println("La Resta es de " +subtract );
    }
}
