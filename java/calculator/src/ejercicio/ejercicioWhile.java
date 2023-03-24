package ejercicio;

/*Escribir un programa que valide el ingreso de la cantidad de horas trabajadas por un empleado en la semana
* La cantidad de hora trabajadas en la semana es de 40
* */

import java.util.Scanner;

public class ejercicioWhile {
    public static void main(String[] args) {
        int maxHora = 40;
        int hora;

        System.out.println("Ingrese la cantidad de horas trabajas");
        Scanner scanner = new Scanner (System.in);
        hora = scanner.nextInt();


        while (hora > maxHora ){
            System.out.println("La cantidad de horas no es válida. El máximo de hora es de: " +maxHora + " Por favor ingrese nuevamente la cantidad" +
                    " de horas trabajadas");
            hora = scanner.nextInt();
        }
        System.out.println("Usted ha ingresado " +hora);
    }
}
