package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class EjercicioArray {
    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        list.add("Lada");
        list.add("Bmw");
        list.add("Honda");

        for (int i =0; i < list.size();i ++){
            System.out.println(list.get(i));
        }

    }
}
