package calificacion;

/*Escribir un programa para ingresar las calificaciones de los estudiantes (1-100)
y mostrar su evaluación representada de la siguiente manera*/

import java.util.Scanner;

public class calificacionEstudiante {
    public static void main(String[] args) {
        int nota;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        nota = scanner.nextInt();

        if(nota > 90){
            System.out.println(" Su nota es MB");
        }else if(nota > 80){
            System.out.println(" Su nota es B");
        }else if(nota > 60 ){
            System.out.println("Su nota es R");
        } else{
            System.out.println("Su calificación es M");
        }
    }
}
