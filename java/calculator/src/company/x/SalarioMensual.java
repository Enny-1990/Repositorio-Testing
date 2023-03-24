package company.x;

import java.util.Scanner;

public class SalarioMensual {

    public static void main (String args[]){


        Scanner scanner = new Scanner(System.in);

        //Obtener el nombre del empleado
        System.out.println("Ingrese su nombre de empleado");
        String name = scanner.nextLine();

        //Obtener la cantidad de horas trabajadas
        System.out.println("Ingrese la cantidad de horas trabajadas en el mes");
        double horas = scanner.nextDouble();

        //Obtener el valor del precio por hora
        System.out.println("Colocar rata del empleado");
        double rata = scanner.nextDouble();

        //Calculando el salario mensual del empleado
        double salarioMens = horas * rata;

        System.out.println("El salario del empleado " +name+" es de "+ salarioMens);
    }
}
